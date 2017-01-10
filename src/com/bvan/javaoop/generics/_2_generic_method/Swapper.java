package com.bvan.javaoop.generics._2_generic_method;

import com.bvan.javaoop.person.Person;

import java.util.Arrays;

import static com.bvan.javaoop.generics._2_generic_method.Swapper.swapGenerics;

/**
 * @author Bohdan Vanchuhov
 */
public class Swapper {
    public static void swapInts(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swapStrings(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swapObjects(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void swapGenerics(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

class SwapperRunner {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 25),
                new Person("Bob", 30)
        };
        System.out.println(Arrays.toString(persons));

        swapGenerics(persons, 0, 1);
        System.out.println(Arrays.toString(persons));
    }
}