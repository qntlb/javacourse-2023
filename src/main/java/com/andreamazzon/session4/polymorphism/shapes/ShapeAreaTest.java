package com.andreamazzon.session4.polymorphism.shapes;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * In this test we show an example of polymorphism. We have a for loop where we generate a
 * shape at every iteration, asking it to call the method computing its area.
 * However, until run time we don't know if it is a circle, square or triangle, the shapes are
 * even selected randomly. Nevertheless, we are able to do this because the objects
 * of the derived classes get upcasted to the base type when they are created (see the method
 * nextShape() of RandomShapeGenerator).
 * Every object is then treated as a Shape at compilation time, but at run time its special type
 * is recognized and the specific implementation of the method computeArea() is called.
 * This behavior is known as late binding: the code being called isn’t determined until run time.
 *
 * @author Andrea Mazzon
 *
 */
public class ShapeAreaTest {


	public static void main(String[] args) {

		double basisOfTriangle = 10;
		double heightOfTriangle = 7;

		double sideOfSquare = 8;

		double radiusOfCircle = 11;
		
		double numberOfShapes = 10;

		RandomShapeGenerator generator = new RandomShapeGenerator(basisOfTriangle, heightOfTriangle,
				sideOfSquare, radiusOfCircle);

		// Fill up the array with shapes:
		for (int i = 0; i < numberOfShapes; i++) {
			/*
			 * Here we are of course obliged to give it a reference of Shape! Indeed, we don't
			 * know yet which specific type it will be.
			 */
			Shape shape = generator.nextShape();
			printn("The area is " + shape.computeArea());//late binding!
			printn();
		}

	}
}
