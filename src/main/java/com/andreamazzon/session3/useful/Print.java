package com.andreamazzon.session3.useful;

/**
 * This class contains methods in order to print an object. It uses the Java println(Object o)
 * and print(Object o) methods of the class System.out.
 * Note that all the methods are public: they are supposed to be used by classes outside
 * this package. This is indeed an example of how public methods are used and called.
 *
 *
 * @author Andrea Mazzon
 *
 */
public class Print {
	/**
	 * It prints a string and terminates the line
	 *
	 * @param o: object to be printed
	 */
	/*
	 * Note that the methods are public: in this way they can be accessed from
	 * outside the package. Also note that they are static: they are not binded to
	 * the data of the class
	 *
	 */
	public static void printn(Object o){
		System.out.println(o); //System.out.println(String s) prints the string s and terminates the line
	}

	/**
	 * It prints a line break
	 */
	public static void printn(){//overloaded!
		System.out.println();
	}

	/**
	 * It prints a string, without terminating the line
	 *
	 * @param o: object to be printed
	 */
	public static void print(Object o){
		System.out.print(o); //System.out.print(Object o) prints the object without newline
	}
}
