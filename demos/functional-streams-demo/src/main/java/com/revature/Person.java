package com.revature;

import java.util.Comparator;

public class Person extends User implements Comparable<Person>{
    public Person(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return this.getLastName().compareTo(o.getLastName());
    }
}
