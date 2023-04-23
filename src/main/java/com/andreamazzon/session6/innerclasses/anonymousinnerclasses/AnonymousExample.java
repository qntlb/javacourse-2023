package com.andreamazzon.session6.innerclasses.anonymousinnerclasses;

/**
 * This class has a main method that shows how anonymous inner classes work.
 *
 * @author Andrea Mazzon
 *
 */
public class AnonymousExample {

	public static void main(String[] args) {
		Envelope envelope = new Envelope();//object of the outer class
		envelope.getMessage().read(); //getMessage returns an object of the inner class!
	}
}




