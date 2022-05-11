package hr.tvz.tihic.hardwareapp.hardware;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hardware")
public class Hardware {
    private String name;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "HARDWARE_CODE")
    private String code;
    private double price;
    private Integer numberAvailable;
    private Type type;

    public enum Type {
        CPU, GPU, MBO, RAM, STORAGE, OTHER
    }
}
