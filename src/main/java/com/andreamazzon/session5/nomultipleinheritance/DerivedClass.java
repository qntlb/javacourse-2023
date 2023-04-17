package com.andreamazzon.session5.nomultipleinheritance;

/**
 * This class extends FirstParentClass. It has a specific method and inherits
 * the implementation of methodWithSameName(). If we make it SecondParentClass
 * as well, which implementation would it inherit?
 * Nite that this is just a motivation: we could not write something like
 * public class DerivedClass extends FirstParentClass, SecondParentClass
 * even if there was no conflict.
 *
 * @author Andrea Mazzon
 *
 */
public class DerivedClass extends FirstParentClass {

	/*
	 * This class has no constructor, but so the default one implemented in
	 * Java is called. If this class inherits from both classes, both the parents
	 * constructors are called: and then, to which value should i be set?
	 */
	
	
	public void specificMethod() {
		System.out.println("A method of the derived class");
	}

	public void printI() {
		System.out.println(i);
	}
}
