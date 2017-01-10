package Patterns.AbstractFactory.colors;

import Patterns.AbstractFactory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Filled with green");
    }
}