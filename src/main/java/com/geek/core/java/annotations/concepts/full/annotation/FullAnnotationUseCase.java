package com.geek.core.java.annotations.concepts.full.annotation;

import java.lang.reflect.Method;

public class FullAnnotationUseCase {

    public static void main(String[] args) {
        for (Method method : FullAnnotationUseCase.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(FullAnnotation.class)) {
                FullAnnotation singleValAnnotation = method.getAnnotation(FullAnnotation.class);
                System.out.printf("Method - [%s] Annotation Value: %d\n", method.getName(), singleValAnnotation.value());
            }
        }
    }

    @FullAnnotation()
    private void testFullAnnotationDefault(){}

    @FullAnnotation(owner = "Shivam", value = 11)
    private void testFullAnnotation(){}

}
