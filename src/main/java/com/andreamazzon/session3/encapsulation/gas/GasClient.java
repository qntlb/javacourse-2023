package com.andreamazzon.session3.encapsulation.gas;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class illustrates the use of setters, getters and in general of encapsulation: this is the
 * way a client who only understands Fahrenheit would work with our Gas class.
 *
 * @author Andrea Mazzon
 *
 */
public class GasClient {
	public static void main(String[] args) {
		double heliumBoilingPoint = - 452.0;  //in Fahrenheit: this is how the client works with our class
		Gas helium = new Gas(); //new object of type Gas

		//the client sets the temperature in Fahrenheit: it will be immediately transformed in Kelvin
		helium.setTemperature(heliumBoilingPoint);
		//...and transformed back to Fahrenheit when he/she gets it
		printn("The boiling point of helium in Degrees Fahrenheit is: " + helium.getTemperature());
		//pressure using Gay-Lussac law: in this case, the temperature has to be transformed in Kelvin
		printn("The pressure exerted in Pascal by one mole of Helium volume at its boiling point is "
				+ helium.getPressure() + " Pascal");
	}

}
