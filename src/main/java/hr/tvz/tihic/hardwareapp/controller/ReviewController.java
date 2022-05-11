package hr.tvz.tihic.hardwareapp.controller;

import hr.tvz.tihic.hardwareapp.hardware.HardwareCommand;
import hr.tvz.tihic.hardwareapp.hardware.HardwareDTO;
import hr.tvz.tihic.hardwareapp.hardware.HardwareService;
import hr.tvz.tihic.hardwareapp.review.ReviewDTO;
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

    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReviewDTO> getAllReviews(){
        return reviewService.findAll();
    }

    @GetMapping(params = "code")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReviewDTO> getAllReviewsByHardwareCode(@RequestParam String code){
        return reviewService.findAllByHardwareCode(code);
    }
}
