package com.bvan.javaoop.collections._1_comparison;

import com.bvan.javaoop.collections.person_util.PersonComparators;
import com.bvan.javaoop.collections.person_util.PersonUtil;
import com.bvan.javaoop.person.Person;

import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_TestPersonComparators {
    public static void main(String[] args) {
        List<Person> persons = PersonUtil.createDefaultPersons();
        System.out.println(persons);

        persons.sort(PersonComparators.nameComparator(false));
        System.out.println(persons);
    }
}
