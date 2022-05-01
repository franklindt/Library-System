package com.culminating.user;

// All commented code will be implemented in the future when the dependencies are created

public class Borrower extends User {
	// private Library library;

	public Borrower(String name, String address, int age, String gender, String birthDate /* Library library */) {
		super(name, address, age, gender, birthDate);
		// this.library = library;
	}

	@Override
	public String toString() {
		String borrower = super.toString() /** + "\nLibrary: " + this.library **/
		;

		return borrower;
	}
}