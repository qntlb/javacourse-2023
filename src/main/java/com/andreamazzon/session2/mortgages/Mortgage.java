package com.andreamazzon.session2.mortgages;

/**
 * This class serves as an example of a possible use of static fields. Here we
 * want to know the total amount of money we lend to our customers for
 * mortgages: we are a small bank, so we don't like to be too exposed. Thus we
 * need a number whose value "passes from an object to the other": a possible
 * solution is to have a field whose value is shared by all objects of this class, that
 * means, allocated in the same space of memory. This is what we get with a
 * static field.
 *
 * @author Andrea Mazzon
 */
public class Mortgage {

	static double loansSum = 0; // static: shared by all the objects. First equal to zero, for the first object.
	
	// this field is not meant to be static: it is must be able to vary for every customer
	String name;
	int age; // non static, for the same reason
	double amount; // same thing

	//constructor
	Mortgage(String name, int age, double amount) {
		this.name = name; // note the use of this
		this.age = age; // note the use of this
		this.amount = amount;

		System.out.println("The name of our new customer is " + name + ". He is " + age + " years old."
				+ " We lend him/her " + amount + " euros.");

		loansSum += amount; // the field is incremented, and will be the same for every Mortgage object
		// or loansSum = loansSum + amount;

		System.out.println("Sum of all the loans : " + loansSum);
		System.out.println();

		
		// We want to known when we have exceed the total amount of money we want to lend
		if (loansSum > 1E6) {// 1 million
			System.out.println("Enough!");
			/*
			 * We will see next time how to prevent the user to construct more objects of
			 * this type (for now we can just warn him/her)
			 */
		}
	}


}
