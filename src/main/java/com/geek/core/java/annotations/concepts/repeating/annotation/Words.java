package com.geek.core.java.annotations.concepts.repeating.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Make Words annotation repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatingAnnotation.class)
public @interface Words {
    String word() default "Zero";
    int val() default 0;
}
