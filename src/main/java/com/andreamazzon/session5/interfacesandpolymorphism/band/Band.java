package com.andreamazzon.session5.interfacesandpolymorphism.band;

/**
 * This class has a static method that makes a specific type of Instrument
 * playing a note, and a main method that makes all the instruments playing some
 * notes. Note that all the objects get upcasted to the interface they are
 * implementing when tune is called.
 *
 * @author Andrea Mazzon
 *
 */
public class Band {
	/*
	 * Polymorphism: at compilation time, this method doesn’t care about the type of
	 * the instrument, so we can give it directly an Instrument reference. In this
	 * way, when we add new types to the system it still works right, without any
	 * need to change the code.
	 */
	/**
	 * It makes an Instrument playing a Note in its specific way
	 */
	public static void tune(Instrument i, Note n) {
		i.play(n);
	}

	public static void main(String[] args) {
		/*
		 * The reference is always the one to the interface, but the specific type
		 * changes. As in the example with shapes!
		 */
		Instrument[] orchestra = { new Wind(), new Percussion(), new Woodwind() };
		Note[] notes = { Note.A, Note.F_SHARP, Note.B };

		orchestra[0].play(notes[0]);
		System.out.println();

		// cannot do it, even if it is a Wind(): the reference is to Instrument!
		// orchestra[0].specificWind();

		for (Instrument i : orchestra) {// look at the use of the foreach syntax!
			for (Note n : notes) {
				tune(i, n);
			}
		}
	}
}
