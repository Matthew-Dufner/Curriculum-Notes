package com.revature;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new LinkedList<>();
        people.add(new Person("Kyle", "Plummer", 37));
        people.add(new Person("Kyle", "Plummer", 37));
        people.add(new Person("David", "Wilson", 98));
        people.add(new Person("Matthew", "Dufner", 44));
        people.add(new Person("Nygil", "Nettles", 25));
        people.add(new Person("Nygil", "Nettles", 25));
        people.add(new Person("Nygil", "Nettles", 25));
        people.add(new Person("Jared", "Adams", 26));
        people.add(new Person("Bilbo", "Baggins", 111));
        people.add(new Person("Bilbo", "Baggins", 111));
        people.add(new Person("Kidist", "Bishaw", 44));
        people.add(new Person("Kidist", "Bishaw", 44));



        List<Person> newList = people.stream().filter(x -> {return x.getAge() < 95 ? true : false;})
                .distinct()
                .sorted()
                .limit(4)
                .skip(2)
                .collect(Collectors.toList());


        System.out.println(newList);





    }
}
