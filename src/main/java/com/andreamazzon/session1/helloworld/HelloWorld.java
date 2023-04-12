package com.andreamazzon.session1.helloworld;//first line: package your file belongs to

//Javadoc documentation
/**
 * This class prints the classic hello world message
 *
 * @author Andrea Mazzon
 */
//note how a class is created: class keyword followed by the name. More about "public" in some time
public class HelloWorld {//same name of the file! Otherwise the compiler would complain, because the class is public.
	// class body between brackets

	// public, static: we will see the meaning later on
	public static void main(String[] args) { // Entry point: the argument is an array of string objects

		// special Java feature: String can be initialized with quoted text.
		String myString = "Hello world!";// we create a String reference and we initialize it
			
		// or:
		
		// typical way to construct objects: more about this later on
		String myString2 = new String("Hello world!"); 

		// it can also be done separately:
		String myNewString; // declaration: creation of the string reference
		
		/*
		 * Initialization: first time we assign a value. We get an error at compilation time if we try to use myNewString 
		 * without having initialized it
		 */
		myNewString = "Hello again!";
		System.out.println(myString); // we print the string inside parenthesis plus a new line.
		
		// This is part of a library of classes that are automatically brought into every Java file
		System.out.println(myNewString); // Printing

	}
}