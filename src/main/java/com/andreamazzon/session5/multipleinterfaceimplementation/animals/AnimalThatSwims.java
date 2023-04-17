package com.andreamazzon.session5.multipleinterfaceimplementation.animals;

/**
 * Interface with two methods, swim() and eat(). The eat() method is also a
 * method of AnimalThatFlies.
 *
 * @author Andrea Mazzon
 *
 */
public interface AnimalThatSwims {

	void swim();

	void eat();

	double interfaceField = 11;
}
