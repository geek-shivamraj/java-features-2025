package com.geek.core.java.version.features.streams.operations;

import com.geek.core.java.version.features.streams.creation.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Imp point to note: Even though the reference is getting changed & new list are getting created. Still the employee object is same till forEach
 */
public class JavaStreamOperationsDemo1 {
    public static void main(String[] args) {
        Employee[] arraysofEmps = {
                new Employee(1, "Jeff Bezos", 10000),
                new Employee(2, "Bill Gates", 20000),
                new Employee(3, "Mark Zuckerberg", 30000)};

        List<Employee> employeeList = Arrays.asList(arraysofEmps);

        // void forEach(Consumer<? super T> action);
        employeeList.stream().forEach(employee -> {
            employee.setSalary(employee.getSalary() + 10);
            System.out.println(employee.hashCode());
        });
        System.out.println(employeeList.hashCode());

        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        employeeList = employeeList.stream()
                .map(employee -> new Employee(employee.getId(), employee.getName(), employee.getSalary() + 10)).toList();
        System.out.println(employeeList.hashCode());

        // Stream<T> filter(Predicate<? super T> predicate);
        employeeList = employeeList.stream().filter(employee -> employee.getId() > 1).toList();
        System.out.println(employeeList);

        // findFirst()
        Optional<Employee> filteredEmployee = employeeList.stream().filter(employee -> employee.getSalary() < 100).findFirst();
        if(filteredEmployee.isEmpty())
            System.out.println("Empty list");
        filteredEmployee.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found!!"));

        filteredEmployee = employeeList.stream().filter(employee -> employee.getSalary() > 20000).findFirst();
        filteredEmployee.ifPresent(System.out::println);

        // Refreshed employee list
        System.out.println("Refreshing list");
        List<Employee> refreshedEmployeeList = Arrays.asList(arraysofEmps);
        //Employee[] employees = refreshedEmployeeList.toArray(Employee[]::new);
        Employee[] employees = refreshedEmployeeList.stream().toArray(Employee[]::new);
        for(Employee e : employees) {
            System.out.println(e.hashCode());
        }
    }
}
