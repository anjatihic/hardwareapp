package hr.tvz.tihic.hardwareapp.controller;

import hr.tvz.tihic.hardwareapp.hardware.HardwareCommand;
import hr.tvz.tihic.hardwareapp.hardware.HardwareDTO;
import hr.tvz.tihic.hardwareapp.hardware.HardwareService;
import hr.tvz.tihic.hardwareapp.hardware.PriceUpdateCommand;
import hr.tvz.tihic.hardwareapp.review.Review;
import hr.tvz.tihic.hardwareapp.review.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Review> getAllReviews(){
        return reviewService.findAll();
    }

    @GetMapping("/{code}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Review> getReviewByCode(@PathVariable final String code){

        return reviewService.findByCode(code)
                .map(
                        review -> ResponseEntity.status(HttpStatus.OK).body(review)
                )
                .orElseGet(
                        () -> ResponseEntity.notFound().build()
                );
    }
}
