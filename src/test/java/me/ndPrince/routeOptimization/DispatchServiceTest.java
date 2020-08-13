package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.model.ValidationError;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
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

}