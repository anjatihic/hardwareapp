package hr.tvz.tihic.hardwareapp.review;

import java.util.List;

public interface ReviewService {
    List<ReviewDTO> findAll();

    List<ReviewDTO> findByHardwareCode(String code);
}
