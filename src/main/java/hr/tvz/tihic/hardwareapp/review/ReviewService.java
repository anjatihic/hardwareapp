package hr.tvz.tihic.hardwareapp.review;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<Review> findAll();
    Optional<Review> findByCode(String code);
}
