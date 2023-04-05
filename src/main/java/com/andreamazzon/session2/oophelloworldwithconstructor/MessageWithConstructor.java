package com.andreamazzon.session2.oophelloworldwithconstructor;

/**
 * The main use of this class is to print a message. It has one field, messageToBePrinted,
 * one (default) constructor, whose side effect is to print a message, and two methods,
 * printMessage() and printMessageWithArgument(String message).
 *
 * @author Andrea Mazzon
 */
public class MessageWithConstructor {

	String messageToBePrinted = "Standard message: it can be modified";

	/*
	 * Default constructor, because it has no arguments. Note: no return type. This
	 * is different from void, when the method returns nothing but you still
	 * have the option to make it return something else (changing from void to the type
	 * of the object it returns).
	 */
	MessageWithConstructor() {
		//side effect: a message is printed
		System.out.println("A new object is created");
	}

	// this method prints the message contained in the string messageToBePrinted of the object
	void printMessage() {
		System.out.println(messageToBePrinted);
	}

	/*
	 * This method also prints a string: not the one contained in
	 * messageToBePrinted, but one string passed through the argument list. This two
	 * methods do the same thing, but in different ways. We will see in some time
	 * how to deal with this situation
	 */
	void printMessageWithArgument(String messageViaMethod) {
		System.out.println(messageViaMethod);
	}
}
