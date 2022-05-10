
package com.culminating.user;

import java.util.Date;

public class Borrower extends User {
	/**
	 * Default constructor
	 */
	public Borrower() {
		super();
	}

	/**
	 * Creates a borrower object
	 * 
	 * @param name      -> name of the borrower
	 * @param address   -> address of the borrower
	 * @param age       -> age of the borrower
	 * @param gender    -> gender of the borrower
	 * @param birthDate -> birth date of the borrower
	 */
	public Borrower(final String name, final String address, final int age, final String gender, final Date birthDate) {
		super(name, address, age, gender, birthDate);
	}

	/**
	 * @return String -> string representation of this class
	 */
	public String toString() {
		return super.toString();
	}
}