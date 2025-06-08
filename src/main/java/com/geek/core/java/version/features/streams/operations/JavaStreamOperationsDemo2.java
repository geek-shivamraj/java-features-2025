package com.geek.core.java.version.features.streams.operations;

import com.geek.core.java.version.features.streams.creation.Employee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class JavaStreamOperationsDemo2 {
    public static void main(String[] args) {
        Employee[] arraysofEmps = {
                new Employee(1, "Jeff Bezos", 10000),
                new Employee(2, "Bill Gates", 20000),
                new Employee(3, "Mark Zuckerberg", 30000)};

        List<Employee> employeeList = Arrays.asList(arraysofEmps);

        // toArray - Use when we need an array out of the stream
        System.out.println("\ntoArray Functionality:");
        Employee[] employeesArray = employeeList.stream().toArray(Employee[]::new);
        for(Employee e : employeesArray)
            System.out.println(e);

        // flatMap - It helps to flatten the data structure to simplify further operations
        // A stream can hold complex data structures like Stream<List<String>>
        System.out.println("\nflatMap Functionality:");
        List<List<String>> nestedNames = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"), Arrays.asList("Mark", "Zuckerberg"));
        System.out.println("NestedNames List: " + nestedNames);
        //List<String> flattenNames = nestedNames.stream().flatMap(nameList -> nameList.stream()).toList();
        List<String> flattenNames = nestedNames.stream().flatMap(Collection::stream).toList();
        System.out.println("Flattened List: " + flattenNames);

        // peek - useful in situation where we need to perform a specific operation on each element of the stream
        // & return a new stream that can used further
        System.out.println("\npeek Functionality:");
        employeeList.stream().peek(employee -> employee.salaryIncrement(10)).peek(System.out::println).toList();

    }
}
