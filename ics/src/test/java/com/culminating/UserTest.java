package com.culminating;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.User.Borrower;
import com.culminating.User.Librarian;
import com.culminating.User.User;

import org.junit.Test;

public class UserTest {

    ArrayList<User> attendance = new ArrayList<>();

    private User user = new User("Mr Lee", "100 Dufferin Dr", 20, "male(?)", new Date(5,5,5));

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
      private final Librarian librarian = new Librarian("people", "earth", 20, "collective", new Date());

      @Test
      public void testLibrarianAttributeWasAssigned() {
          assertEquals("collective", librarian.getGender());
      }
}
