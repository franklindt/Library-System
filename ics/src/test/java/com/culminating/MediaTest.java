package com.culminating;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.media.Book;
import com.culminating.media.DVD;
import com.culminating.media.EBook;
import com.culminating.media.Media;
import com.culminating.media.VideoGames;
import com.culminating.utils.Library;

import org.junit.Test;

/**
 * Unit test for the Media Classes
 */
public class MediaTest {

    ArrayList<Media> collection = new ArrayList<>();

    private Library library = new Library("308 Negra Arroyo Lane, Albuquerque, New Mexico 87104", collection,
            "(416) 395-3140", 4, "ambatakum");

    /*****************
     * Test Media
     *****************/

    private final Media media = new Media(new Date(), "Mr. Lee", 9234, "en-ca", "RandomHouse", Character.valueOf('E'),
            "horror");

    /**
     * Test transferBook() method
     */
    @Test
    public void testTransferBook() {
        media.transfer(library);
        ArrayList<Media> trueArr = new ArrayList<>();
        trueArr.add(media);
        assertArrayEquals(trueArr.toArray(), library.getCollection().toArray());
    }

    /*****************
     * Test Book
     *****************/

    private final Book book = new Book(new Date(), "Mr. Lee", 9234, "en-ca", "RandomHouse", Character.valueOf('E'),
            "horror", Character.valueOf('E'), 12349328);

    /**
     * Assert book was created
     */
    @Test
    public void testBookAttributeWasAssigned() {
        assertEquals("Mr. Lee", book.getAuthor());
    }

    /*****************
     * Test DVD
     *****************/

    private final DVD dvd = new DVD(new Date(), "Mr. Lee", 2484, "en-ca", "random house", Character.valueOf('E'),
            "classical", 128, false, true);

    /**
     * Assert DVD was created
     */
    @Test
    public void testDVDAttributeWasAssigned() {
        assertEquals(128, dvd.getStreamQuality());
    }

    /*****************
     * Test EBook
     *****************/

    private final EBook eBook = new EBook(new Date(), "Mr. Lee", 9234, "en-ca", "RandomHouse", Character.valueOf('E'),
            "horror", 329, 12349328);

    /**
     * Assert EBook was created
     */
    @Test
    public void testEBookAttributeWasAssigned() {
        assertEquals("en-ca", eBook.getLanguage());
    }

    /*****************
     * Test VideoGame
     *****************/

    private final VideoGames videoGames = new VideoGames(new Date(), "Mr. Lee", 2193, "en-ca", "random house",
            Character.valueOf('R'), "fps", "linux", new String[] { "keyboard", "mouse", "headset" }, 4);

    String[] peripheralsTest = new String[] { "keyboard", "mouse", "headset" };

    /**
     * Assert VideoGame was created
     */
    @Test
    public void testVideoGameAttributeWasAssigned() {
        assertArrayEquals(peripheralsTest, videoGames.getPeripheralsRequired());
    }

}
