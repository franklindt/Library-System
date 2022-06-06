/**
 * Name(s): Franklin, Mike, Grace, Sophia
 * Date: 2022-05-04
 * Description: User class
 */
package com.culminating.user;

import java.util.Date;

public class User {
    /**
     * Name of the user
     */
    private String name;

    /**
     * Address of the user
     */
    private String address;

    /**
     * Age of the user
     */
    private int age;

    /**
     * Gender of the user
     */
    private String gender;

    /**
     * BirthDate of the user
     */
    private Date birthDate;

    /**
     * Default Constructor of User, Initializes the attributes name, address, age,
     * gender and birthDate
     */
    public User() {
        this.name = "";
        this.address = "";
        this.age = -1;
        this.gender = "";
        this.birthDate = new Date();
    }

    /**
     * Constructor of User
     * 
     * @param name,      Name of the user
     * @param address,   address of the user
     * @param age,       age of the user
     * @param gender,    gender of the user
     * @param birthDate, birthDate of the user
     */
    public User(final String name, final String address, final int age, final String gender, final Date birthDate) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    /**
     * Returns all the attributes of the user in a String.
     *
     * @return String representation all the attributes of the user.
     */
    @Override
    public String toString() {
        String user = "Name: " + this.name + "\nAddress: " + this.address + "\nAge: " + this.age + "\nGender: "
                + this.gender + "\nBirthdate: " + this.birthDate;
        return user;
    }

    /**
     * Description: Gets the name of user
     * 
     * @return the name of user
     */
    public String getName() {
        return this.name;
    }

    /**
     * Description: Gets the address of user
     * 
     * @return the address of user
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Description: Gets the age of user
     * 
     * @return the age of user
     */
    public int getAge() {
        Date now = new Date();
        if (this.getBirthDate() != null) {
            return now.getYear() - this.getBirthDate().getYear();
        } else {
            return this.age;
        }
    }

    /**
     * Description: Gets the gender of user
     * 
     * @return the gender of user
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Description: Gets the birthDate of user
     * 
     * @return the birthDate of user
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    /**
     * Description: Sets name of user
     * 
     * @param name, the name of user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description: Sets address of user
     * 
     * @param address, the address of user
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Description: Sets age of user
     * 
     * @param age, the age of user
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Description: Sets gender of user
     * 
     * @param gender, the gender of user
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Description: Sets birthDate of user
     * 
     * @param birthDate, the birthDate of user
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
