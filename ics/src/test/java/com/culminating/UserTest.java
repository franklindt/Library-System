package com.culminating;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.user.Borrower;
import com.culminating.user.Librarian;
import com.culminating.user.User;
import com.culminating.utils.Library;

import org.junit.Test;

public class UserTest {

    ArrayList<User> attendance = new ArrayList<>();

    private User user = new User("Mr Lee", "100 Dufferin Dr", 20, "male(?)", new Date(5, 5, 5));

    /************
     * Test Borrower
     */

    private final Borrower borrower = new Borrower("Edwin Lee", "123 Rabbit Drive", 20, "male(?)", new Date());

    @Test
    public void testBorrowerAttributeWasAssigned() {
        assertEquals("Edwin Lee", borrower.getName());
    }

    /**
     * Test Librarian
     */
    private final Librarian librarian = new Librarian("people", "earth", 20, "collective", new Date(), new Library());

    @Test
    public void testLibrarianAttributeWasAssigned() {
        assertEquals("collective", librarian.getGender());
    }
}
