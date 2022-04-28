package hr.tvz.tihic.hardwareapp.hardware;

import javax.validation.constraints.NotNull;

public class GetFilterCommand {
    @NotNull(message = "Price cannot be empty")
    private String filter;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
