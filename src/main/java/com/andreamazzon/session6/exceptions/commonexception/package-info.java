/**
 * In this package we see how a common run time error is handled in Java by an exception.
 * In particular, in the class ArrayExample we set an array of length 10 and we try to access its eleventh entry.
 * An ArrayIndexOutOfBoundsException is then thrown. This kind of exception is automatically thrown by Java,
 * like for example NullPointerException. They are derived classes of RuntimeException, that itself extends Exceptions
 * For exceptions derived from RuntimeException you don't need to write an exception specification saying that a
 * method might throw such an exception, as we see for example for the exceptions in
 * com.andreamazzon.session6.exceptions.divisions: they are so common that if you had to do so, your code would have
 * been too messy.
 */
package com.andreamazzon.session6.exceptions.commonexception;