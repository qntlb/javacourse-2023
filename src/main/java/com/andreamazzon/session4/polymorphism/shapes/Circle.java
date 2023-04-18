package com.andreamazzon.session4.polymorphism.shapes;

/**
 * Particular kind of shape, for which we know how to compute the area, i.e.,
 * how to implement the method computeArea().
 *
 * @author Andrea Mazzon
 *
 */
public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	/*
	 * Note the @Override annotation: if we use it, we get an error if our method is
	 * not overriding a method of the parent class. This is useful to avoid mistakes
	 * (for example we are accidentally changing the name of the method)
	 */
	@Override
	public double computeArea() {
		System.out.println("Computing the area of this circle..");
		return Math.PI * radius * radius;
	}
	
}