package com.bvan.javaoop.generics._4_generic_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 25.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class GenericArrayListSample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        String[] stringsArray = strings.toArray(new String[0]);

        for (String s : stringsArray) {
            System.out.println(s);
        }
    }
}
