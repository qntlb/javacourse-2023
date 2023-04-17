/**
 * In this package we illustrate the meaning of an interface with package access:
 * we have a tester class, with a main method that is able to create an object of the public class
 * ImplementingClass, which implements the interface PackageAccessInterface, both in the package
 * com.andreamazzon.session5.packageaccessinterfaces. The method that ImplementingClass implements is public,
 * since the methods of an interface are automatically public, so we can call it from here.
 * However, it is not possible to import the interface itself, because it has only package access.
 */
package com.andreamazzon.session5.anotherpackage;