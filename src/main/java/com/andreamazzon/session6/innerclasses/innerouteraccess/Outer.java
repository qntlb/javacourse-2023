package com.andreamazzon.session6.innerclasses.innerouteraccess;

/**
 * This class contains a private int field, which is accessed by its inner class.
 * The inner class has also a private int field, which can be accessed by the outer
 * class after producing an object of the inner class.
 *
 * @author Andrea Mazzon
 *
 */
public class Outer {

	private int outerField = 10; // private! But still can be accessed from the inner class

	public void setOuterField(int outerField) {
		this.outerField = outerField;
	}

	/**
	 * It returns the value of innerField, a private field of the inner class
	 * 
	 * @return innerField, private field of the inner class
	 */
	public int returnInnerField() {
		Inner innerObject = new Inner(); // new object of the inner class
		return innerObject.innerField; // innerField field
	}

	/**
	 * Inner class of an outer class. It can access its private field.
	 *
	 * @author Andrea Mazzon
	 *
	 */
	public class Inner {		
		private int innerField = 8;// its own private field

		/*
		 * It has methods that depend on the specific value of a field of the outer
		 * class: it makes sense that an object of this inner class needs a reference to
		 * the object of the outer class that created it.
		 */
		public int returnOuterField() {
			return outerField; // it simply accesses it
		}

		public int sumOuterInner() {
			return outerField + innerField;
		}

	}

}
