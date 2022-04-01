package hr.tvz.tihic.hardwareapp.hardware;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService {
    private final HardwareRepository hardwareRepository;

    public HardwareServiceImpl(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    @Override
    public List<HardwareDTO> findAll(){
        return hardwareRepository.findAll().stream().map(this::mapHardwareToDTO).collect(Collectors.toList());
    }

    @Override
    public HardwareDTO findByCode(String code){
        return hardwareRepository.findByCode(code).map(this::mapHardwareToDTO).orElse(null);
    }

    @Override
    public Optional<HardwareDTO> save(final HardwareCommand hardwareCommand){
        return(hardwareRepository.save(mapCommandToHardware(hardwareCommand)).map(this::mapHardwareToDTO));
    }

    private HardwareDTO mapHardwareToDTO(final Hardware hardware){
        return new HardwareDTO(hardware.getName(), hardware.getPrice());
    }

    private Hardware mapCommandToHardware(final HardwareCommand hardwareCommand){
        return new Hardware(hardwareCommand.getName(),
                            hardwareCommand.getCode(),
                            hardwareCommand.getPrice(),
                            hardwareCommand.getNumberAvailable(),
                            Hardware.Type.valueOf(hardwareCommand.getType().toUpperCase()));
    }

}
