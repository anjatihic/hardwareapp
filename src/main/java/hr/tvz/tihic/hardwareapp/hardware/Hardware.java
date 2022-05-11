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
@Table(name = "hardware")
public class Hardware {
    private String name;

    @Id
    @Column(name = "HARDWARE_CODE")
    private String code;

    private double price;
    private Integer numberAvailable;
    private Type type;

    @OneToMany(mappedBy = "hardware")
    private List<Review> reviews;

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
}
