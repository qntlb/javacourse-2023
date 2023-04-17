package com.andreamazzon.session5.abstractclasses.basicexample;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This is an abstract class, with one abstract method and one implemented method (i.e., non abstract). 
 * Note: if at least one method of the class is abstract then the class must be declared abstract too.
 * Of course the non abstract method can be overridden as well by inheriting classes.
 */
public abstract class AbstractBaseClass {

	protected abstract void abstractMethod();

	protected void nonAbstractMethod() {
		printn("Non abstract method");
	}

}
