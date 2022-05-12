package hr.tvz.tihic.hardwareapp.controller;

import hr.tvz.tihic.hardwareapp.review.ReviewDTO;
import hr.tvz.tihic.hardwareapp.review.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("review")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReviewDTO> getAllReviews(){
        return reviewService.findAll();
    }

    @GetMapping("/{code}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReviewDTO> getByHardwareCode(@PathVariable String code){
        return reviewService.findByHardwareCode(code);
    }

    @GetMapping(params = "filter")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReviewDTO> getReviewsByFilter(@RequestParam String filter){
        return reviewService.findByTextFilter(filter);
    }
}