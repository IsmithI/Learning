package com.bvan.javaoop.generics._1_generic_class;

/**
 * @author Bohdan Vanchuhov
 */
public class ObjectWrapper {
    private Object value;

    public ObjectWrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}