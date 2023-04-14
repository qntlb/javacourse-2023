package com.andreamazzon.session3.encapsulation.complexes;

import static com.andreamazzon.session3.useful.Print.print;
import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class tests the classes ComplexPolar and ComplexCartesian.
 *
 * @author Andrea Mazzon
 */

public class ClientUsingComplexNumbers {
	public static void main(String[] args) {

		//note: we can not use the (private!) constructor
		ComplexNumber complexNumber = ComplexNumber.setComplexNumber(3.0, 4.0);

		//prints
		complexNumber.showWithNewLine();

		//we compute and print the absolute value
		print("The absolute value of ");
		complexNumber.show();
		printn(" is " + complexNumber.abs());

		ComplexNumber conjugate = complexNumber.conjugate();
		//we compute and print the conjugate
		print("The conjugate of ");
		complexNumber.show();
		print(" is ");
		conjugate.showWithNewLine();


		//we compute and print the product with the conjugate
		ComplexNumber product = complexNumber.product(conjugate);
		print("The product of ");
		complexNumber.show();
		print( " by its conjugate is ");
		product.showWithNewLine();

		//note: we can not use the (private!) constructor
		ComplexNumber newComplexNumber = ComplexNumber.setComplexNumber(1.0, 2.0);

		//we compute and print the sum of the two complex numbers
		print("The sum of ");
		complexNumber.show();
		print("and ");
		newComplexNumber.show();
		print( " is ");
		//another way to do that: multiple calls
		complexNumber.sum(newComplexNumber).showWithNewLine();


	}
}
