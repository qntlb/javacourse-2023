package com.andreamazzon.session6.exceptions.divisions;

public class MyException extends Exception {

	public void printExceptionMessage() {// method you want to call when you catch the exception
		System.out.println("I caught a general exception");
	}
}
