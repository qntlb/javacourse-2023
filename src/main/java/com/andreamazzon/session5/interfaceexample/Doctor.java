package com.andreamazzon.session5.interfaceexample;

/**
 * This class implements the interface Cure, and gives indeed an implementation to
 * the two methods defined in Cure.
 *
 * @author Andrea Mazzon
 *
 */
public class Doctor implements Cure {
	/*
	 * Note that you have to declare the method to be public. Methods of interfaces
	 * are implicitly public, so you can avoid to specify it when you define the
	 * interface. However, you have to declare them to be public in the classes
	 * implementing the interface. Also note the @Override annotation: this is just
	 * as if you override an abstract method of an abstract class.
	 */
	@Override
	public void diagnose() {
		System.out.println("You just have a bad cold");
	}

	@Override
	public void heal() {
		System.out.println("Take some aspirines!");
	}

	// however, it can also have some own methods:
	public void aDoctorMethod() {
		System.out.println("Speak to the patient");
	}
}
