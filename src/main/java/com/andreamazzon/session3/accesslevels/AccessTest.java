package com.andreamazzon.session3.accesslevels;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field has been defined.
 */
import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class shows how and if private, package access and public methods can be accessed.
 *
 * @author Andrea Mazzon
 *
 */
public class AccessTest {
	
	public static void main(String[] args) {
		
		Access access = new Access();
		
		access.publicField = 1;//fine, this field is public: it can be accessed from anywhere
		
		/*
		 * Fine, this field has no access modifier: it can be accessed from a method of a class
		 * inside the package of its class. This is our case here.
		 */
		access.packageAccessField = 2;
		
		//access.privateField = 2;//this field is private! Not possible to access it from outside the class

		access.publicMethod();//fine, this method is public: it can be called from anywhere
		access.packageAccessMethod();//fine, this method has no access modifier: it can be called from inside the package
		//access.privateMethod(); //this method is private! Not possible to call it from outside the class

		printn("The package asset field is " + access.packageAccessField);
		printn("The public asset field is " + access.publicField);
		//printn("The private asset field is " + access.privateField); //private field not visible
		
		PackageAccessOnly packageAccessOnly = new PackageAccessOnly();//the package access class can be created
		/*
		 * but look what happens when we try to construct objects of this class from
		 * com.andreamazzon.session3.otherpackage.AccessTestOutside
		 */
	}
}

