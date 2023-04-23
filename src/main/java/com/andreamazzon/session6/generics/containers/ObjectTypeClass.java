package com.andreamazzon.session6.generics.containers;

/**
 * This is a container for an object of whatever type: Object is the largest class in Java,
 * everything is an Object, i.e., all the classes implicitly extend Object.
 *
 * @author Andrea Mazzon
 *
 */
public class ObjectTypeClass {

	private Object whateverTypeField;

	// polymorphism at its maximum! You can give whatever object as an argument
	public void setField(Object a) {
		this.whateverTypeField = a;
	}

	public Object getField() {
		return whateverTypeField;
	}
}
