package com.andreamazzon.session4.polymorphism.amphibians;

/**
 * This class tests overriding, upcasting and polimorphism, see the comments in Amphibian.
 */
public class TestClass {


	public static void main(String[] args) {

		Frog frog = new Frog();
		//or:
		//Amphibian frog = new Frog();
		
		System.out.println();
		
		frog.swimming(); // overridden version are called, that is those of Frog
		frog.walking();
		frog.creaking();
		
		System.out.println();
		
		Frog secondFrog = new Frog();

		System.out.println();

		//when it gets upcasted in this following line, it's like we had written
		Amphibian.behavior(secondFrog); // Upcasting and methods overridden! Returns a frog behaviour!!
		
		System.out.println();
		
		//secondFrog.frogMethod();
		
		System.out.println();
		
		Amphibian toad = new Toad();
		
		System.out.println();
				
		Amphibian.behavior(toad);
		
		
		Amphibian anotherToad = new Toad();
		
		anotherToad.creaking();
		
		Amphibian amphibian = new Amphibian();
		
		amphibian.creaking();
		
	}
}