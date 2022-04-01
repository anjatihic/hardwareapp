package hr.tvz.tihic.hardwareapp.hardware;

import java.util.List;

//communication with business logic
public interface HardwareService {
    List<HardwareDTO> findAll();
    HardwareDTO findByCode(String code);
}
