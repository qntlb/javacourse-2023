package com.andreamazzon.session3.encapsulation.gas;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class shows the use of encapsulation in order to manage access control:
 * imagine we have an American client who only understands degrees Fahrenheit.
 * However, we work with Kelvin. We have therefore to let him/her give and read
 * degrees Fahrenheit, through public getters and setters, and then perform a
 * conversion from Fahrenheit to Kelvin, and vice versa. These methods to
 * perform conversions should be private: the client is only interested on
 * Fahrenheit.
 *
 * @author Andrea Mazzon
 *
 */
public class Gas {

	private double temperatureKelvin; // it should be Kelvin: private, the client does not see it
	private double pressure; // Pascal
	
	private final static double gayLussacConstant = 8.3145; // final keyworld: it can not be modified

	private static double kelvinToFahrenheit(double temperatureKelvin) { // Transformations for outputs
		return temperatureKelvin * 9 / 5 - 459.67;
	}

	private static double fahrenheitToKelvin(double temperatureFahrenheit) { // Transformation for inputs
		return (temperatureFahrenheit + 459.67) * 5 / 9;
	}

	/*
	 * getter of the temperature: the conversion from Kelvin to Fahreneit has to be
	 * performed (we work with Kelvin, the client wants to read Fahreneit)
	 */
	public double getTemperature() {
		double temperatureFahrenheit = kelvinToFahrenheit(temperatureKelvin);
		return temperatureFahrenheit;
		//return kelvinToFahrenheit(temperatureKelvin);
	}

	/*
	 * setter of the temperature: the conversion from Fahreneit to Kelvin has to be
	 * performed (we work with Kelvin, the client wants to set Fahreneit)
	 */
	public void setTemperature(double temperature) {
		temperatureKelvin = fahrenheitToKelvin(temperature);
		printn("The temperature in Kelvin is now " + temperatureKelvin);
	}

	// Calculates pressure- Gay Lussac Law. The temperature has to be in Kelvin
	private void calculatePressure() {
		pressure = temperatureKelvin * gayLussacConstant;
	}

	// getter of the pressure: of course public
	public double getPressure() {
		calculatePressure();
		//you can also do:
		//double pressure = temperatureKelvin * gayLussacConstant;
		return pressure;
	}
}
