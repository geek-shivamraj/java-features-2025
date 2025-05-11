package com.geek.core.java.annotations.concepts.full.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FullAnnotation {
    String owner() default "Default";
    int value() default 0;
}
