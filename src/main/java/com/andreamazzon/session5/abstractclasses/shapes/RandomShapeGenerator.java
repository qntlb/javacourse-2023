package com.andreamazzon.session5.abstractclasses.shapes;

import java.util.Random;

/**
 * This class illustrates an use of late binding: the method nextShape() returns
 * an object of type Shape, but actually we return a Circle, a Square or a
 * Triangle. This is possible because a Shape reference is automatically given
 * to our objects once we create and return them.
 *
 * @author Andrea Mazzon
 *
 */
public class RandomShapeGenerator {

	private double basisOfTriangle;
	private double heightOfTriangle;
	private double sideOfSquare;
	private double radiusOfCircle;

	private Random rand = new Random();// random number generator

	RandomShapeGenerator(double basisOfTriangle, double heightOfTriangle, double sideOFSquare, double radiusOfCircle) {
		this.basisOfTriangle = basisOfTriangle;
		this.heightOfTriangle = heightOfTriangle;
		this.sideOfSquare = sideOFSquare;
		this.radiusOfCircle = radiusOfCircle;
	}

	Shape nextShape() { // Upcasting in the return type
		switch (rand.nextInt(3)) {// 0,1 or 2
		/*
		 * note that for any case it does not execute the instruction that follows even
		 * if there is no break: can you tell why?
		 */
		case 0:
			// like to say:
			// Circle circle = new Circle(radiusOfCircle);
			// return circle;
			// call the right constructor
			return new Circle(radiusOfCircle); // upcasted to Shape.
		case 1:
			// call the right constructor
			return new Square(sideOfSquare); // upcasted to Shape
		case 2:
			// call the right constructor
			return new Triangle(basisOfTriangle, heightOfTriangle); // upcasted to Shape
		/*
		 * compulsory default. Actually we know that it will never be the case, because
		 * due to rand.nextInt(3) we have anyway a number 0, 1 or 2.
		 */
		default:
			return null;
		}
	}
}