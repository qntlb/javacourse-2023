package com.andreamazzon.session4.polymorphism.amphibians;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This classes illustrates overriding, upcasting and polymorphism.
 * Three methods are defined and implemented for the parent class amphibian. Then the same methods are
 * re-implemented (= overridden) in the two derived classes. 
 * Note the type of the argument of the method behavior: it accepts a reference to an object of type Amphibian.
 * However, it can also be called by passing objects with a reference of Frog or Toad: they get upcasted when
 * the method is called. In this way, the code doesn’t rely on the specific type of the objects at compilation time,
 * but its execution does (which is what we want).
 * This is an effect of late binding: at compilation time Java looks at the reference of the objects (the first name
 * of the class you write when you construct the object) and at running time it looks at the specific type of the
 * object which is attached to that reference.
 *
 *  @author: Andrea Mazzon
 */
public class Amphibian{

	
	public void swimming(){
		printn("Amphibian swimming");
	};
	
	public void walking(){
		printn("Amphibian walking");
	};
	
	public void creaking(){
		printn("Amphibian creaking");
	};

	/*
	 * Note: the argument is of type Amphibian! This means that this method "speaks" to any Amphibian, so it
	 * its implementation is independent of the specific type of object that it’s calling the three methods
	 * inside. We don't have to bother writing if amphibian is of type Frog do this and if it is of type Toad
	 * to this: at running time, Java is able to get the type of the object, so that the right implementation of
	 * the method is called depending on its type, i.e. Frog, Toad or maybe a not specified amphibian.
	 * This behavior is known as late binding: the code being called isn’t determined until run time
	 */
	public static void behavior(Amphibian amphibian) {
		printn("The method behaviour(Amphibian) gets called");
		
		amphibian.swimming();
		amphibian.walking();
		amphibian.creaking();
	}
}
