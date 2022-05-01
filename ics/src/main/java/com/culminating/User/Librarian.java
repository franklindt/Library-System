package com.culminating.user;

// All commented code will be implemented in the future when the dependencies are created

public class Librarian extends User {
	// private Library library;

	public Librarian(String name, String address, int age, String gender, String birthDate/** , Library library **/
	) {
		super(name, address, age, gender, birthDate);
		// this.library = library
	}

	public String toString() {
		String librarian = super.toString() /** + "\nLibrary: " + this.library **/
		;
		return librarian;
	}
}