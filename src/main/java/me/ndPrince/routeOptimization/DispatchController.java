package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.model.DispatchRequest;
import me.ndPrince.routeOptimization.model.DispatchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/dispatch")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @PostMapping
    public DispatchResponse postDispatchRequest(@Valid @RequestBody DispatchRequest request) {
        dispatchService.validate(request);
        return new DispatchResponse();
    }
}
