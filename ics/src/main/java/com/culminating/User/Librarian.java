// 
// Decompiled by Procyon v0.5.36
// 

package com.culminating.user;

import java.util.Date;

public class Librarian extends User
{
    public Librarian() {
    }
    
    public Librarian(final String name, final String address, final int age, final String gender, final Date birthDate) {
        super(name, address, age, gender, birthDate);
    }
    
	public String toString() {
		return super.toString();
	}
}