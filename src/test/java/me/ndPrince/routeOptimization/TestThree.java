package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.annotation.odd;
import me.ndPrince.routeOptimization.annotation.prime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@odd
@prime
class TestThree {

    @Test
    void testOne(){
        System.out.println("testing one");
    }
}