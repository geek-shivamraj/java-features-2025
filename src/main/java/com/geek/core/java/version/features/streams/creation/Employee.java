package com.geek.core.java.version.features.streams.creation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private double salary;

    public double salaryIncrement(double incrementFactory) {
        return salary += incrementFactory;
    }
}
