package com.geek.core.java.version.features.streams.questionbank;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Alice", 25),
                new Person("Bob", 30), new Person("Charlie", 35));
        OptionalDouble averageAge = personList.stream().mapToInt(Person::getAge).average();
        System.out.println(averageAge.getAsDouble());
    }
}

@Data
@AllArgsConstructor
class Person{
    private String name;
    private Integer age;
}
