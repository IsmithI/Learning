package com.learning.innerClasses;

/**
 * Created by smith on 24.11.16.
 */
public class MainClass {

    int a;
    private int b;
    protected int c;
    public int d;

}

class InnerClass {

    private final MainClass mainClass;

    InnerClass(final MainClass mainClass) {
        this.mainClass = mainClass;
    }

}
