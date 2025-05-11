package com.geek.core.java.annotations.concepts.singlevalue.annotation;

import java.lang.reflect.Method;

public class SingleValAnnotationUseCase {

    public static void main(String[] args) {
        for (Method method : SingleValAnnotationUseCase.class.getDeclaredMethods()) {
           if(method.isAnnotationPresent(SingleValAnnotation.class)) {
               SingleValAnnotation singleValAnnotation = method.getAnnotation(SingleValAnnotation.class);
               //System.out.println("Method - " + method.getName() + " Annotation value: " + singleValAnnotation.value());
               System.out.printf("Method - [%s] Annotation Value: %d\n", method.getName(), singleValAnnotation.value());
           }
        }
    }

    @SingleValAnnotation()
    private void testSingleValAnnotationDefault(){}

    @SingleValAnnotation(value = 5)
    private void testSingleValAnnotation(){}
}
