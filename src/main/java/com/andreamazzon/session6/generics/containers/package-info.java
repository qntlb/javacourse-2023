/**
 * The code in this package illustrates some features and uses of “Java Generics”,
 * a term related to the definition and use of generic classes, interfaces and methods.
 * The class GenericType is a container for a general object: it has a private field
 * whose value can be set and returned by the usual setter and getter.
 * We don't want to specify the type of the field, but we want that once an object
 * of the class GenericType is created, the type of the field FOR THAT OBJECT cannot
 * be changed: we don't want that the user has the possibility to first set it to be an
 * int and then a double.
 * In this case, we can use generics: we write a T inside angular brackets after the name
 * of the class, and this T will be a placeholder for the type of its field: we are left
 * with all the freedom for that type, but it has to be the same for a single object.
 * This is done to avoid bugs at run time (if this class is for example part of a more
 * complex project): in this way, if we assign two different types to that field for the
 * same object, we get an error at compilation time.
 * In GenericTesting, note the difference between how we can set values for the field
 * genericField of an object of type GenericType and for an object of type
 * ObjectTypeClass: we can change its type for an object of ObjectTypeClass, but not for
 * an object of GenericType. Of course anyway we can construct two objects of GenericType,
 * giving to their fields different types.
 */
package com.andreamazzon.session6.generics.containers;