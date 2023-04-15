package com.andreamazzon.session4.inheritance.phones;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class illustrates one of the uses of inheritance: having the same methods and fields
 * of the parent class - without having to introduce them again - plus possibly new methods
 * or fields typical of the derived class. Moreover, it also shows how overriding works.
 *
 * @author Andrea Mazzon
 *
 */
public class Smartphone extends Phone {

	
	Smartphone() { //it automatically calls also the constructor of the base class
		printn("But also to navigate on internet");
		isSmartphone = true;
	}
	
	
	/*
	 * First example of overriding here: we give another implementation to a method of the
	 * base class. The annotation @override is there to let Java give us a compilation error
	 * if we are actually not overriding any method of the base class (maybe because of a typo).
	 */
	@Override
	protected void call() {
		super.call();//call to the method of the parent class
		printn("I also have the possibility to video call"); 
	}

	
	//methods specifically defined in this class: not inherited nor overridden
	void goOnInternet() { // this is a specific method of the derived class
		printn("I am navigating on Internet");
	}	
	
	void goOnInternetAndThenCall() { // this is a specific method of the derived class
		printn("I am navigating on Internet, to get the information that is useful for the person I will call");
		call();//note that this will call the implementation given here
	}	
	
	
}