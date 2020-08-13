package me.ndPrince.routeOptimization.exception;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.ndPrince.routeOptimization.model.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
@Getter
@Slf4j
public class ValidationException extends RuntimeException {

    private List<ValidationError> validationErrors;

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(List<ValidationError> errors, String requestId){
        this.validationErrors = errors;
        log.warn("The following request {} has validation exceptions", requestId);
    }
}
