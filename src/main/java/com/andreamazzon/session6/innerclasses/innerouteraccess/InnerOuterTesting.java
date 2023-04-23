package com.andreamazzon.session6.innerclasses.innerouteraccess;

/**
 * This class illustrates some syntax about inner classes. In particular, we see
 * how objects of the inner class are created. Their methods are called as
 * always.
 *
 * @author Andrea Mazzon
 *
 */

public class InnerOuterTesting {
	public static void main(String[] args) {
		Outer outer = new Outer();// object of the outer class
		Outer.Inner innerObject = outer.new Inner();// object of the inner class. Note the syntax!
		// returnOuterField method of the inner class
		System.out.println("Outer field: " + innerObject.returnOuterField());
		// returnInnerField method of the outer class
		System.out.println("Inner field: " + outer.returnInnerField());
	}
}