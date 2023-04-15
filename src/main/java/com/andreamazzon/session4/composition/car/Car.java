package com.andreamazzon.session4.composition.car;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class shows delegation through composition: you have to define a class
 * Car, and you want to use the only method of the class Engine to start it.
 * Thinking in this way, you might think to use inheritance. However, inheritance
 * usually expresses a relation of the type "DerivedClass is a type of BaseClass",
 * whereas we cannot really say that Car "is of type" Engine. We could say more
 * that Car "has" an Engine: in this case, composition is what we need: Car has
 * a field of type Engine, which implements a method start().
 * Car also has a method start() which uses an object of type Engine and ask it
 * (delegates it) to call the engine() method of Engine. Car is in fact DELEGATING
 * to Engine the implementation of the method.
 *
 * @author Andrea Mazzon
 *
 */
public class Car {

	private int age = 1; // specific field of this class
	private int horsePower; // specific field of this class

	private Engine engine; // a field which is a class; not a primitive type. Composition

	Car(int age, int horsePower) {
		this.age = age;
		this.horsePower = horsePower;
		engine = new Engine();
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
		engine.startEngine();
	}

}
