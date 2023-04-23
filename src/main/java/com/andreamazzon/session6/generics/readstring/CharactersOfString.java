package com.andreamazzon.session6.generics.readstring;

import com.andreamazzon.session6.generics.genericinterfaces.GenericNext;

/**
 * This class implements the GenericPointer interface, In particular, it implements the method next()
 * with return type Character. The method is used in order to read all the separate characters of a
 * string, when it is called iteratively.
 *
 * @author Andrea Mazzon
 *
 */
public class CharactersOfString implements GenericNext<Character> {// I give the type of the type returned in next()

	private int count = 0;
	private String string;
	private int lengthOfTheString;

	public CharactersOfString(String string) {
		this.string = string;
		lengthOfTheString = string.length();// method of String
	}

	/**
	 * It returns the character of the string whose position is identified by count, that gets then
	 * incremented by one.
	 */
	@Override
	public Character next() {
		return string.charAt(count++);// note the method of the class String
	}

	/**
	 * It checks if we are at the end of the sequence.
	 *
	 * @return a boolean value, true if count is not equal to the length of the
	 *         string, false vice versa
	 */
	public boolean checkIfNotAtTheEnd() {
		return (count != lengthOfTheString);
	}
}
