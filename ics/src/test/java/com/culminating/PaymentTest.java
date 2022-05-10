package com.culminating;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import com.culminating.media.Media;
import com.culminating.payment.Fee;
import com.culminating.payment.Transaction;
import com.culminating.user.User;

import org.junit.Test;

/**
 * 
 */
public class PaymentTest {

    User testUser = new User("Jane Smith", "109 Royal Road", 24, "female", new Date(2000, 11, 21));

    /*****************
     * Test Fee
     *****************/
    Fee testFee = new Fee(testUser,
            new Media[] {
                    new Media(new Date(1942, 4, 21), "Mr. Lee", 9328, "en-ca", "random house", Character.valueOf('E'),
                            "Comedy") },
            67.32, new Date(2022, 4, 21), "Overdue", false);

    @Test
    public void testPay() {
        testFee.pay();
        assertEquals(true, testFee.getFulfilled());
    }

    /*****************
     * Test Transaction
     *****************/
    Transaction testTransaction = new Transaction();

    @Test
    public void testTransaction() {
        testTransaction.createFee(testFee);
        assertEquals(testFee,
                testTransaction.getFees().get(0));
    }
}
