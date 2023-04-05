package com.andreamazzon.session1.tank;

/**
 * Whenever you manipulate an object, what you’re manipulating is the reference,
 * so when you assign “from one object to another” you’re actually copying a
 * reference from one place to another. This means that if you say c = d for
 * objects, you end up with both c and d pointing to the object that,
 * originally,only d pointed to. This class is an example that demonstrates this
 * behavior.
 *
 * @author Andrea Mazzon
 */
public class Assignments {

	public static void main(String[] args) {
		// create the reference to new objects of type Tank
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		// assign a value to the level field of the two objects
		tank1.level = 9;
		tank2.level = 47;
		// situation at the beginning:
		System.out.println("1: tank1.level: " + tank1.level + ", tank2.level: " + tank2.level);
		
		tank1 = tank2;// tank1 and tank2 point to the same object!
		System.out.println("2: tank1.level: " + tank1.level + ", tank2.level: " + tank2.level);

		tank1.level = 27;
		// aliasing: changing the tank1 object appears to change tank2 as well
		System.out.println("3: tank1.level: " + tank1.level + ", tank2.level: " + tank2.level);

		System.out.println();

		System.out.println("Is tank1 equal to tank2 ? " + (tank1 == tank2));
		// But what if you don’t want aliasing to occur in this case? You can say
		Tank tank3 = new Tank();
		tank3.level = tank2.level;
		/*
		 * even if the value of the field is the same, the result will be false because
		 * tank2 and tank3 do not point to the same object
		 */
		System.out.println("Is tank3 equal to tank2 ? " + (tank3 == tank2));// this is not true
//		
		//this is true
		System.out.println("Is the level of tank3 equal to the level of tank2 ? " + (tank3.level == tank2.level));
	}
}
