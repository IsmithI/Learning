package com.bvan.javaoop.collections._1_comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_ComparableSample {
    public static void main(String[] args) {
        List<Digit> digits = new ArrayList<>();
        digits.add(Digit.valueOf(5));
        digits.add(Digit.valueOf(2));
        digits.add(Digit.valueOf(4));

        System.out.println(digits);

        Collections.sort(digits);
//        digits.sort(null);

        System.out.println(digits);
    }
}

final class Digit implements Comparable<Digit> {
    public static final int RADIX = 10;

    private static Digit[] digitsCash = initDigitsCash();

    private static Digit[] initDigitsCash() {
        Digit[] digitsCash = new Digit[RADIX];
        for (int i = 0; i < RADIX; i++) {
            digitsCash[i] = new Digit(i);
        }
        return digitsCash;
    }

    private int value;

    public static Digit valueOf(int value) {
        checkDigit(value);
        return digitsCash[value];
    }

    private static void checkDigit(int value) {
        if (value < 0 || value >= RADIX) {
            throw new IllegalArgumentException("A digit should be in the range [0, " + (RADIX+1) + "]");
        }
    }

    private Digit(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int compareTo(Digit other) {
        return Integer.compare(value, other.value);
    }
}
