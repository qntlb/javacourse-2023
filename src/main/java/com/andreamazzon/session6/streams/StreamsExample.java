package com.andreamazzon.session6.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class shows some examples of uses of Streams. This is an useful tool as it permits
 * for example to perform operations in fewer and more readable lines of code compared
 * to arrays or lists.
 * 
 * @author Andrea Mazzon
 *
 */
public class StreamsExample {

	public static void main(String[] args) {
		
		Random randomProducer = new Random(); //random numbers generator


		Double[] arrayToBeFilled = new Double[7];
		
		for(int i = 0; i < arrayToBeFilled.length; i++) {
			//you cannot go out of bounds: you would get a runtime error
			
			//(pseudo)random double between 0 included and 500 excluded
			arrayToBeFilled[i] = randomProducer.nextDouble(500);
		}
		
		/*
		 * You cannot consume a Stream more than once, that is, you cannot ask one single
		 * Stream to perform more than one operation. That's why we use a stream supplier,
		 * a kind of "factory" that produces more streams with same elements.
		 */
		
		//note how to convert an array into a stream.
		Supplier<Stream<Double>> streamSupplier  = () -> Arrays.stream(arrayToBeFilled);

		//note how to create a stream from a stream supplier
		Stream<Double> firstStream = streamSupplier.get();
		
		//how to print a Stream
		System.out.println("Our stream: " + firstStream.collect(Collectors.toList()));

		System.out.println();
		
		Stream<Double> secondStream = streamSupplier.get();
		
		/*
		 * How to check if it is true or not that there exists at least an element
		 * of a stream which satisfies one property
		 */
		System.out.println("Does there exists at least one element of our Stream bigger than 250? " + secondStream.anyMatch(number -> number > 250));

		Stream<Double> thirdStream = streamSupplier.get();
		
		System.out.println();

		
		// How to check if all the elements of a Stream satisfy a property
		System.out.println("Is that true for all the elements? " + thirdStream.allMatch(number -> number > 250));
		
		/*
		 * How to filter a Stream: that is, how to delete the elements of the stream
		 * (in this case one Stream returned by streamSupplier.get()) that do not
		 * satisfy a given property.
		 */
		Stream<Double> fourthStream = streamSupplier.get().filter(number -> number > 250);
		
		System.out.println();
		
		System.out.println("Elements of our stream which are bigger than 250: " +  fourthStream.collect(Collectors.toList()));
		
		Stream<Double> fifthStream = streamSupplier.get();
		
		System.out.println();
		
		/*
		 * How to apply an operation to all elements of a Stream, and save the Stream
		 * obtained in this way in another Stream.
		 */
		Stream<Double> sixthStream = fifthStream.map(number -> 2*number);
		System.out.println("Elements of our stream multiplied by 2: " + sixthStream.collect(Collectors.toList()));			
	}
}
