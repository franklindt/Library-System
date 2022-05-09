/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: User Record class
*/

package com.culminating.record;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.culminating.media.Media;
import com.culminating.user.User;
import com.culminating.payment.Fee;
import com.culminating.utils.Log;

public class UserRecord {
    private User owner;
    private List<Fee> pastFees;
    private List<Log> borrowHistory;

    public UserRecord() {
        this.owner = new User();
        this.pastFees = new ArrayList<Fee>();
        this.pastFees.set(0, new Fee());
        this.borrowHistory = new ArrayList<Log>();
        this.borrowHistory.set(0, new Log());
    }

    public UserRecord(User owner, List<Fee> pastFees, List<Log> borrowHistory) {
        this.owner = owner;
        this.pastFees = pastFees;
        this.borrowHistory = borrowHistory;
    }

    /**
     * 
     * @param fee
     */
    public void appendFeeLog(Fee fee) {
        this.pastFees.add(fee);
    }

    /**
     * 
     * @param media
     * @param date
     */
    public void appendBorrowHistory(Media media, Date date) {
        List<Log> tempBorrowHistory = this.borrowHistory;
        Log newLog = new Log(this.owner, media, date, "checkout");
        tempBorrowHistory.add(newLog);
        this.borrowHistory = tempBorrowHistory;
    }

    /**
     * 
     * @param media
     * @param date
     * @param detail
     */
    public void appendBorrowHistory(Media media, Date date, String detail) {
        List<Log> tempBorrowHistory = this.borrowHistory;
        Log newLog = new Log(this.owner, media, date, detail);
        tempBorrowHistory.add(newLog);
        this.borrowHistory = tempBorrowHistory;
    }
    /*
     * Accessors and Mutators
     */

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Fee> getPastFees() {
        return this.pastFees;
    }

    public void setPastFees(List<Fee> pastFees) {
        this.pastFees = pastFees;
    }

    public List<Log> getBorrowHistory() {
        return this.borrowHistory;
    }

    public void setBorrowHistory(List<Log> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public String toString() {
        String ret = "";
        ret += "User: " + this.owner.toString() + "\nFees: ";
        for (int i = 0; i < this.pastFees.size(); i++) {
            ret += pastFees.get(i).toString() + ",";
        }
        for (int i = 0; i < this.borrowHistory.size(); i++) {
            ret += this.borrowHistory.get(i).toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }

}
