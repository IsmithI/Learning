package com.bvan.javaoop.collections._2_iteration._2_modification_sample;

import com.bvan.javaoop.collections.person_util.PersonUtil;
import com.bvan.javaoop.person.Person;

import java.util.Iterator;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class ModificationSample {
    public static void main(String[] args) {
        List<Person> persons = PersonUtil.createDefaultPersons();

        Iterator<Person> iterator = persons.iterator();
        persons.remove(0);

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
