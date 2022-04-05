package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

public class HardwareCommand {

    private String name;


    private String code;


    private double price;


    private Integer numberAvailable;


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
