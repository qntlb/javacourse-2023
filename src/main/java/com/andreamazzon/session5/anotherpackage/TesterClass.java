package com.andreamazzon.session5.anotherpackage;

/**
 * This class illustrates the use of a package access interface implemented
 * by a public class
 */
import com.andreamazzon.session5.packageaccessinterfaces.ImplementingClass;
//import com.andreamazzon.session5.packageaccessinterfaces.PackageAccessInterface;

public class TesterClass {

	public static void main(String[] args) {
		// ImplementingClass is public! We can import it and create objects
		ImplementingClass objectOfImplementingClass = new ImplementingClass();
		objectOfImplementingClass.methodToBeImplemented();// the method is automatically public!
	}

}
