

// 
// Decompiled by Procyon v0.5.36
// 

package com.culminating.user;

import java.util.Date;

public class User
{
    private String name;
    private String address;
    private int age;
    private String gender;
    private Date birthDate;
    
    public User() {
        this.name = "";
        this.address = "";
        this.age = -1;
        this.gender = "";
        this.birthDate = new Date();
    }
    
    public User(final String name, final String address, final int age, final String gender, final Date birthDate) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
        String user = "Name: " + this.name + "\nAddress: " + this.address + "\nAge: " + this.age + "\nGender: " + this.gender + "\nBirthdate: " + this.birthDate;
        return user;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getBirthDate() {
        return this.birthDate.toString();
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setAddress(final String address) {
        this.address = address;
    }
    
    public void setAge(final int age) {
        this.age = age;
    }
    
    public void setGender(final String gender) {
        this.gender = gender;
    }
    
    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }
}

