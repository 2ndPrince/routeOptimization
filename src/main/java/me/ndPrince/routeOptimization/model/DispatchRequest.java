package me.ndPrince.routeOptimization.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
public class DispatchRequest {

    @Builder.Default
    @NotNull
    protected String id;

    @NotNull(message = "this field must not be null")
    @Valid
    protected List<RideRequest> rides;

    protected List<VehicleRequest> vehicles;
}
