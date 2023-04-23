package com.andreamazzon.session6.innerclasses.nestedclasses;

public class NestedTest {

	public static void main(String[] args) {
		/*
		 * Here we create an object of a static inner class. You can note that now you don't
		 * need an object of the outer class.
		 */
		Outer.StaticInner staticInner = new Outer.StaticInner();
		// call of the method as always
		int outerData = staticInner.getOuterStaticData();
		System.out.println("The outer static, int field is " + outerData);
	}

}
