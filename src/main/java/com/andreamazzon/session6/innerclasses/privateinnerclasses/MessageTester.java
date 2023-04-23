package com.andreamazzon.session6.innerclasses.privateinnerclasses;

/**
 * The main method of this class shows how to create objects of an inner,
 * private class implementing an interface by a getter method of the outer
 * class. This hides everything from outside the class. Note that once you
 * create such an object you have to attach it to a reference of the interface. 
 *
 * @author Andrea Mazzon
 *
 */
public class MessageTester {

	public static void main(String[] args) {

		Message message = new Message("Good morning");

		/*
		 * In order to create an object of the inner class, you need an object of the
		 * outer class: the object of the inner class is connected to the one of the
		 * outer class. Here, since the inner class MessagePrinter is private, you can
		 * create an object of this type only using the getter method of the outer class
		 * Message. You see that you attach such an object to a reference to the
		 * interface Printer implemented by MessagePrinter. This is safe, since the only
		 * method of MessagePrinter is the one of the interface. And you HAVE to do
		 * that: indeed, you cannot assign it to a reference of type MessagePrinter
		 * because outside its class you cannot know what MessagePrinter is. In this
		 * way, you really hide everything not regarding the method(s) of the interface
		 * from the user: the user do not even know of which class the object returned
		 * by message.getAPrinter() is.
		 */
		Printer printer = message.getAPrinter();

		// this is the method of the interface
		printer.print();

	}

}
