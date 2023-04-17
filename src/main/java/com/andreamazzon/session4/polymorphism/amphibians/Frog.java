package com.andreamazzon.session4.polymorphism.amphibians;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class inherits from Amphibian (a frog is an amphibian) and overrides the three methods swimming(),
 * walking() and creaking().
 *
 * @author Andrea Mazzon
 *
 */
public class Frog extends Amphibian{

	public Frog(){
		printn("I am a frog");
	}

	@Override
	public void swimming(){//the access cannot be more restrictive than the one of the method of the base class
		printn("Frog swimming");
	}

	@Override
	public void walking(){//the access cannot be more restrictive than the one of the method of the base class
		printn("Frog walking");
	}

	@Override
	public void creaking(){//the access cannot be more restrictive than the one of the method of the base class
		printn("Frog creaking");
	}

	public void frogMethod() {
		printn("Specific frog method");
	}
}
