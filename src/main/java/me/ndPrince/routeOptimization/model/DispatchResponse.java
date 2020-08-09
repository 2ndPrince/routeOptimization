package me.ndPrince.routeOptimization.model;

import lombok.Data;

import java.util.List;

@Data
public class DispatchResponse {

    private List<VehicleScheduleResponse> vehicleSchedules;
}
