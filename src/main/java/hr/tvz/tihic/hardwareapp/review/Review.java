package hr.tvz.tihic.hardwareapp.review;

import hr.tvz.tihic.hardwareapp.hardware.Hardware;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "review")
public class Review  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String reviewText;
    @Enumerated(EnumType.STRING)
    private Rating rating;

    @JoinColumn(name = "hardwareId")
    @ManyToOne()
    private Hardware hardware;

    public enum Rating{
        ONE, TWO, THREE, FOUR, FIVE
    }

    public Review(String title, String reviewText, Rating rating, Hardware hardware) {
        this.title = title;
        this.reviewText = reviewText;
        this.rating = rating;
        this.hardware = hardware;
    }
}
