package com.andreamazzon.session5.inheritinginterfaces;

/**
 * This class illustrates how to work with multiple inheritance of interfaces, and how polymorphism
 * works in this case.
 *
 * @author Andrea Mazzon
 *
 */
public class MakingCalls {

	/**
	 * @param first, object of a class implementing FirstInterface. Note that it can
	 *               also take objects of classes implementing InheritingInterface:
	 *               it makes sense, because they can also call firstMethod().
	 */
	public static void callerToFirstInterface(FirstInterface first) {
		first.firstMethod();
	}

	/**
	 * @param second, object of a class implementing SecondInterface. Note that it
	 *                can also take objects of classes implementing InheritingInterface:
	 *                it makes sense, because they can also call secondMethod().
	 */
	public static void callerToSecondInterface(SecondInterface second) {
		second.secondMethod();
	}

	/**
	 * @param inheriting, object of a class implementing InheritingInterface: it has to
	 *                 able to call all the three methods.
	 */
	public static void callerToInheritingInterface(InheritingInterface inheriting) {
		inheriting.thirdMethod();
		inheriting.firstMethod();
		inheriting.secondMethod();
	}
	
	/**
	 * @param theClassObject, object of a class implementing InheritingInterface: it has to
	 *                 able to call all the three methods.
	 */
	public static void callerToInheritingAndImplementingClass(InheritingAndImplementingClass theClassObject) {
		theClassObject.thirdMethod();
		theClassObject.firstMethod();
		theClassObject.secondMethod();
		theClassObject.aClassMethod();
	}

	/**
	 * @param objectOfFirstClass, object of the class FirstClass. Note: it can also take an object of
	 *           InheritingAndImplementingClass, which extends FirstClass.
	 */
	public static void callerToFirstClass(FirstClass objectOfFirstClass) {
		objectOfFirstClass.aClassMethod();
	}

	public static void main(String[] args) {
		InheritingAndImplementingClass inheritingAndImplementingClass = new InheritingAndImplementingClass();
		// note how the object given in input gets implicitly upcasted everytime
		callerToFirstInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToSecondInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToInheritingInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToFirstClass(inheritingAndImplementingClass);
		System.out.println();
		callerToInheritingAndImplementingClass(inheritingAndImplementingClass);
		System.out.println();
		ClassImplementingFirstInterface firstInterfaceObject = new ClassImplementingFirstInterface();
		callerToFirstInterface(firstInterfaceObject);
		//callerToSecondInterface(firstInterfaceObject);//FAIL!
		//callerToInheritingInterface(firstInterfaceObject);//FAIL!

	}
}
