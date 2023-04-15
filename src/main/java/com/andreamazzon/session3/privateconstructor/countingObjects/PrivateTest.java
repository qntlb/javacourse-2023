package com.andreamazzon.session3.privateconstructor.countingObjects;

/**
 * This class shows the use of the class PrivateConstructorClass. We see how, thanks to
 * our implementation of PrivateConstructorClass, it is possible to create only a single
 * object of that class.
 *
 * @author Andrea Mazzon
 *
 */
public class PrivateTest{
	public static void main(String[] args){
		
		//PrivateConstructorClass anObject = new PrivateConstructorClass(); //we cannot
		//PrivateConstructorClass anotherObject = new PrivateConstructorClass(); //we cannot
		//PrivateConstructorClass oneMoreObject = new PrivateConstructorClass(); //we cannot

		
		//the private constructor is called from inside the class PrivateConstructorClass
		PrivateConstructorClass firstObject = PrivateConstructorClass.CreateOneObject();
		//this second object does not get created
		PrivateConstructorClass secondObject = PrivateConstructorClass.CreateOneObject();
	}
}
