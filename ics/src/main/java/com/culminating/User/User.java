package com.culminating.user;

// All commented code will be implemented in the future when the dependencies are created

public class User {

	private String name;
	private String address;
	private int age;
	private String gender;
	private String birthDate;

	public User(String name, String address, int age, String gender, String birthDate) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		String user = "Name: " + this.name + "\nAddress: " + this.address + "\nAge: " + this.age + "\nGender: " + this.gender + "\nBirth Date: " + this.birthDate;
		return user;
	}
	
	// public static void pay(Fee fee) {
	// 	return
	// }
}