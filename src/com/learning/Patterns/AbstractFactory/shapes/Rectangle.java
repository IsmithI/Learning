package Patterns.AbstractFactory.shapes;


import Patterns.AbstractFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn rectangle");
    }
}
