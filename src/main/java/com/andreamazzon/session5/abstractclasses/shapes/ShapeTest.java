package com.andreamazzon.session5.abstractclasses.shapes;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * In this test we show an example of polymorphism and use of abstract classes.
 * We have an array of objects of type Shape, and we ask to each member of this
 * array to call the method computing its area. This might be surprising at a
 * first glance, because we know that we cannot have objects whose specific type
 * if Shape! Indeed, until run time we don't know the specific type of the
 * objects. However, we are able to do this because the objects of the derived
 * classes get upcasted to the base type when they are created (see the method
 * nextShape() of RandomShapeGenerator). Every object is then treated as a
 * general Shape in the array at compilation time, but at run time its special
 * type is recognized and the specific implementation of the method
 * computeArea() is called. This behavior is known as late binding: the code
 * being called isn’t determined until run time
 *
 * @author Andrea Mazzon
 *
 */
public class ShapeTest {

	public static void main(String[] args) {

		double basisOfTriangle = 10;
		double heightOfTriangle = 7;
		double sideOfSquare = 8;
		double radiusOfCircle = 11;
		
		int numberOfShapes = 10;

		RandomShapeGenerator generator = new RandomShapeGenerator(basisOfTriangle, heightOfTriangle, sideOfSquare,
				radiusOfCircle);

		// Fill the array with shapes:
		for (int i = 0; i < numberOfShapes; i++) {
			
			Shape shape = generator.nextShape(); // automatic upcasting
			
			/*
			 * If you just look at the reference, you might be surprised to see
			 * that shape is able to call computeArea: it is an object of type
			 * Shape and this method is abstract! However, we know that at running
			 * time Java will be able to look at the specific class of shape.
			 * 
			 */
			printn("The area is " + shape.computeArea());
			printn();
		}
	}
}
