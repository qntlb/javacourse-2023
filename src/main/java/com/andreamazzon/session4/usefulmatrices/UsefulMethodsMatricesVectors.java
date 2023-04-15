package com.andreamazzon.session4.usefulmatrices;

/**
 * This class contains some useful static methods for dealing with matrices and
 * arrays
 *
 * @author Andrea Mazzon
 *
 */
public class UsefulMethodsMatricesVectors {

	// a matrix is an array of arrays

	/**
	 * It returns a row of a matrix of doubles for a specific index
	 * 
	 * @param matrix
	 * @param rowIndex
	 * @return it returns the row of matrix indicated by rowIndex
	 */
	public static double[] getRow(double[][] matrix, int rowIndex) {
		return matrix[rowIndex];
	}

	/**
	 * It returns the transpose of a matrix of doubles
	 *
	 * @param matrix
	 * @return transpose of matrix
	 */
	public static double[][] getTranspose(double matrix[][]) {

		int numberOfRows = matrix.length;
		// matrix[0] is the first row of the matrix
		int numberOfColumns = matrix[0].length;// number of columns: length of the row
		double[][] transpose = new double[numberOfColumns][numberOfRows];

		// double for loop to transpose the matrix
		for (int i = 0; i < numberOfColumns; i++) {
			for (int j = 0; j < numberOfRows; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
	}

	/**
	 * It returns a column of a matrix of doubles for a specific index
	 * 
	 * @param matrix
	 * @param columnIndex
	 * @return it returns the column of matrix indicated by columnIndex
	 */
	public static double[] getColumn(double[][] matrix, int columnIndex) {
		double[][] transpose = getTranspose(matrix);
		return transpose[columnIndex];// the row of the transpose indicated by columnIndex
	}

	/**
	 * It returns the average of a one-dimensional vector of doubles
	 * @param vector
	 * @return the average of vector
	 */
	public static double getAverage(double vector[]) {
		double sum = 0;
		double length = vector.length;
		for (int i = 0; i < length; i++) {
			sum += vector[i];
		}
		return sum / length;
	}

	/**
	 * It prints the entries of a one-dimensional vector of doubles
	 *
	 * @param vector
	 */
	public static void printVector(double[] vector) {
		//note this syntax for a for loop! It is called foreach syntax
		for (double element : vector) {
			System.out.println(element);
		}
		
		//like to say
		//for (int i = 0; i < vector.length; i++) {
		//	System.out.println(vector[i]);
		//}
	}

	/**
	 * It returns the smallest element of a one-dimensional array of doubles
	 *
	 * @param vector the one-dimensional array
	 * @return the smallest element of the one-dimensional array
	 */
	public static double getMin(double[] vector) {
		double min = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		return min;
	}

	/**
	 * It returns the biggest element of a one-dimensional array of doubles
	 *
	 * @param vector the one-dimensional array
	 * @return the biggest element of the one-dimensional array
	 */
	public static double getMax(double[] vector) {
		double max = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			}
		}
		return max;
	}
}
