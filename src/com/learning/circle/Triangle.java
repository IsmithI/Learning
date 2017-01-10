package com.learning.circle;

public class Triangle {
	String name = "Triangle";
	Color color;
	float p = 0;
	float s = 0;

	Triangle(Float[] tri, Color color) {
		// Angle
		if (tri[3] == 1) {
			if (tri[2] < 0 || tri[2] > 180) {
				return;
			}
			setArea(tri[0], tri[1], setThirdSide(tri));
		} else {
		// Sides
			if (tri[0] > (tri[1] + tri[2])) {
				return;
			}
			if (tri[1] > (tri[2] + tri[0])) {
				return;
			}
			if (tri[2] > (tri[1] + tri[0])) {
				return;
			}
			setArea(tri[0], tri[1], tri[2]);
		}
		setPerimeter(tri[0], tri[1], tri[2]);
		this.color = color;
		getInfo();
	}

	float setThirdSide(Float[] tri) {
		float side = (float) (Math.sqrt(tri[0] * tri[0] + tri[1] * tri[1] - tri[0] * tri[1] * Math.cos(tri[2])));
		return side;
	}

	void setPerimeter(float side1, float side2, float side3) {
		p = (float) (side1 + side2 + side3);
	}

	void setArea(float side1, float side2, float side3) {
		float pp = (float) ((side1 + side2 + side3) / 2);
		s = (float) (Math.sqrt(pp * (pp - side1) * (pp - side2) * (pp - side3)));
	}
	
	void getInfo() {
		System.out.print("\nName: " + name + "\nColor: ");
		color.getColor();
		System.out.println("\nPerimeter: " + p + "\nArea: " + s);
	}
}
