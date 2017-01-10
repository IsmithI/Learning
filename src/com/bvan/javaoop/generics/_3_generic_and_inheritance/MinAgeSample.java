package com.bvan.javaoop.generics._3_generic_and_inheritance;

import com.bvan.javaoop.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class MinAgeSample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 25, "MIT"));
        students.add(new Student("Bob", 19, "KPI"));
        students.add(new Student("Cliff", 23, "Harvard"));

        Student youngerStudent = findYounger(students);
        System.out.println(youngerStudent);
    }

    public static <T extends Person> T findYounger(List<T> persons) {
        int minAge = Integer.MAX_VALUE;
        T younger = null;

        for (T person : persons) {
            if (minAge > person.getAge()) {
                minAge = person.getAge();
                younger = person;
            }
        }
        return younger;
    }

//    public static Person findYounger(List<Person> persons) {
//        int minAge = Integer.MAX_VALUE;
//        Person min = null;
//
//        for (Person person : persons) {
//            if (minAge > person.getAge()) {
//                minAge = person.getAge();
//                min = person;
//            }
//        }
//        return min;
//    }
}

class Student extends Person {
    protected String universe;

    public Student(String name, int age, String universe) {
        super(name, age);
        this.universe = universe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", universe='").append(universe).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
