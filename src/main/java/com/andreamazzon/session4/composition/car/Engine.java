package com.andreamazzon.session4.composition.car;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class has one only method, start(). This is also a method of the class
 * Car, which delegates its implementation to this class.
 *
 * @author Andrea Mazzon
 *
 */
public class Engine {
	public void startEngine() { // starts the engine
		printn("Engine starts (and so it starts the car)");
	}
}
