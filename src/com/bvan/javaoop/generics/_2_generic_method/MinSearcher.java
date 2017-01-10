package com.bvan.javaoop.generics._2_generic_method;

import com.bvan.javaoop.person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.bvan.javaoop.generics._2_generic_method.MinSearcher.min;

/**
 * @author Bohdan Vanchuhov
 */
public final class MinSearcher {
    private MinSearcher() {}

    public static int min(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static double min(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }

        double min = array[0];
        for (double elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static <T> T min(List<T> list,
                             Comparator<T> comparator) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T min = list.get(0);
        for (T elem : list) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T min(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T min = list.get(0);
        for (T elem : list) {
            if (min.compareTo(elem) > 0) {
                min = elem;
            }
        }

        return min;
    }
}

class MinSearcherRunner {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Bob", 30));

        Person younger = min(persons, new AgeComparator());
        System.out.println(younger);

        Person shortNamePerson = min(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getName().length(), p2.getName().length());
            }
        });
        System.out.println(shortNamePerson);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
