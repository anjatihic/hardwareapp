package hr.tvz.tihic.hardwareapp.hardware;

import org.springframework.context.annotation.Primary;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Primary
@Repository
public class JdbcHardwareRepository implements HardwareRepository {
    private static final String SELECT_ALL = "SELECT * FROM Hardware";

    private final JdbcTemplate jdbc;
    private final SimpleJdbcInsert inserter;

    public JdbcHardwareRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
        this.inserter = new SimpleJdbcInsert(jdbc)
                .withTableName("Hardware");
    }
    @Override
    public List<Hardware> findAll(){
        return List.copyOf(jdbc.query(SELECT_ALL, this::mapRowToHardware));
    }

    @Override
    public Optional<Hardware> findByCode(String code){
        try {
            return Optional.ofNullable(
                    jdbc.queryForObject(SELECT_ALL + " WHERE code = ?", this::mapRowToHardware, code)
            );
        }catch (EmptyResultDataAccessException e){
            return Optional.empty();
        }
    }

    @Override
    public Optional<Hardware> post(Hardware hardware){
        try {
            saveHardwareDetails(hardware);
            return Optional.of(hardware);
        }catch (DuplicateKeyException e){
            return Optional.empty();
        }
    }

    @Override
    public void delete(String code){
        jdbc.update("DELETE FROM Hardware WHERE code = ?", code);
    }


    private Hardware mapRowToHardware(ResultSet resultSet, int rowNum) throws SQLException{
        return new Hardware(
                resultSet.getString("name"),
                resultSet.getString("code"),
                resultSet.getDouble("price"),
                resultSet.getInt("numberAvailable"),
                Hardware.Type.valueOf(resultSet.getString("type").toUpperCase())
        );
    }

    private void saveHardwareDetails(Hardware hardware){
        Map<String, Object> values = new HashMap<>();

        values.put("code", hardware.getCode());
        values.put("name", hardware.getName());
        values.put("price", hardware.getPrice());
        values.put("numberAvailable", hardware.getNumberAvailable());
        values.put("type", hardware.getType());

        inserter.execute(values);
    }
}
