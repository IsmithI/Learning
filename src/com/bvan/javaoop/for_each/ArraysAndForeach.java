package com.bvan.javaoop.for_each;

import java.util.Arrays;

/**
 * Created on 22.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class ArraysAndForeach {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        for (int i = 0; i < a.length; i++) {
            int elem = a[i];
            System.out.println(elem);
        }
        System.out.println();

        //--------------------------------------------------

        // for-each
        // READ-ONLY
        for (int elem : a) {
            System.out.println(elem);
        }

        //--------------------------------------------------

        int[] b = new int[SIZE];
        for (int elem : b) {
            elem = 1;
        }
        System.out.println(Arrays.toString(b));
    }
}
