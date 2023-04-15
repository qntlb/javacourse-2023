package com.andreamazzon.session3.encapsulation.travelspeed;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class illustrates the use of setters, getters and in general of
 * encapsulation: this is the way a client who works with kilometers would use
 * with our TravelTime class.
 *
 * @author Andrea Mazzon
 *
 */
public class TravelSpeedClient {
	public static void main(String[] args) {

		double distanceInKm = 50;// in km
		double timeInMinutes = 30;

		TravelSpeed myTravel = new TravelSpeed(distanceInKm, timeInMinutes);
		
		myTravel.setDistance(40);//would be fine
		
		
		//double myDistance = myTravel.getDistance();//would be fine
		
		//this does not have to work
		//myTravel.distance = 40;//in km! no that nice for us
		
		//this does not have to work
		//printn("The distance is " + myTravel.distance);
		
		printn("Average speed: " + myTravel.getSpeed() + " km per hour");// use of getter

	}

}
