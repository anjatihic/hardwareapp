package hr.tvz.tihic.hardwareapp.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>, CrudRepository<Review, Long> {
    List<Review> findAll();

    List<Review> findAllByHardware_Code(String code);
}
