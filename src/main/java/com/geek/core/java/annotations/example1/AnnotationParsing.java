package com.geek.core.java.annotations.example1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {
    public static void main(String[] args) {
        System.out.println();
        try {
            for (Method method : AnnotationParsing.class.getClassLoader()
                    .loadClass(("com.geek.core.java.annotations.example1.AnnotationExample")).getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method.getName() + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        System.out.println("Method with revision no " + methodAnno.revision() + " = " + method.getName());
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                    System.out.println();
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
