/**
 * Name(s): Franklin, Mike, Grace, Sophia
 * Date: 2022-05-04
 * Description: Media record class
 */

package com.culminating.record;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.culminating.media.Media;
import com.culminating.utils.Log;

/**
 * Represents the borrow history of a particular Media item
 */
public class MediaRecord {
    /** List of Logs which form the borrowing history of the Media Item */
    private List<Log> borrowHistory;
    /** The Media item with a log of its borrow history */
    private Media item;

    /**
     * Creates a MediaRecord object that holds a list of logs (borrow history) and
     * the media that is attached
     */
    public MediaRecord() {
        this.item = new Media();
        this.borrowHistory = new ArrayList<Log>();
        this.borrowHistory.set(0, new Log());
    }

    /**
     * Default constructor
     * 
     * @param item -> media item to be associated with the record
     */
    public MediaRecord(Media item) {
        this.item = item;
        this.borrowHistory = new ArrayList<Log>();
    }

    /**
     * Creates a MediaRecord object with prexisting logs and an item
     * 
     * @param borrowHistory -> Log of borrowers using the Log object
     * @param item          -> The Media item associated with the borrow history
     * @see Log
     */
    public MediaRecord(List<Log> borrowHistory, Media item) {
        this.borrowHistory = borrowHistory;
        this.item = item;
    }

    /**
     * Searches for the most popular Media item in the Media record by going through
     * the borrow history and returns it
     * 
     * @return Media -> the most popular media object
     */
    public Media getPopularItem() {
        List<Log> tempLog = getBorrowHistory(); // Stores the borrow history of this Media item in a temporary List

        Map<Media, Integer> popularMap = new HashMap<>(); // Maps the amount of times a media item appears in the borrow
                                                          // history

        Media popularMedia = new Media(); // Create a default media object to store the most popular media

        // Iterate through the borrowing history and increment the count in the hashmap
        for (int i = 0; i < tempLog.size(); i++) {
            Log checkout = tempLog.get(i);
            Media item = checkout.getItem();
            int count = popularMap.getOrDefault(item, 0);
            popularMap.putIfAbsent(item, count + 1);
        }

        // Find the highest count in the value side of the key-value pair in the hashmap
        int maxValue = Collections.max(popularMap.values());

        // Iterate through the key-value pairs and if any one of the values match the
        // maxValue, then pull out the key (Media object) and store it in the
        // popularMedia object
        for (Entry<Media, Integer> entry : popularMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                popularMedia = entry.getKey();
            }
        }
        return popularMedia; // return the most popular Media item
    }

    /**
     * Returns the borrow history
     * 
     * @return borrowHistory -> list of logs
     */
    public List<Log> getBorrowHistory() {
        return this.borrowHistory;
    }

    /**
     * Sets the new borrow history
     * 
     * @param borrowHistory
     */
    public void setBorrowHistory(List<Log> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    /**
     * Returns the media associated with this MediaRecord
     * 
     * @return -> Media
     */
    public Media getItem() {
        return this.item;
    }

    /**
     * Sets the Media item
     * 
     * @param item -> Media
     */
    public void setItem(Media item) {
        this.item = item;
    }

    /**
     * Stringify the MediaRecord object
     * 
     * @return String -> String representation of every attribute in MediaRecord
     */
    public String toString() {
        String ret = "";
        ret += "Item: " + this.item.toString() + "\n";
        for (int i = 0; i < this.borrowHistory.size(); i++) { // Iterate over the borrow history and call the Log
                                                              // toString() to add to the string
            ret += this.borrowHistory.get(i).toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1); // Trim the final string
        return ret; // return the string
    }

}
