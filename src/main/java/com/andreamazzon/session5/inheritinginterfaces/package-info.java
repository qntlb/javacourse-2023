/**
 * Scope of this package is to illustrate that, differently from what happens with classes, multiple inheritance
 * is possible for interfaces: an interface can indeed inherit from more than one interface. This makes
 * sense, because there are (often, not always) already implemented methods leading to possible clashes.
 * We see that a class implementing an interface which extends two interfaces must implement:
 * - the methods of the two parent interfaces;
 * - the methods of the derived interface.
 */

package com.andreamazzon.session5.inheritinginterfaces;