package com.culminating.record;

import java.util.Date;

import com.culminating.media.Media;
import com.culminating.user.User;
import com.culminating.payment.Fee;
import com.culminating.utils.Log;

public class UserRecord {
    private User owner;
    private Fee[] pastFees;
    private Log[][] borrowHistory;

    public UserRecord() {
        this.owner = new User();
        this.pastFees = new Fee[1];
        this.pastFees[0] = new Fee();
        this.borrowHistory = new Log[1][1];
        this.borrowHistory[0][0] = new Log();
    }

    public UserRecord(User owner, Fee[] pastFees, Log[][] borrowHistory) {
        this.owner = owner;
        this.pastFees = pastFees;
        this.borrowHistory = borrowHistory;
    }

    public void appendFeeLog(Fee fee) {
        // TODO: Implement this
    }

    public void appendBorrowHistory(Media media, Date date) {
        // TODO: Implement this
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

    public Fee[] getPastFees() {
        return this.pastFees;
    }

    public void setPastFees(Fee[] pastFees) {
        this.pastFees = pastFees;
    }

    public Log[][] getBorrowHistory() {
        return this.borrowHistory;
    }

    public void setBorrowHistory(Log[][] borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    public String toString() {
        String ret = "";
        ret += "User: " + this.owner.toString() + "\nFees: ";
        for (int i = 0; i < this.pastFees.length; i++) {
            ret += pastFees[i].toString() + ",";
        }
        for (int i = 0; i < this.borrowHistory.length; i++) {
            for (int j = 0; j < this.borrowHistory[i].length; j++) {
                ret += this.borrowHistory[i][j].toString() + ",";
            }
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }

}
