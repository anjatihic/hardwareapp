package hr.tvz.tihic.hardwareapp.hardware;

import java.util.List;
import java.util.Optional;

//communication with repository (e.g. database, MockHardware)
public interface HardwareRepository {
    List<Hardware> findAll();
    Optional<Hardware> findByCode(String code);
    Optional<Hardware> post(Hardware hardware);
    void delete(String code);
    Optional<Hardware> updatePrice (String code, PriceUpdateCommand hardware);
}
