package com.andreamazzon.session3.simplerprinterexample;

import com.andreamazzon.session3.useful.Print;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field has been defined. It is useful when
 * you have to call these methods several times (so in this simple, specific example it's not
 * that useful).
 */

//import static com.andreamazzon.session3.useful.Print.printn;


/**
 * This class illustrates the way we can import other packages. One thing to
 * note: through "import static" you can avoid to specify the name of a class for a static
 * method or field.
 *
 * @author: Andrea Mazzon
 */


public class SimplerPrinterExample {
	public static void main(String[] args) {
		Print.printn("Printing is now much simpler");
		
		Print.print("Printing is now much simpler. ");
		Print.print("We can do that because we imported the relevant classes.");
	}
}
