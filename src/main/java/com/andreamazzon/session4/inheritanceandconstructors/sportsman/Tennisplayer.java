package com.andreamazzon.session4.inheritanceandconstructors.sportsman;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Example of a derived class when the parent class has only constructors with
 * arguments: in this case, you must explicitly call the constructor of the
 * parent class, using "super". This makes sense: you have to give the arguments
 * to the constructor you want to call. Note: if the parent class has also a
 * default constructor, its default constructor gets called if you don't specify
 * any "super". Try to verify this behaviour adding a default constructor to
 * Sportsman and then commenting out super(name).
 * Note that a tennis player IS a sportsman. This is a very simple example of inheritance.
 *
 * @author Andrea Mazzon
 *
 */
public class Tennisplayer extends Sportsman {

	Tennisplayer(String name) {
		// call to the base class constructor with the appropriate argument list
		super(name);// try to comment it out!
		printn("In particular, I am a tennis player");
	}
}
