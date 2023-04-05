package com.andreamazzon.session2.bankaccount;

/**
 * This class is used to compute how much money one gets after a given number of
 * years after investing an initial amount, with a given annual risk free rate
 * and a given commission to be payed at the end. This is an example of
 * overloaded constructors: if the commission is not given, its default value is
 * zero
 *
 * @author Andrea Mazzon
 *
 */
public class RiskFreeSaving {

	double annualRiskFreeRate;
	double commission;

	// here we give both the annual interest rate and the commission
	RiskFreeSaving(double inputRate, double inputCommission) {
		System.out.println("The constructor with two arguments is called");
		/*
		 * We will see soon how we deal with the case when the arguments and the fields
		 * of the class have same name
		 */
		annualRiskFreeRate = inputRate;
		commission = inputCommission;
	}

	// when the commission is not given, it is supposed to be zero.
	RiskFreeSaving(double inputRate) {
		System.out.println("The constructor with one argument is called");

		annualRiskFreeRate = inputRate;
		/*
		 * We have seen that even if we don't initialize it, it would still be zero, but
		 * this would not be nice coding style.
		 */
		commission = 0;
	}


	/**
	 * This methods returns how much money one gets after a given number of years
	 * after investing an initial amount, with a given annual risk free rate and a
	 * given commission to be payed at the end
	 *
	 * @param initialInvestment: the initial amount of money invested
	 * @param numberOfYears:     the number of years after which the money gets
	 *                           withdrawn
	 * @return the value of money which gets withdrawn
	 */
	double getMoney(double initialInvestment, int numberOfYears) {
		// note the use of Math.pow(double a, double b)
		double futureValueOfMoney = initialInvestment * Math.pow((1 + annualRiskFreeRate), numberOfYears)
				* (1 - commission);
		return futureValueOfMoney;
	}

}
