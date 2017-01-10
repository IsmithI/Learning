package com.bvan.javaoop.for_each;

import com.bvan.javaoop.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_ChangePersonNameSample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bohdan"));
        persons.add(new Person("John"));

        for (Person person : persons) {
            person.setName("1");
        }
        System.out.println(persons);
    }
}
