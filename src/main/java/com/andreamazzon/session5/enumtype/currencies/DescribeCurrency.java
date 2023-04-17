package com.andreamazzon.session5.enumtype.currencies;

/**
 * This class illustrates how enum types can be used, and some methods: enums
 * type are typically used in connection with switch statements, as shown here.
 *
 * @author Andrea Mazzon
 *
 */
public class DescribeCurrency {

	// private: we access its value with the getter and the setter
	private Currency describedCurrency; // you can associate to it a value of the enum type
	// which is what you do here for example (no meaningful in this case, just to show you..)
	private Currency anotherCurrency = Currency.EURO;// EURO is a static field! We access it with the name of the class

	// getter
	/**
	 * It gets the value of the private field describedCurrency
	 * 
	 * @return the value of the private field describedCurrency
	 */
	public Currency getDescribedCurrency() {
		return describedCurrency;
	}

	// setter
	/**
	 * It sets the value of the private field describedCurrency
	 * 
	 * @param describedCurrency the value we want to link to the field
	 *                          describedCurrency
	 */
	public void setDescribedCurrency(Currency describedCurrency) {
		this.describedCurrency = describedCurrency;
	}

	/**
	 * It describes the selected currency, according to its type
	 */
	public void describe() {
		// a switch is intended to select from a limited set of possibilities: ideal match for enum
		switch (describedCurrency) { // A switch based on the value of the enum type.
		case EURO: // the ordinal() method returns the integer id in the list of the Enum type
			System.out.println(describedCurrency.ordinal() + 1 + " " + describedCurrency
					+ ": is the currency of the EU");
			break;
		case DOLLAR:
			System.out.println(describedCurrency.ordinal() + 1 + " " + describedCurrency
					+ ": is the reference currency in the world ");
			break;
		case POUND:
			System.out.println(describedCurrency.ordinal() + 1 + " " + describedCurrency
					+ ": went down just after the Brexit");
			break;
		case YEN:
			System.out.println(describedCurrency.ordinal() + 1 + " " + describedCurrency
					+ ": The strongest Asian currency");
			break;
		case YUAN:
			System.out.println(
					describedCurrency.ordinal() + 1 + " " + describedCurrency + ": an emerging currency");
			break;
		default:
			System.out.println("Set the Currency field to be a value of Currency");
			break;
		}
	}
}
