package me.ndPrince.routeOptimization.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class DispatchRequest {

    @NotNull(message = "this field must not be null")
    protected List<RideRequest> rides;
    protected List<VehicleRequest> vehicles;
}
