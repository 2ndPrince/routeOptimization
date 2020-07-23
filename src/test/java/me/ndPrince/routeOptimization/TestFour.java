package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.annotation.even;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@even
class TestFour {

    @Test
    void testFour(){
        System.out.println("testing four");
    }
}