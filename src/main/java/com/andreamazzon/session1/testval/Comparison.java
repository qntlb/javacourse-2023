package com.andreamazzon.session1.testval;

/**
 * This class is used to check if a given number is inside an interval. Example
 * of if/else statement with logic operators
 *
 * @author Andrea Mazzon
 */
public class Comparison {

	// note: Javadoc documentation of a method: we explain which are the parameters
	// and the return value
	/**
	 * The method evaluates if a number is inside an interval
	 *
	 * @param testedNumber: number which has to be tested
	 * @param leftEnd:      left end of the interval
	 * @param rightEnd:     right end of the interval
	 * @return true if testval is inside the interval, false if not
	 */
	boolean /* boolean: the method returns a boolean (i.e., true or false) */ isInside(double testedNumber,
			double leftEnd, double rightEnd) {
		if (testedNumber < leftEnd || testedNumber > rightEnd) {
			/*
			 * the return keyword has two purposes: it specifies what value a method will
			 * return (if the method doesn’t have a void return value) and it immediately
			 * ends the method.
			 */
			return false;
		} else {
			/*
			 * since the method returns a boolean, you must have a return statement in both
			 * cases
			 */
			return true;
		}
	}

	/*
	 * Another way to do it: indeed, having an if/else statement above did not make
	 * a lot of sense
	 */
	/**
	 * The method evaluates if a number is inside an interval
	 *
	 * @param testvalue: number which has to be tested
	 * @param begin:     left end of the interval
	 * @param end:       right end of the interval
	 * @return true if testval is inside the interval, false if not
	 */
	boolean compactIsInside(double testedNumber, double leftEnd, double rightEnd) {
		/*
		 * the operator "!" applied to a boolean returns the opposite of its value:
		 * false if the value of the boolean is true and true if it is false
		 */
		//return (testedNumber >= leftEnd & testedNumber <= rightEnd);
		return !(testedNumber < leftEnd || testedNumber > rightEnd);
	}

	/**
	 * The method evaluates if a number is inside an interval
	 *
	 * @param testvalue: number which has to be tested
	 * @param begin:     left end of the interval
	 * @param end:       right end of the interval
	 * @return 1 if testval is inside the interval, 0 if not
	 */
	int isInsideAsInt(double testedNumber, double leftEnd, double rightEnd) {
		/*
		 * this is the so called ternary operator. It consists of a boolean value,
		 * followed by the value that we want the operator to return when the boolean is
		 * true and the value that we want the operator to return when the boolean is
		 * false.
		 */
		int resultAsInteger = (testedNumber >= leftEnd & testedNumber <= rightEnd) ? 1 : 0;
		return resultAsInteger;
	}
}