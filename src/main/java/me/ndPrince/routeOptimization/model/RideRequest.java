package me.ndPrince.routeOptimization.model;

import com.sun.istack.NotNull;
import lombok.Data;
import me.ndPrince.routeOptimization.Location;

@Data
public class RideRequest {

    @NotNull
    private String rideId;

    @NotNull
    private Location pickup;

    @NotNull
    private Location dropOff;

    @NotNull
    private int capacity;

}
