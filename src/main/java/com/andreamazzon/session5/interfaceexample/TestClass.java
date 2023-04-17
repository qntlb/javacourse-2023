package com.andreamazzon.session5.interfaceexample;


/**
 * In this class we test the features of polymorphism with interfaces
 *  
 * @author Andrea Mazzon
 *
 */
public class TestClass {

	public static void main(String[] args) {
		Antivirus mcAfee = new Antivirus();
		Doctor doctorHouse = new Doctor();
		/*
		 * Note that you have the same behaviour we have seen with classes: here the only difference
		 * is that the general type is an interface.
		 */
		Healing.someHealing(doctorHouse);
		System.out.println();
		Healing.someHealing(mcAfee);

		System.out.println();

		// it is able to call the class specific method because we gave it a reference to the class
		doctorHouse.aDoctorMethod();
		// mcAfee.aDoctorMethod();

		System.out.println();
		// now let's see what happens when we give the reference to the interface
		Cure doctorCox = new Doctor();
		
		// Same thing for polymorphism, in this case Java does not need to upcast
		Healing.someHealing(doctorCox);
		
		System.out.println();
		// but it is not able to call the doctor specific method. We have to downcast
		//doctorCox.aDoctorMethod();
	}

}
