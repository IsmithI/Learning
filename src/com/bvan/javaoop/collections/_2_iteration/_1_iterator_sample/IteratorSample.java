package com.bvan.javaoop.collections._2_iteration._1_iterator_sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class IteratorSample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        for (Integer elem : list) {
            System.out.println(elem);
        }
        System.out.println();

        //--------------------------------------------------

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            System.out.println(elem);
        }
    }
}
