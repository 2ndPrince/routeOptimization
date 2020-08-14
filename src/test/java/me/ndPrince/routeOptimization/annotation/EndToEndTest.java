package me.ndPrince.routeOptimization.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Tag("EndToEnd")
@Retention(RetentionPolicy.RUNTIME)
public @interface EndToEndTest {
}
