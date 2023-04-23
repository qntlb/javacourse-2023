package com.andreamazzon.session5.onemorepackage;

import com.andreamazzon.session5.packageaccessclasswithpublicmethods.APublicClass;

//import com.andreamazzon.session5.packageaccessclasswithpublicmethods.PackageAccessClass;

public class AClassFromOutsidePackage {

	public static void main(String[] args) {

		APublicClass anObject = new APublicClass();
		anObject.aPublicMethod();
	}

}
