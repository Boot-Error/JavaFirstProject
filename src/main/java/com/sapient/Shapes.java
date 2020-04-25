package com.sapient;

/**
 *
 * Shapes module
 *
 */

class Circle {
	public static void calculateArea(int radius) {
		System.out.println("Circle area");
	}
}

class Triangle {
	public static void calculateArea(int side) {
		System.out.println("Triangle area");
	}
}

class Square {
	public static void calculateArea(int side) {
		System.out.println("Square area");
	}
}

public class Shapes {
	public Shapes() {
		int numberOfSides;
	}

	public void calculateShapeArea(int numberOfSides, int sideLenght) {

		if (numberOfSides == 1) {
			Circle.calculateArea(sideLenght);

		} else if (numberOfSides == 3) {
			Triangle.calculateArea(sideLenght);

		} else if (numberOfSides == 4) {
			Square.calculateArea(sideLenght);

		} else {
			System.out.println("No Shapes present");
		}
	}
}
