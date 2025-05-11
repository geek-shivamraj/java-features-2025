package com.geek.core.java.annotations.concepts.type.annotation;

public class TypeAnnotationUseCase {

    public static void main(String[] args) {
        // Annotating the type of the string
        @TypeAnnotation String input = "This is an example of type annotation";
        System.out.println(input);
        testTypeAnnotation();
    }

    // Annotating return type of the function
    private static @TypeAnnotation int testTypeAnnotation() {
        System.out.println("The return type of this function is annotated");
        return 0;
    }
}
