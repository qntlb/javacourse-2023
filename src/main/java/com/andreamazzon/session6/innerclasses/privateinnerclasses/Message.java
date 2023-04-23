package com.andreamazzon.session6.innerclasses.privateinnerclasses;

/**
 * This is a public access class which has one private field and a private inner class.
 * The private inner class implements the interface Printer. The private field is accessed by the
 * inner class.
 * An object of the private inner class, attached to a reference of Printer, is returned
 * by the getAPrinter() method.
 *
 * @author Andrea Mazzon
 *
 */
public class Message {

	// this is the message printed by the print() method if the inner class
	private String message;

	/**
	 * Constructor of the class Message
	 *
	 * @param message, the message you want to print
	 */
	Message(String message) {
		this.message = message;
	}

	/**
	 * @return an object of type Printer, i.e., an object which is able to call the
	 *         method print() of the interface Printer.
	 */
	public MessagePrinter getAPrinter() {
		/*
		 * Note that a priori, from the outside you don't know the specific type of the
		 * object returned by this method
		 */
		return new MessagePrinter();
	}

	private class MessagePrinter implements Printer {
		/**
		 * It prints the message passed by the constructor of Message
		 */
		@Override
		public void print() {
			System.out.println(message);
		}
	}

}
