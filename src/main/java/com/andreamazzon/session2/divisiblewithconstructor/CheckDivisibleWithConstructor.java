package com.andreamazzon.session2.divisiblewithconstructor;

/**
 * In this class we check if an integer is divisible by another integer. The two are passed by the
 * constructor, which takes two integers as arguments. It illustrates one use of the "this" keyword, i.e.,
 * allowing for the argument name of the constructor to match the field name.
 *
 * @author Andrea Mazzon
 */
public class CheckDivisibleWithConstructor {

	int dividend;
	int divisor;

	//the constructor
	CheckDivisibleWithConstructor(int dividend, int divisor)
	{
		/*
		 * The constructor sets the data field this.dividend to the value of the argument dividend.
		 * The keyword this resolves the name clash (otherwise the local variable/parameter "shadows" the field).
		 */
		this.dividend = dividend;//note the use of this
		this.divisor = divisor;
	}

	//the method checks if dividend is divisible by dividend. These are fields of the class.
	void check() {
		if (dividend % divisor == 0) {
			System.out.println(dividend + " is divisible by " + divisor);
		} else {
			System.out.println(dividend + " is not divisible by " + divisor);
		}
	}

}
