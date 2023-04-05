package com.andreamazzon.session2.oophelloworldwithoverloading;

/**
 * The main use of this class is to print a message. It has one field,
 * messageToBePrinted, which has a default value. There is a (default)
 * constructor, whose side effect is to let us know that a new object has been
 * created, and a constructor which takes a string as argument and sets the value
 * of messageToBePrinted equal to that String. We then have a method
 * printMessage(), which just prints the value of messageToBePrinted, and an
 * overloaded method printMessage(String messageViaMethod) which prints messageViaMethod.
 *
 * @author Andrea Mazzon
 */
public class MessageWithOverloading {

	String messageToBePrinted = "Default hello message";

	/*
	 * Default constructor, because it has no arguments. Note: no return type. This
	 * is different from void, when the method returns nothing but you still
	 * have the option to make it return something else (changing from void to the type
	 * of the object it returns).
	 */
	MessageWithOverloading() {
		// side effect
		System.out.println("A new object is created. messageToBePrinted does not get changed");
	}

	/*
	 * Overloaded constructor: in this case, it has a list with one argument. Note that it has
	 * same name of the default constructor but different argument list. This is fine because the
	 * "signature" of a methid is indeed constituted by its name and its argument list.
	 */
	MessageWithOverloading(String message) {
		// side effect
		System.out.println("A new object is created. messageToBePrinted gets changed");
		messageToBePrinted = message;
	}

	void printMessage() {// this method prints the message contained in the string messageToBePrinted of the object
		System.out.println(messageToBePrinted);
	}
	

	/*
	 * This method also prints a string: not the one contained in
	 * messageToBePrinted, but one string passed through the argument list. This two
	 * methods do the same thing, but in different ways. So, we could overload..
	 */
	void printMessage(String messageViaMethod) {
		System.out.println(messageViaMethod);
	}
}
