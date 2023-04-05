package com.andreamazzon.session2.bankclients;

/**
 * In this class we see an example of another use of "this". In particular, we
 * see that it's possible to write a method that returns a reference to the
 * object which calls the method itself. This is done by returning "this".
 * A frequent use of this possibility is to enhance the way a complex object
 * (let's say, an object with many fields) is built. What we want to do is to
 * separate its construction with its representation. 
 * Here you see that we want to construct an object of type Client for a bank.
 * It has many fields, five of them of type String, so if you use the constructor
 * there's quite a big probability to do mistakes: for example, one might invert
 * the order two strings are called in the constructor. To avoid this, you might want to
 * initialize the fields one at time, with different methods.
 * What you could do is to create first your object with your first method, and then to
 * make it set all the other fields, one per line, with dedicated methods. But this would
 * be quite lengthy! What you would like is the possibility to do multiple calling, all at
 * the same line, all for the same object. This way to construct an object in known as as
 * Builder pattern, and uses the return of the reference of the object calling
 * the methods. Also note that we first need a static method to construct the
 * object for the first time.
 *
 * @author Andrea Mazzon
 *
 */
public class Client {

	// string defining some characteristics of the client
	String id;
	String name;
	String advisor;
	String nationality;
	String cityOfResidence;

	int age;

	double riskAversionIndex;
	double sumInvested;

	boolean hasInsurance;

	/*
	 * Constructor: if one calls it from the outside, he/she might do mistakes, for
	 * example inverting the order of two fields
	 */
	Client(String id, String name, String advisor, String nationality, String cityOfResidence, int age,
			double riskAversionIndex, double sumInvested, boolean hasInsurance) {
		this.id = id;
		this.name = name;
		this.advisor = advisor;
		this.nationality = nationality;
		this.cityOfResidence = cityOfResidence;

		this.age = age;

		this.riskAversionIndex = riskAversionIndex;
		this.sumInvested = sumInvested;

		this.hasInsurance = hasInsurance;
	}


	/*
	 * One could also call directly this constructor to construct an object. However, calling
	 * the stating method below is a bit more elegant
	 */
	Client(String id) {
		this.id = id;
	}

	/*
	 * This method is static: it means that can be called without first creating an
	 * object of the class. Actually, this method has exactly the goal of
	 * constructing an object of the class!
	 */
	static Client createNewClient(String id) {
		return new Client(id);
	}

	/*
	 * From here on you can see all these methods setting a value of a field of the
	 * class and returning "this": in this way, the reference of the same object
	 * calling the methods is returned, and we can have multiple calls. See the
	 * main method of the class ClientConstruct.
	 *
	 */
	Client name(String name) {
		this.name = name;
		return this;
	}

	Client advisor(String advisor) {
		this.advisor = advisor;
		return this;
	}

	Client nationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	Client cityOfResidence(String cityOfResidence) {
		this.cityOfResidence = cityOfResidence;
		return this;
	}

	Client age(int age) {
		this.age = age;
		return this;
	}

	Client riskAversionIndex(double riskAversionIndex) {
		this.riskAversionIndex = riskAversionIndex;
		return this;
	}

	Client sumInvested(double sumInvested) {
		this.sumInvested = sumInvested;
		return this;
	}

	Client hasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
		return this;
	}


	// we write this method just to check that everything is fine.
	void printName() {
		System.out.println(name);
	}
	
	// we write this method just to check that everything is fine.
	void printNationality() {
			System.out.println(nationality);
		}

}
