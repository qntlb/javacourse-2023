package com.andreamazzon.session3.privateconstructor.enhancedmortgages;

/**
 * In the main method of this class we construct some objects of type Mortgage
 * (i.e., instances of the class Mortgage) as long as the total sum of money
 * we lend exceeeds a certain value. This is to show:
 * - how the value of
 * a static field is shared among all objects of the class
 * - how this can be used to set a "counter" (in this case, the total amount of
 * money lended);
 * - how a private constructor might be used in order to prevent an user to directly
 * construct objects of a class
 *
 * @author Andrea Mazzon
 */
public class MortgagesMain {

	public static void main(String[] striings){
		Mortgage firstCustomer = Mortgage.constructMortgage("Smith", 35, 3E5);
		Mortgage secondCustomer = Mortgage.constructMortgage("Muller", 42, 2E5);
		Mortgage thirdCustomer = Mortgage.constructMortgage("Bianchi", 19, 1.3E5);
		Mortgage fourthCustomer = Mortgage.constructMortgage("Lopez", 37, 3.4E5);
		Mortgage fifthCustomer = Mortgage.constructMortgage("Favre", 39, 2.1E5);
	}
}
