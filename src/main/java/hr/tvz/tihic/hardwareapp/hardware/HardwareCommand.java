package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.*;

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
    private Integer stock;

    @NotEmpty(message = "Hardware type cannot be empty")
    @Pattern(message = "Hardware type must be one of these: cpu, gpu, mbo, ram, storage or other", regexp = "(?i)^(cpu|gpu|mbo|ram|storage|other)$")
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
