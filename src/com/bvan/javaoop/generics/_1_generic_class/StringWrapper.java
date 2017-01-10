package com.bvan.javaoop.generics._1_generic_class;

/**
 * @author Bohdan Vanchuhov
 */
public class StringWrapper {
    private String value;

    public StringWrapper(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
