package me.ndPrince.routeOptimization.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Tag("odd")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface odd {
}
