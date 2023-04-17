package com.andreamazzon.session3.privateconstructor.enhancedmortgages;

/**
 * This class is strictly related to com.andreamazzon.session2.mortgages.Mortgage, that was an example of a
 * possible use of static fields in order to know the total amount of money we lend to clients. We had a static field
 * loansSum whose value was therefore shared by all the objects of Mortgage and got incremented every time
 * such an object is created. We had printed a warning message as soon as the value of this field was bigger than
 * a maximum. However, we could not find a a way to prevent the possibility to produce more object after that time.
 * A solution is now to have a private constructor, which is called only if loansSum <= budget.
 *
 * @author Andrea Mazzon
 */
public class Mortgage {

	private static double loansSum = 0; // static: shared by all the objects. First equal to zero, for the first object.
	private static double budget = 5E5;
	// this field is not meant to be static: it must be able to vary for every customer
	private String name;
	private int age; // non static, for the same reason
	private double amount; // same thing

	//constructor
	private Mortgage(String name, int age, double amount) {
		this.name = name; // note the use of this
		this.age = age;
		this.amount = amount;

		System.out.println("The name of our new customer is " + name + ". He/she is " + age + " years old."
				+ " We lend him/her " + amount + " euros.");

		System.out.println("Sum of all the loans : " + loansSum);
		System.out.println();
	}

	/**
	 * It returns an object of type Mortgage if the former value of loansSum plus amount is less or equal than
	 * maximumBudget.
	 *
	 * @param name, the name of the new client
	 * @param age, the age of the new client
	 * @param amount, the amount of money we lend to the new client
	 * @return a reference to the new object
	 */
	/*
	 * Static: its implementation does not depend on non static fields and non static methods of the class.
	 * It has to be static because we want to call it in order to construct a new object of the class, and in
	 * order to do that we cannot need an object of the class itself.
	 */
	public static Mortgage constructMortgage(String name, int age, double amount) {

		loansSum += amount; //the field is immediately incremented, and is the same for every Mortgage object
		if (loansSum <= budget) {
			//the private constructor is called, from inside the class: fine
			Mortgage newMortgage = new Mortgage(name, age, amount);
			return newMortgage;
		}
		System.out.println("Enough objects! We have excedeed the budget");
		loansSum -= amount;
		//we have to return an object of type Mortgage, but we don't want to construct any! A solution is to return null
		return null;
	}
}
