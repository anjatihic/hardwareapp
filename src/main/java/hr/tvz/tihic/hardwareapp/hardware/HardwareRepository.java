package hr.tvz.tihic.hardwareapp.hardware;

import java.util.List;
import java.util.Optional;

//communication with repository (e.g. database, MockHardware)
public interface HardwareRepository {
    List<Hardware> findAll();
    Optional<Hardware> findByCode(String code);
}
