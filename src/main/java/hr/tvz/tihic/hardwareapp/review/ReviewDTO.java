package hr.tvz.tihic.hardwareapp.review;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewDTO {
    private String title;
    private String reviewText;
    private Rating rating;

    public enum Rating{
        ONE, TWO, THREE, FOUR, FIVE
    }
}
