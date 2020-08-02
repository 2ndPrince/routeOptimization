package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.annotation.even;
import me.ndPrince.routeOptimization.annotation.prime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@even @prime
class TestTwo {

    @Test
    void testTwo(){
        System.out.println("testing two");
    }
}