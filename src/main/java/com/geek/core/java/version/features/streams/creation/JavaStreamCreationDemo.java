package com.geek.core.java.version.features.streams.creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamCreationDemo {

    public static void main(String[] args) {
        Employee[] arraysofEmps = {
                new Employee(1, "Jeff Bezos", 10000),
                new Employee(2, "Bill Gates", 20000),
                new Employee(3, "Mark Zuckerberg", 30000)};

        // Way 1
        Stream<Employee> stream = Stream.of(arraysofEmps);

        // Way 2
        Stream<Employee> employeeStream = Stream.of(arraysofEmps[0], arraysofEmps[1], arraysofEmps[2]);

        // Way 3
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arraysofEmps[0]);
        empStreamBuilder.accept(arraysofEmps[1]);
        empStreamBuilder.accept(arraysofEmps[2]);
        Stream<Employee> empStream = empStreamBuilder.build();

        // Way 4
        List<Employee> employeeList = Arrays.asList(arraysofEmps);
        Stream<Employee> employeeStreamFromList = employeeList.stream();
    }
}
