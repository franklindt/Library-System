package com.culminating;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.utils.*;

import org.junit.Test;

import com.culminating.user.User;
import com.culminating.media.Media;
import com.culminating.payment.Fee;

public class UtilTest {

    private final Hold hold = new Hold(new User("frank", "bridge", 16, "apache attack helicopter", new Date()),
            new Media(new Date(), "ben", 177013, "british", "kiwi house", 'G', "sol"), new Date(), "hold", false);

    /**
     * Test Hold
     */

    @Test
    public void testHoldAttribute() {
        assertEquals("hold", hold.getDetail());
    }

    @Test
    public void testHoldArrivedMethod() {
        hold.setArrived(true);
        assertEquals(true, hold.getArrived());
    }

    /**
     * Test Log
     */

    private final Log log = new Log(new User("bob", "5 pineapple lane", 17, "male", new Date()),
            new Media(new Date(), "yi san", 000000, "West Chinese", "I", 'P', "nice"), new Date(), "a book");

    @Test
    public void testLogAttribute() {
        assertEquals("a book", log.getDetail());
    }

    /**
     * Test ItemStatus
     */

    private final ItemStatus itemstatus = new ItemStatus(new User("name", "address", 3, "gender", new Date()),
            new Media(new Date(), "author", 111111, "language", "publisher", 'a', "genre"), new Date(), "detail", false,
            0);

    @Test
    public void testItemStatusAttribute() {
        assertEquals(0, itemstatus.getTimesRenewed());
        assertEquals("author", itemstatus.getItem().getAuthor());
    }

    /**
     * Test Library
     */

    private final Library library = new Library("hillcrest something", new ArrayList<Media>(), "911", 5,
            "omaygat ambutakum");

    @Test
    public void testLibraryAttributes() {
        assertEquals("omaygat ambutakum", library.getWifiPwd());
        ArrayList<Media> newArr = new ArrayList<>();
        assertArrayEquals(newArr.toArray(), library.getCollection().toArray());
    }

    /**
     * Test Handler
     */

    private final Handler handler = new Handler(new ArrayList<Hold>(), new ArrayList<Fee>(),
            new ArrayList<ItemStatus>(),
            new ArrayList<User>());

}
