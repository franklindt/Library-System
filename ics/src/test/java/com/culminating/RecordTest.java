package com.culminating;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.media.Media;
import com.culminating.payment.Fee;
import com.culminating.record.LibraryRecord;
import com.culminating.record.MediaRecord;
import com.culminating.record.UserRecord;
import com.culminating.user.User;
import com.culminating.utils.Log;

import org.junit.Test;

/**
 * 
 */
public class RecordTest {

        User testUser = new User("Jane Smith", "109 Royal Road", 24, "female", new Date(2000, 11, 21));

        Fee testFee = new Fee(testUser,
                        new Media[] {
                                        new Media(new Date(1942, 4, 21), "Mr. Lee", 9328, "en-ca", "random house",
                                                        Character.valueOf('E'),
                                                        "Comedy") },
                        67.32, new Date(2022, 4, 21), "Overdue", false);

        Log testLog = new Log(testUser,
                        new Media(new Date(1942, 4, 21), "Mr. Lee", 9328, "en-ca", "random house",
                                        Character.valueOf('E'),
                                        "Comedy"),
                        new Date(2022, 4, 21), "checkout");
        Log testLog2 = new Log(testUser,
                        new Media(new Date(1942, 4, 21), "Mr. Lee", 9328, "en-ca", "random house",
                                        Character.valueOf('E'),
                                        "Comedy"),
                        new Date(1942, 4, 21), "checkout");

        ArrayList<Log> testLogs = new ArrayList<>();
        ArrayList<Fee> testPastFees = new ArrayList<>();

        UserRecord testUserRecord = new UserRecord(testUser, testPastFees, testLogs);
        MediaRecord testMediaRecord = new MediaRecord(testLogs,
                        new Media(new Date(1942, 4, 21), "Mr. Lee", 9328, "en-ca", "random house",
                                        Character.valueOf('E'),
                                        "Comedy"));
        LibraryRecord testLibraryRecord = new LibraryRecord(new ArrayList<UserRecord>(),
                        new ArrayList<MediaRecord>());

        /*****************
         * Test LibraryRecord
         *****************/

        /**
         * 
         */
        @Test
        public void testUserRetrieval() {
                testLogs.add(testLog);
                testLogs.add(testLog2);
                testPastFees.add(testFee);
                ArrayList<UserRecord> testUserRecords = testLibraryRecord.getUserRecords();
                for (UserRecord userRecord : testUserRecords) {
                        assertEquals(testUser, userRecord.getOwner());
                }
        }

        /**
         * 
         */
        @Test
        public void testMediaRetrieval() {
                testLogs.add(testLog);
                testLogs.add(testLog2);
                testPastFees.add(testFee);
                ArrayList<MediaRecord> testMediaRecords = testLibraryRecord.getMediaRecords();
                for (MediaRecord mediaRecord : testMediaRecords) {
                        assertEquals("Mr. Lee", mediaRecord.getItem().getAuthor());
                }
        }
}
