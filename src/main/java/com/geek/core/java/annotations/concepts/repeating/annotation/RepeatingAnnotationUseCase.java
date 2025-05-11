package com.geek.core.java.annotations.concepts.repeating.annotation;

import java.lang.reflect.Method;

public class RepeatingAnnotationUseCase {

    public static void main(String[] args) {
        for(Method method: RepeatingAnnotationUseCase.class.getDeclaredMethods()) {
           if(method.isAnnotationPresent(RepeatingAnnotation.class)) {
               RepeatingAnnotation repeatingAnnotation = method.getAnnotation(RepeatingAnnotation.class);
               for(Words words: repeatingAnnotation.value()) {
                   System.out.printf("Declared method: [%s], Annotation attribute [word: %s, val: %d]\n",
                           method.getName(), words.word(), words.val());
               }
           }
        }
    }

    @Words
    @Words(word = "First", val = 1)
    @Words(word = "Second", val = 2)
    private void testRepeatingAnnotation() {}
}
