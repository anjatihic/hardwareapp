package hr.tvz.tihic.hardwareapp.hardware;

import java.util.List;
import java.util.Optional;

//communication with business logic
public interface HardwareService {
    List<HardwareDTO> findAll();
    Optional<HardwareDTO> findByCode(String code);
    Optional<HardwareDTO> post(HardwareCommand hardwareCommand);
    void delete(String code);
    Optional<HardwareDTO> updatePrice(String code, PriceUpdateCommand hardwareCommand);
}

