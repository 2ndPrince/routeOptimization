package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.model.DispatchRequest;
import me.ndPrince.routeOptimization.model.DispatchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/dispatch")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @PostMapping
    public DispatchResponse postDispatchRequest(@Valid @RequestBody DispatchRequest request) {
        ArrayList<Double> dummyLists = new ArrayList<>();
        dummyLists.add(5.3);
        dummyLists.add(7.9);
        dummyLists.add(0.4);

        dispatchService.validate(request);
        return DispatchResponse.builder()
                .id("1")
                .dummyList(dummyLists)
                .build();
    }
}
