package com.andreamazzon.session2.bankaccountwiththis;

/**
 * This class is used to compute how much money one gets after a given number of
 * years after investing an initial amount, with a given annual risk free rate
 * and a given commission to be payed at the end. This is an example of
 * overloaded constructors: if the commission is not given, its default value is
 * zero. Moreover, it also gives an example of the use of "this" to call an
 * overloaded constructor and to allow for the argument name of the constructor
 * to match the field name.
 *
 * @author Andrea Mazzon
 *
 */
public class RiskFreeSavingWithThis {

	double annualRiskFreeRate;
	double commission;

	// here we give both the annual interest rate and the commission
	RiskFreeSavingWithThis(double annualRiskFreeRate, double commission) {
		/*
		 * The constructor here uses 'this' to allow the argument name to match the
		 * field name: the constructor sets the data field annualRiskFreeRate to the
		 * value of the argument annualRiskFreeRate. Here "this" means: I am referring
		 * to the field of name "annualRiskFreeRates" of the same object who has been
		 * constructed in this constructor. Same thing with commission. The keyword this
		 * resolves the name clash (otherwise the local variable/parameter "shadows" the
		 * field).
		 */
		System.out.println("The constructor with two arguments is called");
		this.annualRiskFreeRate = annualRiskFreeRate;
		this.commission = commission;
	}

	// when the commission is not given, it is supposed to be zero.
	RiskFreeSavingWithThis(double annualRiskFreeRate) {
		//this.annualRiskFreeRate = annualRiskFreeRate;
		//this.commission = 0;
		/*
		 * Here we see another use of this: it makes it possible to call a constructor
		 * from an overloaded constructor. In this way, we don't have to bother to set
		 * again our fields. The constructor we have seen above is called with
		 * commission = 0. Note that this use of this is only possible from inside a
		 * constructor, not from inside another method. Not only: it must be the first
		 * instruction inside a constructor.
		 */
		
		this(annualRiskFreeRate, 0);
		System.out.println("The constructor with one argument is called");
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
