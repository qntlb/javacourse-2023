package com.andreamazzon.session3.accesslevels;

/*
 * import static: allows members (fields and methods) which have been "defined" as public static,
 * to be used without specifying the class in which the field or the method has been defined.
 */
import static com.andreamazzon.session3.useful.Print.printn;


/**
 * This class illustrates different access levels: private, package access, public
 *
 * @author Andrea Mazzon
 *
 */
public class Access {
	public int publicField = 4; //public: can be accessed everywhere
	/*
	 * No access modifier: it can be accessed only from inside the package. 
	 * Look what happens when we try to access this field from
	 * com.andreamazzon.session3.otherpackage.AccessTestOutside
	 */
	int packageAccessField = 3;
	
	//note that only for the private field you get the warning: why?
	private int privateField = 2; //private: can be accessed only from inside the class

	/**
	 * Javadoc documentation is usually given only for public methods
	 */
	public void publicMethod(){ //public: can be called everywhere
		printn("A public method");
		privateMethod();//the private method can be called form inside the class
	}
	/*
	 * No access modifier: it can be called only from inside the package.
	 * Look what happens when we try to call this method from
	 * com.andreamazzon.session3.otherpackage.AccessTestOutside.
	 */
	void packageAccessMethod(){
		printn("A package access method");
		privateMethod();
	}

	private void privateMethod(){ //private: can be called only from inside the class
		printn("A private method");
	}

}

