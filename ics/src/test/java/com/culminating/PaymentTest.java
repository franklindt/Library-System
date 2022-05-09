package com.culminating;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.payment.*;

import com.culminating.media.Media;
import com.culminating.User.User;

import org.junit.Test;

/**
 * Unit test for the Payment Classes
 */

 public class PaymentTest {
     
    /**
     * Test Fee
     */

     private Fee fee = new Fee(new User("grace", "big house place", 10, "gender", new Date()), new ArrayList<Media>(), 6.9, new Date(), "details", false);

     public void testFeeAttributes() {
         assertEquals("com.culminating.user.User", fee.getRecipient().getClass());
         assertEquals(6.9, fee.getAmount());
         assertArrayEquals(new ArrayList<Media>().toArray(), fee.getItem());
     }

     /**
      * Test Transaction
      */

      private Transaction transaction = new Transaction();

      public void testTransactionAttributes() {
          assertArrayEquals(new ArrayList<Fee>().toArray(), transaction.getFees().toArray());
      }

      public void testTransactionCreateFee() {
          fee.createFee(new Fee(new User("name", "address", 1, "gender", new Date()), new ArrayList<Media>(), 6.9, new Date(), "details", false));
          assertEquals("name", transaction.getFees().get(0).getRecipient().getName());
      }

 }