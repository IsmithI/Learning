package com.bvan.javaoop.collections._2_iteration._4_number_generator;

/**
 * @author Bohdan Vanchuhov
 */
public class NumberGeneratorSample {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator(10, 20);
        for (Integer elem : generator) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
