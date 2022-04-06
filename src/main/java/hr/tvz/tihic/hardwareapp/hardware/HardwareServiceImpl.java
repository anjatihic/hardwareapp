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
    public Optional<HardwareDTO> findByCode(String code){
        return hardwareRepository.findByCode(code).map(this::mapHardwareToDTO);
    }

    @Override
    public Optional<HardwareDTO> post(final HardwareCommand hardwareCommand){
        return hardwareRepository.post(commandToHardware(hardwareCommand)).map(this::mapHardwareToDTO);
    }

    @Override
    public Optional<HardwareDTO> update(String code, HardwareCommand hardwareCommand){
        return hardwareRepository.update(code, commandToHardware(hardwareCommand)).map(this::mapHardwareToDTO);
    }

    @Override
    public void delete(String code){
        hardwareRepository.delete(code);
    }

    private Hardware commandToHardware(HardwareCommand hardwareCommand){
        return new Hardware(hardwareCommand.getName(),
                hardwareCommand.getCode(),
                hardwareCommand.getPrice(),
                hardwareCommand.getNumberAvailable(),
                Hardware.Type.valueOf(hardwareCommand.getType().toUpperCase()));
    }

    private HardwareDTO mapHardwareToDTO(final Hardware hardware){
        return new HardwareDTO(hardware.getName(), hardware.getPrice());
    }



}
