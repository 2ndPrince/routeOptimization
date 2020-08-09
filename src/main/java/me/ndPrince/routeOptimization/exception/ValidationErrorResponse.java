package me.ndPrince.routeOptimization.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;

import java.util.List;

@Builder
@Data
public class ValidationErrorResponse {
    private String timestamp;
    private List<ValidationErrors> validationErrorsList;
}
