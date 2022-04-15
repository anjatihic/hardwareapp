package hr.tvz.tihic.hardwareapp.hardware;


public class HardwareDTO {
    private final String name;
    private double price;
    private String code;

    public HardwareDTO(String name, double price, String code){
        this.name = name;
        this.price = price;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "HardwareDTO{" +
                "name=" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
