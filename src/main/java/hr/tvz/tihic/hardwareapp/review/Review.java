package hr.tvz.tihic.hardwareapp.review;

import lombok.Data;

@Data
public class Review {

    private long id;
    private String title;
    private String reviewText;
    private Rating rating;

    public enum Rating{
        ONE, TWO, THREE, FOUR, FIVE
    }

    public Review(long id, String title, String reviewText, Rating rating) {
        this.id = id;
        this.title = title;
        this.reviewText = reviewText;
        this.rating = rating;
    }
}
