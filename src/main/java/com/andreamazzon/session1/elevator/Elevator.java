package com.andreamazzon.session1.elevator;

/**
 * This class gives a very simple example of for loop, where the stepping reduces the number by one
 *
 * @author Andrea Mazzon
 */
public class Elevator {

	public static void main(String[] args) {
		
		for (int floor = 10 /* initialization */; floor > 0 /* Boolean expression */; floor-- /* step */) {
			System.out.println("The elevator is at floor number " + floor);
		}

//		System.out.println(floor);//ERROR!
		System.out.println();
		
		System.out.println("The elevator is at ground level");
		System.out.println();
		// you could also write:
		int i = 10;
		while (i > 0) {
			System.out.println("The elevator is at floor number " + i);
			i--;
		}
		
		System.out.println();
		
		System.out.println("i is equal to " + i + " after the end of the while loop");
		/*
		 * But in this way, i is not deleted after the end of the while. If you create a
		 * variable INSIDE the while, it gets deleted after the while. For for loops,
		 * the scope of the variable is limited to the loop.
		 */
	}
}