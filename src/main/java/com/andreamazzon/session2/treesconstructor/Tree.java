package com.andreamazzon.session2.treesconstructor;

/**
 * This class gives an extremely simple example of constructor with arguments:
 * the height of the three is specified by the double argument of the
 * constructor.
 *
 * @author Andrea Mazzon
 */
public class Tree {

	double height;

	// constructor with a double argument
	Tree(double heightOfTheNewTree) {
		System.out.println("A new tree is planted");
		/*
		 * Note: Height is the name of field of the class; heightOfTheNewTree is the
		 * name of the variable given as an argument. If they have the same name, they
		 * both refer to the argument variable, and the assignment has no effect. We
		 * will see a way to solve this problem. 
		 */
		height = heightOfTheNewTree;
	}
	
	/*
	 * Default constructor, which in this case just do nothing. Note that
	 * Tree(double heightOfTheNewTree) overloads this constructor.
	 */
	Tree() {
	}
	/*
	 * Note that if don't define a default constructor: Java will not do it for us,
	 * and if we call the default constructor in the main, we get an error.
	 */

	void printHeight() {
		/*
		 * Here you see that we want to print the value of height even if it has not
		 * been initialized directly in this class (it is initialized only in one constructor).
		 * Since any method can initialize or use that data, it might not be practical to
		 * force the user to initialize it to its appropriate value before the data is used,
		 * so no error is given. However, it’s unsafe to leave it with a garbage value, so each
		 * primitive field of a class is guaranteed to get an initial value. This is zero for
		 * int,long, float, double.
		 */
		System.out.println("The tree is " + height + " meters high");
		// try instead
		//int a;
		//System.out.println(a);
		//error!
	}
}
