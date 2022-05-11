package hr.tvz.tihic.hardwareapp.review;

import hr.tvz.tihic.hardwareapp.hardware.Hardware;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String reviewText;
    private Rating rating;
    private String hardwareCode;
    @ManyToOne
    @JoinColumn(name = "HARDWARE_COLUMN")
    private Hardware hardware;

    public enum Rating{
        ONE, TWO, THREE, FOUR, FIVE
    }
}
