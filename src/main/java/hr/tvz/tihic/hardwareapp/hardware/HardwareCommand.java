package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class HardwareCommand {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Code cannot be empty")
    @PositiveOrZero(message = "Code number cannot be negative")
    private String code;

    @NotBlank(message = "Price cannot be empty")
    @PositiveOrZero(message = "Price cannot be negative")
    private double price;

    @NotBlank(message = "Number of available hardware cannot be empty")
    @PositiveOrZero(message = "Number of available hardware cannot be below zero")
    private Integer numberAvailable;

    @NotBlank(message = "Hardware type cannot be empty")
    private Hardware.Type type;

    public String getName() {
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

    public Hardware.Type getType() {
        return type;
    }

    public void setType(Hardware.Type type) {
        this.type = type;
    }
}
