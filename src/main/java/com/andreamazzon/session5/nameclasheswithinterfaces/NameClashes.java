package com.andreamazzon.session5.nameclasheswithinterfaces;

/**
 * This file illustrates possible problems due to name clashes when a class
 * implements two interfaces which have two methods with the same name, same
 * argument list but different return types.
 *
 * @author Andrea Mazzon
 *
 */

public class NameClashes implements AnInterface, AnotherInterface {

	// No problem here
	@Override
	public void overloadedMethod(int i) {
		System.out.println("A method whose name conflict is only in the argument creates no problem; "
				+ "its implementation is just overriding");
	}

	/*
	 * You can of course overload the method. Actually you have to: overloadedMethod(int i) and
	 * overloadedMethod() are different methods because they have different argument list, and a class
	 * has to implement all the methods of the interfaces it implements.
	 */
	@Override
	public void overloadedMethod() {
		System.out.println("This is the other implementation");
	}

	/*
	 * Here you get an error if you uncomment int methodWithDifferentReturnTypes()
	 * in AnotherInterface
	 */
	@Override
	public void methodWithDifferentReturnTypes() {
		System.out.println("Implementation of the method of AnInterface");
	}

	// IT DOES NOT WORK! Because the signature is the same.
//	@Override
//	public int methodWithDifferentReturnTypes(){
//	 System.out.println("Implementation of the method of AnotherInterface");
//	 return 1;
//	}
}
