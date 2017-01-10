package com.learning.circle;

import java.util.Scanner;

public class Main {
	Circle[] circles = new Circle[5];
	Square[] squares = new Square[4];
	Triangle[] triangles = new Triangle[3];
	
	public static void main(String[] args) {
		Main main = new Main();
		int c = 0;
		int s = 0;
		int t = 0;
		
		boolean flag = false;
		int side = 0;
		Scanner scans = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		
		do {
			String text = "";
			System.out.println("Input figure: Circle/Square/Triangle");
			text = scans.nextLine().toLowerCase();
			
			switch (text) {
			case "com/learning/circle":
				c++;
				if(c==5)break;
				System.out.println("Input radius:");
				do {
					num = new Scanner(System.in);
					if (num.hasNextInt()) {
						side = num.nextInt();
						break;
					} else {
						System.out.println("Wrong Input!");
					}
				} while (true);
				main.circles[c] = new Circle(side, new Color());
				break;
			case "square":
				s++;
				if(s==5)break;
				System.out.println("Input side:");
				do {
					num = new Scanner(System.in);
					if (num.hasNextInt()) {
						side = num.nextInt();
						break;
					} else {
						System.out.println("Wrong Input!");
					}
				} while (true);
				main.squares[s] = new Square(side, new Color());
				break;
			case "triangle":
				t++;
				if(t==5)break;
				Float[] tri = new Float[4];
				System.out.println("1) Two sides and angle\n2) Three sides");
				do {
					num = new Scanner(System.in);
					if (num.hasNextInt()) {
						side = num.nextInt();
						tri[3] = (float)side;
						break;
					} else {
						System.out.println("Wrong input!");
					}
				} while (true);
				System.out.println("Input file(side1, side2, side3/angle):");
				for (int i = 0; i < 3; i++) {
					do {
						num = new Scanner(System.in);
						if (num.hasNextFloat()) {
							tri[i] = num.nextFloat();
							break;
						} else {
							System.out.println("Wrong Input!");
						}
					} while (true);
				}
				main.triangles[t] = new Triangle(tri, new Color());
				break;
			case "exit":
				flag = true;
				break;
			case "factory":
				System.out.println("Circles: " + c);
				System.out.println("Squares: " + s);
				System.out.println("Triangles: " + t);
				break;
			default:
				System.out.println("Wrong Input!");
			}
			if (flag) {
				break;
			}
		} while (true);
		System.out.println("Exit!");
		num.close();
		scans.close();
	}	
}
