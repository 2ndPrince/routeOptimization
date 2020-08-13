package me.ndPrince.routeOptimization.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class DispatchRequest {

    @NotNull(message = "this field must not be null")
    @Valid
    protected List<RideRequest> rides;

    protected List<VehicleRequest> vehicles;
}
