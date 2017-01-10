package com.learning.circle;

public class Color {
	String color;
	String[] col = { "Blue", "Green", "Red", "Orange", "Yellow", "Purple", "Black", "White", "Gray", "Brown"};
	
	Color(){
		color = getRandomColor();
	}
	
	String getRandomColor() {
		return col[(int) (Math.random() * col.length + 1)];
	}
	
	void getColor(){
		System.out.print(color);
	}
}
