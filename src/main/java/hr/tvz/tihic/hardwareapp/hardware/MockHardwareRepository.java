package hr.tvz.tihic.hardwareapp.hardware;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MockHardwareRepository implements HardwareRepository {
    private List<Hardware> MOCKED_HARDWARE = new ArrayList<>(Arrays.asList(
            new Hardware("Intel Core i9-12900E", "1234", 494.00, 10, Hardware.Type.CPU),
            new Hardware("Kingston FURY Beast DDR3 Memory 8GB", "1235", 90.98, 3, Hardware.Type.STORAGE),
            new Hardware("NVIDIA GeForce GTX 1080", "1236", 599.99, 2, Hardware.Type.GPU))
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
    public Optional<Hardware> update(String code, Hardware hardware){
        Hardware foundHardware = MOCKED_HARDWARE.stream()
                .filter(x -> code.equals(x.getCode()))
                .findAny()
                .orElse(null);

        if(foundHardware != null){
            MOCKED_HARDWARE.remove(foundHardware);
            MOCKED_HARDWARE.add(hardware);
            return Optional.of(hardware);
        }else{
            return Optional.empty();
        }

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
