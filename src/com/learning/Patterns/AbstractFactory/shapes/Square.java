package Patterns.AbstractFactory.shapes;

import Patterns.AbstractFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn square");
    }
}
