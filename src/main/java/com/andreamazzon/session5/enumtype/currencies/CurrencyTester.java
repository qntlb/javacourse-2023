package com.andreamazzon.session5.enumtype.currencies;

/**
 * This class contains a main method that illustrates some uses of enum types
 *
 * @author Andrea Mazzon
 *
 */
public class CurrencyTester {
	public static void main(String[] args) {

		DescribeCurrency currencyDescribe = new DescribeCurrency();

		/*
		 * You refer to a value of an enum type like to a static field of a class:
		 * NameOfTheEnumType.NAMEOFTHEVALUE
		 */
		currencyDescribe.setDescribedCurrency(Currency.DOLLAR);
		currencyDescribe.describe();
		System.out.println();

		/*
		 * Let's have a look now at some specific, pre-implemented methods that an
		 * object of an enum type can call.
		 */

		// Let's start from ordinal():
		System.out.println("The position of EURO is " + Currency.EURO.ordinal());
		System.out.println();

		/*
		 * values() is a method of enum types that produces the array of all the values
		 * of the enum constant We go through that array in the for loop.
		 */
		Currency[] currencyValues = Currency.values();
		for (Currency currency : currencyValues) {// look at the foreach syntax!
			currencyDescribe.setDescribedCurrency(currency);
			currencyDescribe.describe();
		}
	}
}