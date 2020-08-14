package me.ndPrince.routeOptimization.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
public class DispatchResponse {

    @Builder.Default
    @NotNull
    protected String id;

    private List<VehicleScheduleResponse> vehicleSchedules;
    private List<Double> dummyList;
}
