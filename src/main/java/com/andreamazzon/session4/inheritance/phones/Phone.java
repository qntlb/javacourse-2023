package com.andreamazzon.session4.inheritance.phones;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * Base class: two fields and one method, which will be inherited from the derived class
 *
 * @author Andrea Mazzon
 *
 */
public class Phone {

	protected boolean isSmartphone;
	
	protected Phone() { //constructor: it will be called by the constructor of the derived class
		printn("You can use such a class to communicate with people");
		isSmartphone = false;
	}

	//this method will be inherited from the derived class
	protected void call() {
		printn("I call a person");
	}
	
	//this method will be inherited from the derived class
	protected void checkIfSmartphone() {
		printn("Value of the field isSmartphone: " + isSmartphone);
	}

}
