package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.*;

public class PriceUpdateCommand {

    @NotNull(message = "Price cannot be empty")
    @PositiveOrZero(message = "Price cannot be negative")
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
