package com.andreamazzon.session5.abstractclasses.shapes;

/**
 * This is a base class from which the three classes Circle, Square and Triangle inherit. It has an ABSTRACT computeArea
 * method: we are not able to give an implementation of this method for a general Shape, but only for specific shapes.
 * We define it to be abstract, so that the class must me defined to be abstract as well. The non abstract method draw()
 * is implemented (drawing a shape can be thought as something that is done in the same way from all the shapes)
 * and thus directly inherited from the derived classes. Of course, we are anyway free to override it if we want.
 */
public abstract class Shape {

	/**
	 * It draws a shape
	 */
	public void draw() {
		System.out.println("Drawing the shape");
	}

	/**
	 * It computes the area of a shape. Abstract: the implementation will be given by the derived classes.
	 * @return the area of the shape
	 */
	public abstract double computeArea();
}


