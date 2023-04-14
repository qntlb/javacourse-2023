package com.andreamazzon.session3.otherpackage;

import static com.andreamazzon.session3.useful.Print.print;

//importing the classes needed
import com.andreamazzon.session3.accesslevels.*;

/**
 * This class shows the difference between package access and public access: we try to call methods of the class
 * com.andreamazzon.session3.accesslevels.Access() and see what happens
 */
public class AccessTestOutside {

	public static void main(String[] args) {
		Access access = new Access();
		/*
		 * This method has package access! it is not possible to call it from here: we are indeed
		 * inside a method of a class which is in another package with respect to that of 
		 * Access.
		 */
		//access.packageAccessMethod(); 
		access.publicMethod();
		//print(access.packageAccessField); // this field has package access! it is not possible to access it from here
		print(access.publicField);
		//this class has package access! it is not possible to construct new objects of the class from here
		//PackageAccessOnly packageAccessOnly = new PackageAccessOnly();
	}

}
