package hr.tvz.tihic.hardwareapp.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>{
    List<Review> findAll();

    List<Review> findAllByHardware_Code(String code);
    List<Review> findAllByReviewTextContainingIgnoreCase(String filter);
}
