package com.learning.circle;

public class Square {
	String name = "Square";
	Color color;
	float p = 0;
	float s = 0;
	
	Square(float side, Color color){
		setPerimeter(side);
		setArea(side);
		this.color = color;
		getInfo();
	}

	void setPerimeter(float side) {
		p = (float) (4 * side);
	}

	void setArea(float side) {
		s = (float) (side * side);
	}
	
	void getInfo() {
		System.out.print("\nName: " + name + "\nColor: ");
		color.getColor();
		System.out.println("\nPerimeter: " + p + "\nArea: " + s);
	}
}
