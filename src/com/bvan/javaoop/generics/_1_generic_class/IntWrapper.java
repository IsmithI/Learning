package com.bvan.javaoop.generics._1_generic_class;

/**
 * @author Bohdan Vanchuhov
 */
public class IntWrapper {
    private int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
