package com.andreamazzon.session3.privateconstructor.countingObjects;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field has been defined.
 */
import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class has a private constructor: it is not possible to directly create
 * an object of this class. We have a method which calls the constructor from inside
 * the class only if no object of this class have been previously created.
 *
 * @author Andrea Mazzon
 *
 */
public class PrivateConstructorClass{

	// This field is static: it must be accessed from the static method CreateOneObject()
	private static int howManyObjects = 0;
	
	PrivateConstructorClass(){ //private constructor
		printn("This is a private constructor. An object gets created. Number of objects created: " + howManyObjects);
	};

	/*
	 * This method can be accessed outside the PrivateConstructorClass class: it is static, so you don´t need
	 * to create an object of such class to call it. This is important, because actually its goal is exactly
	 * to create an object of the class! Note that the method returns a reference to an object, not the data
	 * stored in the object.
	 */
	public static PrivateConstructorClass CreateOneObject() {
		if (howManyObjects < 1) {
			howManyObjects ++;
			PrivateConstructorClass newObject = new PrivateConstructorClass();
			//the constructor can of course be accessed from inside the class
			return newObject;
		} //no need for else: if howManyObjects = 0, "return" immediately exits the method
		printn("No more objects!");
		//you have to place a return, otherwise the compiler complains
		return null; 
	}
}