package com.geek.core.java.annotations.concepts.repeating.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Create container annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatingAnnotation {
    Words[] value();
}
