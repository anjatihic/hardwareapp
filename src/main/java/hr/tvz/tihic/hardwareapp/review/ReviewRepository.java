package hr.tvz.tihic.hardwareapp.review;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository {
    List<Review> findAll();
    Optional<Review> findByCode(String code);
}
