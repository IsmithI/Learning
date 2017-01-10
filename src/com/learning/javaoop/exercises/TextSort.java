package com.learning.javaoop.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by smith on 07.12.16.
 */
public class TextSort {

    public static void main(String[] args) {
        System.out.println(sort(args).toString());
    }

    public static List<String> sort(String[] words) {
        List<String> res = new ArrayList<>();
        res.addAll(Arrays.asList(words));
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareToIgnoreCase(t1);
            }
        });
        return res;
    }
}
