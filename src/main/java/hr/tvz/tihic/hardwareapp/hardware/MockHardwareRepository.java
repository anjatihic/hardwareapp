package hr.tvz.tihic.hardwareapp.hardware;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MockHardwareRepository implements HardwareRepository {
    private final List<Hardware> MOCKED_HARDWARE = Arrays.asList(
            new Hardware("Intel Core i9-12900E", "1234", 494.00, 10, Hardware.Type.CPU),
            new Hardware("Kingston FURY Beast DDR3 Memory 8GB", "1235", 90.98, 3, Hardware.Type.STORAGE),
            new Hardware("NVIDIA GeForce GTX 1080", "1236", 599.99, 2, Hardware.Type.GPU)
    );

    @Override
    public List<Hardware> findAll(){
        return MOCKED_HARDWARE;
    }
    @Override
    public Optional<Hardware> findByCode(final String code){
        return MOCKED_HARDWARE.stream().filter(it -> Objects.equals(it.getCode(), code)).findAny();
    }
}
