package com.andreamazzon.session4.composition.car;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Another, bad way to use the implementation of the method startEngine() of the class Engine.
 * It works, but it is not nice
 * 
 * @author Andrea Mazzon
 *
 */
public class BadImplementationOfCar extends Engine {

	private int age; // specific field of this class
	private int horsePower; // specific field of this class


	BadImplementationOfCar(int age, int horsePower) {
		this.age = age;
		this.horsePower = horsePower;
	}

	// specific method of Car
	public void turnRight() {
		printn("Turn right");
	}

	// specific method of Car
	public void turnLeft() {
		printn("Turn left");
	}

	// delegation: you start the engine which starts the car
	public void startCar() {
		printn("Insert the key..");
		startEngine();
	}
}
