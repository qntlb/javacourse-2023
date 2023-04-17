package com.andreamazzon.session5.interfacesandpolymorphism.band;

/**
 * Class implementing the interface Instrument: it must implement the method
 * play(Note n)
 *
 * @author Andrea Mazzon
 *
 */
public class Percussion implements Instrument {
	/**
	 * It prints "Percussion plays" plus the type of the Note given as argument.
	 * 
	 * @param n: a value of the enum type Note
	 */
	@Override
	public void play(Note n) {// a method that take as argument the value of the enum type Note
		System.out.println("Percussion plays " + n);
	}
}
