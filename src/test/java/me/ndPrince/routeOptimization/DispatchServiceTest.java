package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.annotation.LogicTest;
import me.ndPrince.routeOptimization.exception.ValidationException;
import me.ndPrince.routeOptimization.model.DispatchRequest;
import me.ndPrince.routeOptimization.model.RideRequest;
import me.ndPrince.routeOptimization.model.ValidationError;
import me.ndPrince.routeOptimization.model.VehicleRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
@LogicTest
class DispatchServiceTest {

    @InjectMocks
    private DispatchService dispatchService;

    @Test
    public void test_validateLocations(){

        List<ValidationError> errorList = new ArrayList<>();
        Location l1 = new Location(-501.2, 5.3);
        dispatchService.validateLocations(l1, errorList);
        assertEquals(1, errorList.size());

    }

    @Test
    public void test_wholeService(){
        Location okayLocation1 = new Location(19.0, -35.2);
        Location okayLocation2 = new Location(20.0, -35.0);
        Location badLocation1 = new Location(900.0, -35.0);
        Location badLocation2 = new Location(20.0, -235.0);
        RideRequest rideId1 = RideRequest.builder().rideId("rideId1").pickup(okayLocation1).dropOff(okayLocation2).build();
        RideRequest rideId2 = RideRequest.builder().rideId("rideId2").pickup(okayLocation1).dropOff(badLocation2).build();
        RideRequest rideId3 = RideRequest.builder().rideId("rideId3").pickup(badLocation1).dropOff(badLocation2).build();

        VehicleRequest vehicles = new VehicleRequest();

        DispatchRequest sampleRequest = DispatchRequest.builder()
                .id("request1")
                .rides(Arrays.asList(rideId1,rideId2,rideId3))
                .vehicles(Arrays.asList(vehicles)).build();


        assertThrows(ValidationException.class, () -> {
            dispatchService.validate(sampleRequest);
        });
    }

}