/**
 * This package illustrates possible problems due to name clashes when a class
 * implements two interfaces which have two methods with same name, same
 * argument list but different return types.
 * First of all, we might ask ourselves: is it possible to have, in the same class,
 * two methods with same name and argument list, but different return types?
 * Like void foo(int i) and int foo(int i)? The answer is no: we have seen that the
 * signature of a method is constituted by its name and its argument list.
 * So, if in the same class you define twice a method with same name and same argument
 * list as another method of a class, you get an error, even if they have different
 * return types! Why that? Because sometimes you call a method not (only) for its return
 * type, but (also) for its side effect: so you could call the method int foo (int i) just
 * by typing foo(i). In that case, the compiler could not know which of the two methods it
 * has to call. So if you define two such methods in the same class, or in the same interface,
 * you get an error.
 * And what if you define one method in an interface, the other one in another interface, and
 * then you have a class implementing both? In that case, you get an error in any case: if the
 * class implements only one of the "two methods" (in quotation marks because the signature is
 * unique) then you get an error because the return type is not compatible with the one of the
 * other one. If you try to implement both, it's like if you are trying to implement twice the
 * same method.
 *
 * @author Andrea Mazzon
 *
 */
package com.andreamazzon.session5.nameclasheswithinterfaces;