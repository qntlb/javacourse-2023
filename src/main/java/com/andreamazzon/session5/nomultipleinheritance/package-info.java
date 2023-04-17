/**
 * In this package we show why multiple inheritance is not allowed in Java: if a class inherits from
 * two base classes, it can happen that the two classes have a method with same name, same argument list
 * and different implementation. Or/and a field with the same name and initialized to different values.
 * In this case, which implementation can the derived class inherit? And which value to give to that field?
 * Multiple inheritance is therefore not allowed IN ANY CASE.
 */
package com.andreamazzon.session5.nomultipleinheritance;