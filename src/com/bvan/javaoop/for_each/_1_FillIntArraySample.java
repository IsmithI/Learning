package com.bvan.javaoop.for_each;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_FillIntArraySample {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int elem : array) {
            elem = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
