package com.andreamazzon.session2.oophelloworldwithoverloading;

/**
 * In the main method of this class we construct an object of type
 * MessageWithOverloading, i.e., an instance of the MessageWithOverloading
 * class, in order to print a message. The message is stored in the field
 * messageToBePrinted of MessageWithOverloading. You can see that when the
 * default constructor is called, then the default value of this field is
 * printed. However, we can change its value by passing a new string in the
 * overloaded constructor. Also note method overloading in printMessage.
 *
 * @author Andrea Mazzon
 */
public class HelloWorldWithOverloading {

	public static void main(String[] args) {

		// Default constructor: the value of messageToBePrinted does not get changed.
		MessageWithOverloading myMessage = new MessageWithOverloading();
		myMessage.printMessage(); // see how a method is called

		/*
		 * Overloaded constructor: we pass a String which gives the new value of
		 * messageToBePrinted
		 */
		MessageWithOverloading myOtherMessage = new MessageWithOverloading("Good morning!");

		// here we have two methods doing the same thing in different ways: we overload
		myOtherMessage.printMessage();
		myOtherMessage.printMessage("Good evening!");
	}

}
