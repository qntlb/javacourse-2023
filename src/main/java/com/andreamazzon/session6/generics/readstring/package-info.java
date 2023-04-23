/**
 * The code in this package, together with the one in
 * com.andreamazzon.session6.generics.fibonacci, shows an example of the use of
 * generics.
 * The class CharactersOfString here and the class FibonacciSequence in the package
 * above both implement the interface GenericPointer defined in
 * com.andreamazzon.session6.generics.genericinterfaces.
 * The method next() defined in GenericPointer returns a Character in this case and a
 * Long in FibonacciSequence. So it made sense to avoid to set the return type in the
 * definition of next() in the interface. However, once we define a class here
 * we also define this return type. In the case of this package, the
 * implementation of next() gives a way to read and return the characters of a
 * string, when called iteratively.
 */
package com.andreamazzon.session6.generics.readstring;