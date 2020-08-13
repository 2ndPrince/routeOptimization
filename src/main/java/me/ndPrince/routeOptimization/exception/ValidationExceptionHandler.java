package me.ndPrince.routeOptimization.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    public ValidationErrorResponse handleValidationExceptions(ValidationException e) {
        return ValidationErrorResponse.builder()
                .timestamp(LocalDateTime.now().toString())
                .status(400)
                .validationErrorsList(e.getValidationErrors())
                .build();
    }
}
