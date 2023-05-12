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
	
	
	/**
	 * It returns an array of integers which represent the number of realizations of
	 * a given array that lie in every subinterval (bin) of an interval [minBin, maxBin].
	 * All the subintervals are of equal length. The first entry of the integer array
	 * represents the number of realizations strictly smaller then minBin, the last one the
	 * number of realizations bigger than maxBin.
	 *
	 * @param realisations
	 * @param minBin
	 * @param maxBin
	 * @param binsNumber,  number of the subintervals
	 * @return array of integers
	 */
	public static int[] buildHistogram(double[] realizations, double minBin, double maxBin, int binsNumber) {
		int[] bins = new int[binsNumber + 2];// two more because of outliers
		double binSize = (maxBin - minBin) / binsNumber; // every bin has the same length
		for (double realization : realizations) {
			if (realization < minBin) { // it goes in the first bin
				bins[0] += 1;
			} else if (realization > maxBin) {
				bins[binsNumber + 1] += 1; // it goes in the last bin
			} else {
				int intRatio = (int) ((realization - minBin) / binSize);
				/*
				 * bin[i+1] (remember: in Java the first entry is 0, and here bin[0] hosts the
				 * realization smaller than min) hosts the realization such that (realization -
				 * minBin) / binSize is in [i,i+1)
				 */
				bins[intRatio + 1] += 1;
			}
		}
		return bins;
	}
}
