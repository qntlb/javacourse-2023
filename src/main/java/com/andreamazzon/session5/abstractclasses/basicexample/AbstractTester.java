package com.andreamazzon.session5.abstractclasses.basicexample;

/**
 * This class has a main method which creates an object of DerivedClassFromAbstract,
 * that extends the abstract class AbstractBaseClass, and pass it to the callMethod
 * method of OtherClass.
 * Note that this method takes as an argument an object of a class which extends
 * AbstractBaseClass: the object here gets implicitly upcasted.
 *
 * @author Andrea Mazzon
 *
 */
public class AbstractTester {
	public static void main(String[] args) {
		/*
		 * It is not possible to create objects of AbstractBaseClass! 
		 * They would not be able to call abstractMethod().
		 */
		//AbstractBaseClass abstractBase = new AbstractBaseClass();
		
		// the constructor of the base class is called
		DerivedClassFromAbstract objectOfDerivedClass = new DerivedClassFromAbstract(); 
		OtherClass.callMethod(objectOfDerivedClass); // implivit upcasting
		objectOfDerivedClass.nonAbstractMethod(); // directly inherited
		objectOfDerivedClass.abstractMethod();

		objectOfDerivedClass.specificMethod();
	}
}
