package hr.tvz.tihic.hardwareapp.review;

import hr.tvz.tihic.hardwareapp.hardware.Hardware;
import lombok.Data;

@Data
public class Review {
    private String code;
    private Rating rating;
    private String name;
    private String description;

    public Review(String code, Rating rating, String name, String description) {
        this.code = code;
        this.rating = rating;
        this.name = name;
        this.description = description;
    }
}
