package com.andreamazzon.session1.operators;

/**
 * Examples of operators: an operator takes one or more arguments and produces a new value
 *
 * @author Andrea Mazzon
 */
public class Operators {

	public static void main(String[] args) {

		// note: type declaration, and then variable assignment, through the operator "=".
		int a = 5; 
		
		//Since it is a primitive, a will contain the actual value and not the reference to an object.
		System.out.println("The value of a is " + a);
		
		int b = a; // if you say b = a for primitives, then the contents of a are copied into b
		System.out.println("The value of b is " + b);
		
		b = 6; // you can modify b
		System.out.println("The value of a is " + a);// and this does not affect a
		System.out.println("The value of b is " + b);
		/*
		 * Remember: this is not the same for objects which are not primitives: Whenever
		 * you manipulate an object, what you’re manipulating is the reference, so when
		 * you assign “from one object to another” you’re actually copying a reference
		 * from one place to another. See the code in com.andreamazzon.session1.tank to
		 * see what happens
		 */

		System.out.println();// we print an empty line, just to separate things

		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
		int difference = a - b;
		System.out.println("The difference between " + a + " and " + b + " is " + difference);
		int product = a * b;
		System.out.println("The product of " + a + " and " + b + " is " + product);
		double truncatedRatio = a / b; // result is 0
		System.out.println("The ratio of " + a + " and " + b + " is not " + truncatedRatio + ";");
		// Note: Integer division truncates, rather than rounds, the result.
		double correctRatio = a / (double) b; // a gets "upcasted", i.e., it is considered to be a double.
		// We will see more on the concept of "upcasting" in the next sessions
		System.out.println("The ratio of " + a + "" + " and " + b + " is " + correctRatio);
		int otherTruncatedRatio = (int) correctRatio; // "downcasting"
		System.out.println("Which I remind you, is not " + otherTruncatedRatio);

		System.out.println();

		// More types
		String s = "string!"; // or String s = new String("string!")
		System.out.println(s);
		char x = 'A'; // note the single quotation marks
		System.out.println(x + " " + s);// example of the string operator "+"

		System.out.println();

		/*
		 * A boolean takes values true or false. Used with relational operators: >, >=,
		 * <, <=, ==; !=
		 */
		boolean isbSix = (b == 6);
		System.out.println("b == 6 is " + isbSix);
		boolean isbDifferentFromSix = (b != 6);
		System.out.println("b != 6 is " + isbDifferentFromSix);

		System.out.println();

		// Logical operators
		System.out.println("True || false: " + (isbSix || isbDifferentFromSix));
		System.out.println("True & false: " + (isbSix & isbDifferentFromSix));
		System.out.println("a < 10 and b > 30: " + (a < 10 & b > 30));
		System.out.println("a < 10 or b > 30: " + (a < 10 || b > 30));

		System.out.println();
		System.out.println();

		// Increments and decrements
		
		int firstTestVariable = 5;
		int secondTestVariable = 5;
		System.out.println("first test variable: " + firstTestVariable);
		System.out.println("second test variable: " + secondTestVariable);
		
		System.out.println();
		
		// an operator can change the value of an operand
		System.out.println("++firstTestVariable: " + ++firstTestVariable);
		System.out.println("--secondTestVariable: " + --secondTestVariable);

		System.out.println();
		
		// firstTestVariable and secondTestVariable are equal to 6 and 4
		System.out.println("firstTestVariable++: " + firstTestVariable++);
		System.out.println("secondTestVariable--: " + secondTestVariable--);

		// It appears to have stayed the same...but they are now 7 and 3. Why?

		System.out.println();
		

		System.out.println("firstTestVariable: " + firstTestVariable);
		System.out.println("secondTestVariable: " + secondTestVariable);
		

	}
}
