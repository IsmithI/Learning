package com.bvan.javaoop.collections._1_comparison;

import com.bvan.javaoop.collections.person_util.PersonUtil;
import com.bvan.javaoop.person.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_PersonComparatorSample {
    public static void main(String[] args) {
        List<Person> persons = PersonUtil.createDefaultPersons();
        System.out.println(persons);

//        persons.sort(new PersonAgeComparator());
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        System.out.println(persons);
    }
}

class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
