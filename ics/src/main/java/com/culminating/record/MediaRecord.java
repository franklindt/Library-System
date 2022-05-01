package com.culminating.record;

public class MediaRecord {
    private Log[][] borrowHistory;
    private Media item;

    public MediaRecord(Log[][] borrowHistory, Media item) {
        this.borrowHistory = borrowHistory;
        this.item = item;
    }

    public Log[][] getBorrowHistory() {
        return this.borrowHistory;
    }

    public void setBorrowHistory(Log[][] borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public Media getItem() {
        return this.item;
    }

    public void setItem(Media item) {
        this.item = item;
    }

}