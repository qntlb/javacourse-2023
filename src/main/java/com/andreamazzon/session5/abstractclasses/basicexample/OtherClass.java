package com.andreamazzon.session5.abstractclasses.basicexample;

/**
 * This class has a method callMethod which takes as an argument an object of a
 * class which EXTENDS AbstractBaseClass: as we see in line 20, it is indeed not
 * possible to create objects of the base, abstract class. Without polymorphism,
 * therefore, having a method with such an argument would be not possible.
 * Instead, thanks to late binding we are able to forget about the specific type
 * of the object passed to the method until run time. One of the nice aspects of
 * this behaviour is that if we want to define another class extending
 * AbstractBaseClass we don't have to change the implementation and the argument
 * list of callMethod.
 *
 */
public class OtherClass {
	static void callMethod(AbstractBaseClass objectOfBaseClass) {
		// abstractMethod is implemented in every class extending AbstractBaseClass
		
		objectOfBaseClass.abstractMethod();
		
		//objectOfBaseClass.specificMethod(); //error
		
		//AbstractBaseClass myObject = new AbstractBaseClass(); //does not work
	}
}

