package hr.tvz.tihic.hardwareapp.hardware;

import java.util.List;
import java.util.Optional;

//communication with business logic
public interface HardwareService {
    List<HardwareDTO> findAll();
    HardwareDTO findByCode(String code);
    Optional<HardwareDTO> save(HardwareCommand hardwareCommand);
}
