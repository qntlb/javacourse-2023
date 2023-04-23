/**
 * Here we have one more example on the use of inner classes.
 * In particular, the private inner class MessagePrinter of Message implements the interface Printer.
 * A reference to this interface is returned by the method getAPrinter() of Message, with an object
 * of type MessagePrinter attached. In this way, the user only sees the method of Printer implemented
 * by MessagePrinter, and not the class itself, because it is private. Note that private classes only
 * make sense if they are inner classes. Otherwise objects of such classes cannot be created.
 */
package com.andreamazzon.session6.innerclasses.privateinnerclasses;