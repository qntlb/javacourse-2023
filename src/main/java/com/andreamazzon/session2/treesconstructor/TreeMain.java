package com.andreamazzon.session2.treesconstructor;

/**
 * This class gives a very simple example of the construction of an object
 * through a constructor with arguments (here a double).
 *
 * @author Andrea Mazzon
 */
public class TreeMain {

	public static void main(String[] args) {
		
		double treeHeight = 3.2;

		Tree myTree = new Tree(treeHeight); // call of the constructor with the double argument

		//Tree myTree = new Tree();
		//myTree.height = treeHeight;
		
		myTree.printHeight();

		Tree mySecondTree = new Tree();
		// try to see what happens if you now call
		mySecondTree.printHeight();
		/*
		 * You see that height gets automatically initialized to zero as soon as the
		 * object is created. If a primitive is a field in a class, on one hand it might
		 * not be practical to force the user to initialize it to its appropriate value
		 * before the data is used. On the other hand, it’s unsafe to leave it with a
		 * garbage value, so each primitive field of a class is guaranteed to get an
		 * initial value
		 */
		
		//mySecondTree.aTreeField = new Tree(4.0);
		
		//mySecondTree.makeTheTreeFieldCallAMethod();

	}
}
