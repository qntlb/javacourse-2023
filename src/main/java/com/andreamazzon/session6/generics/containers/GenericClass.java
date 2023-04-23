package com.andreamazzon.session6.generics.containers;

/**
 * This class is a container for a generic type, and this is specified by the T inside angle
 * brackets after the class name. You substitute an actual type when you use the class.
 *
 * @param <T> the type of the object returned by the getField() method and taken as an argument
 * by the setField() method
 *
 * @author Andrea Mazzon
 * @param <T>
 */
public class GenericClass<T> {
	/*
	 * Of course we could specify T to be a general object and remove the parametrization, but
	 * this would mean that DIFFERENT types could be used in any call of a method for the same
	 * object of GenericClass. But typically you will put only one type of object in a container,
	 * once you have created one (i.e., once you have created an object of that container).
	 * This is why we use generics.
	 */
	private T genericField; // T is the "type parameter"

	public void setField(T valueOfGenericField) {// generic constructor
		genericField = valueOfGenericField;
	}

	public T getField() {// generic getter
		return genericField;
	}
}
