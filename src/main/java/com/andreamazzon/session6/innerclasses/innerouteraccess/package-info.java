/**
 * In this package we show a first example of an inner class. Outer is a class where we define an inner
 * class Inner.
 * Here we see how private fields of the outer class can be accessed from the inner class, and vice versa.
 * An inner class can access fields of the outer class because an object of the inner class must keep a
 * reference to the particular object of the enclosing class that was responsible for creating it.
 * Indeed, as you can see in InnerOuterTesting, where we see how objects of the inner class of Outer are
 * created, the construction of the inner class object requires the reference to the object of the enclosing
 * class, and the compiler will complain if it cannot access that reference. Then when you refer to a member
 * of the enclosing class, that (hidden) reference is used to select that member.
 */
package com.andreamazzon.session6.innerclasses.innerouteraccess;