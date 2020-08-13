package me.ndPrince.routeOptimization.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ValidationError {

    private final Type type;
    private final String field;
    private final String message;
    private final Integer errorCode;

    public enum Type{
        SPRING_VALIDATION,
        BAD_RIDE,
        BAD_VEHICLE,
        ETC
    }
}
