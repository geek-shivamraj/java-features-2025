package com.geek.core.java.annotations.example1;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Shivam";
    String date();
    int revision() default 1;
    String comments();
}
