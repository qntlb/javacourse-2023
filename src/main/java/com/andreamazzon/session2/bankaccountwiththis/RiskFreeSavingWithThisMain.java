package com.andreamazzon.session2.bankaccountwiththis;

/**
 * In the main method of this class we construct two objects of type
 * RiskFreeSaving: one giving a commission, the other one without giving the
 * commission: this is an example of constructor overloading. Note that the
 * class RiskFreeSavingWithThis gives now an example of the use of "this" to
 * call an overloaded constructor and to allow for the argument name of the
 * constructor to match the field name.
 *
 * @author Andrea Mazzon
 */
public class RiskFreeSavingWithThisMain {

	public static void main(String[] strings) {

		double annualRiskFreeRate = 0.1;
		double commission = 0.05;

		double initialInvestment = 100;
		int numberOfYears = 10;

		// one version of the constructor, where we give the commission
		RiskFreeSavingWithThis savingWithCommission = new RiskFreeSavingWithThis(annualRiskFreeRate, commission);

		System.out.println();

		// the overloaded version, where we don't
		RiskFreeSavingWithThis savingWithoutCommission = new RiskFreeSavingWithThis(annualRiskFreeRate);
		System.out.println();

		/*
		 * note that here you have two methods with same value of the arguments, but
		 * they give different results depending on the object calling them.
		 */
		double valueWithCommission = savingWithCommission.getMoney(initialInvestment, numberOfYears);
		double valueWithoutCommission = savingWithoutCommission.getMoney(initialInvestment, numberOfYears);

		System.out.println("The value of the money after " + numberOfYears + " years when there is a commission of "
				+ commission + " is " + valueWithCommission);
		System.out.println("The value of the money after " + numberOfYears + " years when there is no commission is "
				+ valueWithoutCommission);

	}
}