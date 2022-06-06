/**
 * Name(s): Franklin, Mike, Grace, Sophia
 * Date: 2022-05-04
 * Description: Librarian class
 */
package com.culminating.user;

import java.util.Date;

import com.culminating.utils.Library;

/**
 * Represents a Librarian
 */
public class Librarian extends User {

	/** workplace of the librarian */
	private Library workplace;

	/**
	 * Empty constructor
	 */
	public Librarian() {
		super();
	}

	/**
	 * Creates a librarian object and sets their workplace
	 * 
	 * @param name      -> name of the librarian
	 * @param address   -> address of the librarian
	 * @param age       -> age of the librarian
	 * @param gender    -> gender of the librarian
	 * @param birthDate -> dob of the librarian
	 * @param workplace -> workplace the librarian works at
	 */
	public Librarian(final String name, final String address, final int age, final String gender,
			final Date birthDate, final Library workplace) {
		super(name, address, age, gender, birthDate);
		this.workplace = workplace;
	}

	/**
	 * sets the workplace of the librarian, different method name to wrap the setter
	 * 
	 * @param library -> the workplace
	 */
	public void setLibrary(Library library) {
		setWorkplace(library);
	}

	/**
	 * gets the workplace of the librarian
	 * 
	 * @return Library -> librarian's workplace
	 */
	public Library getWorkplace() {
		return this.workplace;
	}

	/**
	 * sets the workplace of the librarian
	 * 
	 * @param workplace
	 */
	public void setWorkplace(Library workplace) {
		this.workplace = workplace;
	}

	/**
	 * @return String -> string representation of the librarian object
	 */
	public String toString() {
		return super.toString() + " " + getWorkplace();
	}
}
