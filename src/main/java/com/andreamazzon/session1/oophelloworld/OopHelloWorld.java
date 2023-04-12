package com.andreamazzon.session1.oophelloworld;

/**
 * In the main method of this class we construct an object of type Message,
 * i.e., an instance of the Message class, in order to print an hello message
 *
 * @author Andrea Mazzon
 */
public class OopHelloWorld {

	public static void main(String[] args) {

		/*
		 * Object creation: NameOfClass nameOfObject = new NameOfClass(); Message() is a
		 * particular method called constructor. More about this tomorrow
		 */
		Message myMessage = new Message();

		myMessage.printMessage(); // see how a method is called

		System.out.println();// we make a line between two prints

		System.out.println("Hi world! " + myMessage.messageToBePrinted); // see how a field of an object is accessed

		System.out.println();
		
		Message myOtherMessage = new Message();
		
		myOtherMessage.printMessage();
		
		System.out.println();

	
		// we do the same with the other object
		myOtherMessage.messageToBePrinted = "Hallo";
		
		/*
		 * Same method, same inputs (well, no input at all), different results. The
		 * output of method usually depends on the (value of the fields of) the object
		 * calling the method!
		 */
		myOtherMessage.printMessage();
		myMessage.printMessage(); // see how a method is called

		System.out.println();

		/*
		 * Not always, anyway: we will see how to treat methods whose output does no
		 * depend on the object calling them
		 */
		String firstMessageToBeGiven = "Goodbye";
		String secondMessageToBeGiven = "Bye bye";

		myMessage.printMessageWithArgument(firstMessageToBeGiven);
		myOtherMessage.printMessageWithArgument(secondMessageToBeGiven);
	}
}
