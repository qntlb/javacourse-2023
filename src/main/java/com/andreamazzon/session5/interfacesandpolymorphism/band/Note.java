package com.andreamazzon.session5.interfacesandpolymorphism.band;

/**
 * Note is an enum type: it is useful when you have to group together and use a
 * predefined set of constant values (enumerated types, typically strings). Here
 * we create twelve name values, which represent notes. You can think about a
 * specific enum type a class, which has some useful, pre-implemented methods
 * like ordinal(), to indicate the declaration order of a particular enum
 * constant, and values(), a method that produces an array of values of the enum
 * constant in the order they are declared.
 *
 * @author Andrea Mazzon
 *
 */
public enum Note {
	/*
	 * Any object of type Note can be represented by one and only one of these
	 * types. They are implicitly public, static, final.
	 */
	C, C_SHARP, D, D_SHARP, E, F, F_SHARP, G, FLAT_A, A, A_SHARP, B
}
