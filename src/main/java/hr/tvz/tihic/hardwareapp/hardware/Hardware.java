package hr.tvz.tihic.hardwareapp.hardware;

import lombok.Data;

@Data
public class Hardware {
    private String name;
    private String code;
    private double price;
    private Integer numberAvailable;
    private Type type;

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
