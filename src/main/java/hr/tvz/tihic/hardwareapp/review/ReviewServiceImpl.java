package hr.tvz.tihic.hardwareapp.review;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll(){
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> findByCode(String code){
        return reviewRepository.findByCode(code);
    }
}
