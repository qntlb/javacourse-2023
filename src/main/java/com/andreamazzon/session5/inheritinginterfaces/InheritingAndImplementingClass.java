package com.andreamazzon.session5.inheritinginterfaces;

/**
 * This class MUST implement firstMethod(), secondMethod() (that InheritingInterface has
 * inherited from FirstInterface and SecondInterface)nand thirdMethod(), which is an own method
 * of InheritingInterface. Moreover, it overrides (but is not forced to) aClassMethod().
 *
 * @author Andrea Mazzon
 */
public class InheritingAndImplementingClass extends FirstClass implements InheritingInterface {

	@Override
	public void firstMethod() {
		System.out.println("Implementation of method 1");
	}

	@Override
	public void secondMethod() {
		System.out.println("Implementation of method 2");
	}

	@Override
	public void thirdMethod() {
		System.out.println("Implementation of inheriting method");
	}

	@Override
	void aClassMethod() {
		System.out.println("Overriding of class method");
	}
}
