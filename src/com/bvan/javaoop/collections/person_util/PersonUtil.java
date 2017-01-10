package com.bvan.javaoop.collections.person_util;

import com.bvan.javaoop.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public final class PersonUtil {
    private PersonUtil() {}

    public static List<Person> createDefaultPersons() {
        List<Person> persons = new ArrayList<Person>() {
            {
                add(new Person("John", 25));
                add(new Person("Bob", 19));
                add(new Person("Cliff", 23));
            }
        };

        return persons;
    }
}
