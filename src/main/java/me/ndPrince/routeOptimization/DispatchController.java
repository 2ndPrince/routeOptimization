package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.model.DispatchRequest;
import me.ndPrince.routeOptimization.model.DispatchResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/dispatch")
public class DispatchController {

    @PostMapping
    public DispatchResponse postDispatchRequest(@Valid @RequestBody DispatchRequest request){
        return new DispatchResponse();
    }
}
