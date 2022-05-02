
package com.culminating.user;

import java.util.Date;

public class Borrower extends User {
	public Borrower() {
		super();
	}

	public Borrower(final String name, final String address, final int age, final String gender, final Date birthDate) {
		super(name, address, age, gender, birthDate);
	}

	public String toString() {
		return super.toString();
	}
}