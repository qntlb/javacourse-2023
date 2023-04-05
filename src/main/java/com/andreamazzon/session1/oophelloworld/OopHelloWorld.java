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

		Message myOtherMessage = new Message();

		myMessage.messageToBePrinted = "Good evening";// see how a field of an object is manipulated

		myMessage.printMessage(); // see how a method is called
		myOtherMessage.printMessage();

		System.out.println("Hi world! " + myMessage.messageToBePrinted); // see how a field of an object is accessed

		// we do the same with the other object
		myOtherMessage.messageToBePrinted = "Hallo";
		
		/*
		 * Same method, same inputs (well, no input at all), different results. The
		 * output of method usually depends on the (value of the fields of) the object
		 * calling the method!
		 */
		myOtherMessage.printMessage();

		/*
		 * Not always, anyway: we will see how to treat methods whose output does no
		 * depend on the object calling them
		 */
		String firstMessage = "Goodbye";
		String secondMessage = "Bye bye";

		myMessage.printMessageWithArgument(firstMessage);
		myOtherMessage.printMessageWithArgument(secondMessage);
	}
}
