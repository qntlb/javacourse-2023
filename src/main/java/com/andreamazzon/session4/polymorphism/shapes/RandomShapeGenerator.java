package com.andreamazzon.session4.polymorphism.shapes;

import java.util.Random;

/**
 * The method nextShape() of this class returns an object of type Shape, but actually we
 * return a Circle, a Square or a Triangle. This is possible because a Shape reference
 * is automatically given to our objects once we create and return them.
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

	public RandomShapeGenerator(double basisOfTriangle, double heightOfTriangle, double sideOFSquare,
			double radiusOfCircle) {
		this.basisOfTriangle = basisOfTriangle;
		this.heightOfTriangle = heightOfTriangle;
		this.sideOfSquare = sideOFSquare;
		this.radiusOfCircle = radiusOfCircle;
	}

	/**
	 * It generates and returns an object of type Shape. Its specific type is random: it can
	 * be Circle, Square or Triangle.
	 *  
	 * @return the object generated.
	 */
	public Shape nextShape() { // Upcasting in the return type
		switch (rand.nextInt(3)) {// 0,1 or 2
		/*
		 * note that for any case it does not execute the instruction that follows even
		 * if there is no break: can you tell why?
		 */
		case 0:
			Circle circle = new Circle(radiusOfCircle);
			return circle;
			// also:
			//return new Circle(radiusOfCircle); // upcasted to Shape.
		case 1:
			// call the right constructor
			return new Square(sideOfSquare); // upcasted to Shape
		case 2:
			// call the right constructor
			return new Triangle(basisOfTriangle, heightOfTriangle);// upcasted to Shape
		/*
		 * compulsory default. Actually we know that it will never be the case, because
		 * due to rand.nextInt(3) we have anyway a number 0, 1 or 2.
		 */
		default:
			return null;
		}
	}
}