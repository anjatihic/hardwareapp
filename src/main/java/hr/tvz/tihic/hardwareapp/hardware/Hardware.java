package hr.tvz.tihic.hardwareapp.hardware;

import hr.tvz.tihic.hardwareapp.review.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "hardware")
public class Hardware {
    private String name;

    private String code;

    private double price;
    private Integer numberAvailable;
    private Type type;

    @OneToMany(mappedBy = "hardware", targetEntity = Review.class, fetch = FetchType.EAGER)
    private List<Review> reviews;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    public enum Type {
        CPU, GPU, MBO, RAM, STORAGE, OTHER
    }

    public Hardware(String name, String code, double price, Integer numberAvailable, Type type) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.numberAvailable = numberAvailable;
        this.type = type;
    }

    public Hardware(String name, String code, double price, Integer numberAvailable, Type type, long id) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.numberAvailable = numberAvailable;
        this.type = type;
        this.id = id;
    }
}
