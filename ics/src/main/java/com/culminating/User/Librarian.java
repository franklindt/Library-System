package com.culminating.user;

import java.util.Date;

import com.culminating.utils.Library;

public class Librarian extends User {

	private Library workplace;

	public Librarian() {
		super();
	}

	public Librarian(final String name, final String address, final int age, final String gender,
			final Date birthDate, final Library workplace) {
		super(name, address, age, gender, birthDate);
		this.workplace = workplace;
	}

	public void setLibrary(Library library) {
		setWorkplace(library);
	}

	public Library getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(Library workplace) {
		this.workplace = workplace;
	}

	public String toString() {
		return super.toString() + " " + getWorkplace();
	}
}