package hr.tvz.tihic.hardwareapp.review;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewDTO {
    private String title;
    private String reviewText;
    private Review.Rating rating;
}
