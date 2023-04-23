/**
 * The class Divider has a static void Divide method which serves as an example of
 * how exceptions are handled and thrown.
 * An exception is indeed an object that is “thrown” from the site of the error and
 * can be “caught” by an appropriate exception handler designed to handle that particular
 * type of error. When you throw an exception, first, the exception object is created in
 * the same way that any Java object is created: on the heap, with new. Then the current
 * path of execution (the one you couldn’t continue) is stopped and the reference for the
 * exception object is ejected from the current context.
 * In this example, in the class Divider you start by dividing a double firstDividend by a
 * double divisor. If divisor is zero, you get an exception: we indeed create a class
 * DivideByZeroException, extending Exception, with a method printExceptionMessage() which
 * prints a message saying that you are dividing by zero (see the syntax in this class).
 * Otherwise, you get the result and divide it by divisor and so on, until you reach a number
 * whose absolute value is smaller then 0 (and you get an UnderflowException, also defined as a
 * class extending Exception) or bigger than Double.MAX_VALUE (and you get an OverFlowException,
 * again, a class defined in this package and extending Exception).
 * Have a look at ExceptionChecker in order to see the syntax you have to use when calling a method
 * that can throw one or more exceptions. You see that if you don’t write your code to properly handle
 * exceptions, you’ll get a compile-time error message.
 *
 */
package com.andreamazzon.session6.exceptions.divisions;