package com.andreamazzon.session6.exceptions.commonexception;

/**
 * Very easy example of exception, automatically thrown by Java, for an array out of bounds.
 * Like other exceptions thrown by Java, you don’t need to include it in your exception specifications.
 * Note that the error is not handled at compilation time.
 */
public class ArrayExample {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		for (int i = 0; i < 11; i++) {
			myArray[i] = i;
			System.out.println(i);
		}
		System.out.println("Some print");
	}
}
