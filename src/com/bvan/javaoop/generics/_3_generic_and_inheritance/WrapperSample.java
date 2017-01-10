package com.bvan.javaoop.generics._3_generic_and_inheritance;

/**
 * @author Bohdan Vanchuhov
 */
public class WrapperSample {
    public static void main(String[] args) {
        Wrapper<A> wrapperA = new Wrapper<>();
        wrapperA.setValue(new B());
    }
}

class A {}

class B extends A {}

class Wrapper<E> {
    private E value;

    public Wrapper() {
    }

    public Wrapper(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}


