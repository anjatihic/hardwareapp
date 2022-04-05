package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class HardwareCommand {

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Code cannot be empty")
    private String code;

    @NotNull(message = "Price cannot be empty")
    @PositiveOrZero(message = "Price cannot be negative")
    private double price;

    @NotNull(message = "Number of available hardware cannot be empty")
    @PositiveOrZero(message = "Number of available hardware cannot be negative")
    private Integer numberAvailable;

    @NotEmpty(message = "Hardware type cannot be empty")
    private String type;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
