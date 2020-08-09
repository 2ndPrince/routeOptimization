package me.ndPrince.routeOptimization.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class DispatchRequest {

    @NotNull
    protected List<RideRequest> rides;
    protected List<VehicleRequest> vehicles;
}
