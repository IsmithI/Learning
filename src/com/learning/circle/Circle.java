package com.learning.circle;

public class Circle {
	String name = "Circle";
	Color color;
	float p = 0;
	float s = 0;

	Circle(float r, Color color){
		setPerimeter(r);
		setArea(r);
		this.color = color;
		getInfo();
	}

	void setPerimeter(float radius) {
		p = (float) (2 * Math.PI * radius);
	}

	void setArea(float radius) {
		s = (float) (Math.PI * radius * radius);
	}
	
	void getInfo() {
		System.out.print("\nName: " + name + "\nColor: ");
		color.getColor();
		System.out.println("\nPerimeter: " + p + "\nArea: " + s);
	}
}
