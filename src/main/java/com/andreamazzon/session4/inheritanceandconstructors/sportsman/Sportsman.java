package com.andreamazzon.session4.inheritanceandconstructors.sportsman;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Parent (or base) class: it has one constructor taking a String as an argument
 *
 * @author Andrea Mazzon
 *
 */
public class Sportsman {

	/*
	 * In Tennisplayer, we see that if we don't define a default constructor in the
	 * base class, we have to explicitly call a constructor of the base class, giving
	 * it the arguments it needs.
	 */
	Sportsman(String name) {
		printn("I am a sportsman. My name is " + name);
	}
	
	/*
	 * Try to uncomment it: if you do so, you don't need to explicitly call the
	 * super constructor in the derived class
	 */
	//Sportsman() {
	//	printn("Default parent constructor");
	//}
}
