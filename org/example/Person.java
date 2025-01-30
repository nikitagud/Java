package org.example;

import java.io.Serializable;

enum Gender { MALE, FEMALE }

public class Person implements Serializable {
    String firstName;
    String lastName;
    int age;
    Gender gender;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age, Gender gender, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " years, " + gender + ", " + height + "m, " + weight + "kg";
    }
}
