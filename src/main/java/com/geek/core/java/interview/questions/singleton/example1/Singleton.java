package com.geek.core.java.interview.questions.singleton.example1;

import lombok.Data;

@Data
public class Singleton {

    public String input;

    private static Singleton instance = null;

    private Singleton(){
        input = "Hello I am an attribute of Singleton class";
    }

    public static synchronized Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
