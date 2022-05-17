package hr.tvz.tihic.hardwareapp.review;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewDTO {
    private String title;
    private String text;
    private Review.Rating rating;
}
