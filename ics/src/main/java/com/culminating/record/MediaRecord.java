package com.culminating.record;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.culminating.media.Media;
import com.culminating.utils.Log;

public class MediaRecord {
    private List<Log> borrowHistory;
    private Media item;

    public MediaRecord() {
        this.item = new Media();
        this.borrowHistory = new ArrayList<Log>();
        this.borrowHistory.set(0, new Log());
    }

    public MediaRecord(List<Log> borrowHistory, Media item) {
        this.borrowHistory = borrowHistory;
        this.item = item;
    }

    /**
     * 
     * @return
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

    public List<Log> getBorrowHistory() {
        return this.borrowHistory;
    }

    public void setBorrowHistory(List<Log> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public Media getItem() {
        return this.item;
    }

    public void setItem(Media item) {
        this.item = item;
    }

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