package com.geek.core.java.version.features.referencesFeature.example2;

/**
 * We can use :: (double colon) operator to refer constructors also.
 */
public class ConstructorReferencesExample {
    public static void main(String[] args) {
        //Interf interf = s -> new Sample(s);
        Interf interf = Sample::new;
        interf.get("From Constructor Reference");
    }
}

interface Interf {
    Sample get(String s);
}

class Sample {
    private String s;
    Sample(String s) {
        this.s = s;
        System.out.println("Constructor Executed: " + s);
    }
}

