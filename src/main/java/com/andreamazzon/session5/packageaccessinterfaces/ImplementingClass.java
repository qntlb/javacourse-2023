package com.andreamazzon.session5.packageaccessinterfaces;

/**
 * This class is public, even if it implements a package access interface. It
 * makes sense: in this way, it's still possible to construct and use objects of
 * this class outside the package.
 *
 * @author Andrea Mazzon
 *
 */
public class ImplementingClass implements PackageAccessInterface {

	@Override
	public void methodToBeImplemented() {// interface method: it has to be public!
		System.out.println("Implementation of the interface method");
	}
}
