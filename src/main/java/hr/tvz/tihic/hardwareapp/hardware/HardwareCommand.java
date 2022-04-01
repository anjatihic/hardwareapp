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
}
