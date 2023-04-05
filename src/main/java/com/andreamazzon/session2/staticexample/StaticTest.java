package com.andreamazzon.session2.staticexample;

/**
 * This class illustrates the behavior of static methods and static variables,
 * constructing objects of type StaticExample. Main things to note: 
 * - static methods can be called also by writing NameOfClass.nameOfMethod
 *  - static fields are stored in one just piece of memory: once they are modified, their
 * value changes for all the objects
 *
 * @author Andrea Mazzon
 */
public class StaticTest {

	public static void main(String[] args) {

		StaticExample firstObject = new StaticExample();
		StaticExample secondObject = new StaticExample();

		firstObject.printFields();
		secondObject.printFields();
		System.out.println("\n");

		/*
		 * We assign a new value to the non-static field of the first object: of course,
		 * it changes only for the first object
		 */
		firstObject.nonStaticField = 2;

		firstObject.printFields();
		
		secondObject.printFields();

		System.out.println("\n");

		StaticExample.staticModifier();// the value of the static field is incremented by 1

		/*
		 * Static variables are allocated in the same piece of storage for all objects of the class:
		 * if you modify it will be the same for all the objects
		 */
		firstObject.printFields();
		secondObject.printFields();

		System.out.println("\n");

		/*
		 *  Also new objects of that class will have the same static variable: again, all the instances of
		 *  the class will have the same value for the static variable. It makes sense: the variable
		 *  "has not to know" which object is working for.
		 */
		StaticExample thirdObject = new StaticExample();
		thirdObject.printFields();

		/*
		 * You can also modify static fields, or call methods from direct object calls,
		 * but this is bad practice
		 */
		System.out.println("\n");
		
		firstObject.staticField = 10;//bad practice
		
		secondObject.printFields();
	}
}
