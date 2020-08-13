package me.ndPrince.routeOptimization.exception;

import lombok.Builder;
import lombok.Data;
import me.ndPrince.routeOptimization.model.ValidationError;

import java.util.List;

@Builder
@Data
public class ValidationErrorResponse {
    private String timestamp;
    private Integer status;
    private List<ValidationError> validationErrorsList;
}
