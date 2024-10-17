package org.functionalprog.imperative;

import java.util.List;
import java.util.stream.Collectors;

import static org.functionalprog.imperative.Runner.Gender.FEMALE;

public class Runner {

    // psvm - public static void main(String[] args){}
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", FEMALE)
        );

        System.out.println("// Imperative Approach");
        // Imperative Approach
        List<Person> females = new java.util.ArrayList<>(); // <1>

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative Approach");
        // Declarative Approach
        // the way we are implementing is by using streams with collections.

        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}