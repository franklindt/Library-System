package com.culminating.record;

import com.culminating.media.Media;
import com.culminating.utils.Log;

public class MediaRecord {
    private Log[][] borrowHistory;
    private Media item;
    
    public MediaRecord() {
        this.item = new Media();
        this.borrowHistory = new Log[1][1];
        this.borrowHistory[0][0] = new Log();
    }

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
    
    public String toString() {
      String ret = "";
      ret += "Item: " + this.item.toString() + "\n";
      for (int i = 0; i < this.borrowHistory.length; i++) {
         for (int j = 0; j < this.borrowHistory[i].length; j++) {
            ret += this.borrowHistory[i][j].toString() + ",";
         }
      }
      ret = ret.substring(0,ret.length()-1);
      return ret;
    }

}