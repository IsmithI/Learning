package Patterns;

public class Delegate {
    public static void main(String[] args){
//        A a = new A();
//        a.f();

        Painter painter = new Painter();
        painter.setGraphics(new Rectangle());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}

//class A {
//    void f() {
//        System.out.println("f()");
//    }
//}
//
//class B {
//    A a = new A();
//    void f() {
//
//        a.f();
//    }
//}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Patterns.Triangle");
    }
}

class Rectangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Patterns.Rectangle");
    }
}

class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Patterns.Circle");
    }
}

class Painter {
    Graphics graphics;
    void setGraphics(Graphics g) {
        graphics = g;
    }

    void draw() {
        graphics.draw();
    }
}