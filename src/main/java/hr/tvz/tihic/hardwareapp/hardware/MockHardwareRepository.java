package hr.tvz.tihic.hardwareapp.hardware;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MockHardwareRepository implements HardwareRepository {
    private List<Hardware> MOCKED_HARDWARE = new ArrayList<>(Arrays.asList(
            new Hardware("Intel Core i7-12700K Desktop Processor 12", "001CPU", 374, 10, Hardware.Type.CPU),
            new Hardware("Nvidia GeForce GTX 1080 8GB", "001GPU", 800, 4, Hardware.Type.GPU),
            new Hardware("ASUS Prime Z590-A LGA 1200", "001MBO", 249.99, 23, Hardware.Type.MBO),
            new Hardware("Corsair Vengeance LPX 16GB", "001RAM", 77.99, 16, Hardware.Type.RAM),
            new Hardware("Seagate 16TB HDD", "001STO", 539, 3, Hardware.Type.STORAGE))
    );

    @Override
    public List<Hardware> findAll(){
        return MOCKED_HARDWARE;
    }
    @Override
    public Optional<Hardware> findByCode(final String code){
        return MOCKED_HARDWARE.stream().filter(it -> Objects.equals(it.getCode(), code)).findAny();
    }

    @Override
    public Optional<Hardware> post(final Hardware hardware){
        if (MOCKED_HARDWARE.stream().anyMatch(x -> x.getCode().equals(hardware.getCode()))){
            return Optional.empty();
        }
        else {
            MOCKED_HARDWARE.add(hardware);
            return Optional.of(hardware);
        }
    }
    @Override
    public List<Hardware> getByFilter(GetFilterCommand filterCommand){
        return null;
    }

    @Override
    public void delete(String code){
        Hardware foundHardware = MOCKED_HARDWARE.stream()
                                    .filter(hardware -> code.equals(hardware.getCode()))
                                    .findAny()
                                    .orElse(null);
        MOCKED_HARDWARE.remove(foundHardware);
    }
}
