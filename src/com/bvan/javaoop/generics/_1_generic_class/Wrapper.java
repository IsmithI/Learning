package com.bvan.javaoop.generics._1_generic_class;

/**
 * @author Bohdan Vanchuhov
 */
public class Wrapper<E> {
    private E value;

    public Wrapper(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

//    public E create() {
//        return new E();
//    }
//
//    public E[] createArray() {
//        return (E[])new Object[10];
//    }
}