package com.geek.core.java.version.features.streams.operations.maps;

import com.geek.core.java.version.features.streams.creation.Employee;

import java.util.List;
import java.util.stream.Stream;

public class MapStreamExamples {
    public static void main(String[] args) {
        Employee[] arraysofEmps = {
                new Employee(1, "Jeff Bezos", 10000),
                new Employee(2, "Bill Gates", 20000),
                new Employee(3, "Mark Zuckerberg", 30000)};

        // map() -> Produces a new stream after applying a function to each element of the original stream.
        // The new stream could be of a different type
        List<String> employeesName = Stream.of(arraysofEmps).map(Employee::getName).toList();
        System.out.println(employeesName);

        Stream.of(arraysofEmps).map(employee -> employee.salaryIncrement(10)).toList();
    }
}
