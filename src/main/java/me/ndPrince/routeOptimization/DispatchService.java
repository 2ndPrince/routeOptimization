package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.exception.ValidationException;
import me.ndPrince.routeOptimization.model.DispatchRequest;
import me.ndPrince.routeOptimization.model.ValidationError;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DispatchService {
    public void validate(DispatchRequest request) {

        List<ValidationError> errorList = new ArrayList<>();

        request.getRides().stream()
                .flatMap(r -> Stream.of(r.getPickup(), r.getDropOff()))
                .collect(Collectors.toSet())
                .forEach(location -> validateLocations(location, errorList));

        if(!errorList.isEmpty()){
            throw new ValidationException(errorList, request.getId());
        }
    }

    public void validateLocations(Location location, List<ValidationError> errors){
        Double longitude = location.getLongitude();
        Double latitude = location.getLatitude();

        boolean isLonValid = (-180d <= longitude) && ( longitude <= 180d);
        boolean isLatValid = (-90d <= latitude) && ( latitude <= 90d);

        if(!isLatValid) errors.add(new ValidationError(ValidationError.Type.BAD_RIDE, "Location", "Invalid Lat Location. Check your Lat", 1, latitude.toString()));
        if(!isLonValid) errors.add(new ValidationError(ValidationError.Type.BAD_RIDE, "Location", "Invalid Lon Location. Check your Lon", 1, longitude.toString()));
    }
}
