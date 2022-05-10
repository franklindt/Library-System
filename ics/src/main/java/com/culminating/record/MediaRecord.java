/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Media record class
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
 * Represents borrow history of a particular Media item
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
        List<Log> tempLog = this.borrowHistory;

        Map<Media, Integer> popularMap = new HashMap<>();

        Media popularMedia = new Media();

        for (int i = 0; i < tempLog.size(); i++) {
            Log checkout = tempLog.get(i);
            Media item = checkout.getItem();
            int count = popularMap.getOrDefault(item, 0);
            popularMap.putIfAbsent(item, count + 1);
        }

        int maxValue = Collections.max(popularMap.values());
        for (Entry<Media, Integer> entry : popularMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                popularMedia = entry.getKey();
            }
        }
        return popularMedia;
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
     * 
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
     * @return -> String representation of every item in MediaRecord
     */
    public String toString() {
        String ret = "";
        ret += "Item: " + this.item.toString() + "\n";
        for (int i = 0; i < this.borrowHistory.size(); i++) {
            ret += this.borrowHistory.get(i).toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }

}