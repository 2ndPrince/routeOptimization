package me.ndPrince.routeOptimization;

import me.ndPrince.routeOptimization.annotation.odd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@odd
class SimpleNumberTest {

    @Test
    void testOne(){
        System.out.println("testing one");
    }
}