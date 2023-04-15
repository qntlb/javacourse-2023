package com.andreamazzon.session4.composition.car;

/**
 * This class tests composition and delegation; it is possible to call the
 * start() method of car, that calls itself the one of Engine.
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {
	public static void main(String[] args) {
		int age = 2;
		int horsePower = 100;
		Car car = new Car(age, horsePower);
		car.startCar();// look at it: it delegates
	}
}