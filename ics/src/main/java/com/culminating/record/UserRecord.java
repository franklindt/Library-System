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

/**
 * Represents the history of a User's borrowing history and fee history
 */
public class UserRecord {
    /** The User associated with this record */
    private User owner;
    /** List of fees the user incurred */
    private List<Fee> pastFees;
    /** List of the borrowing history of the user */
    private List<Log> borrowHistory;

    /**
     * Creates a UserRecord object containing all the details associated with User
     */
    public UserRecord() {
        this.owner = new User();
        this.pastFees = new ArrayList<Fee>();
        this.borrowHistory = new ArrayList<Log>();
    }

    public UserRecord(User owner) {
        this.owner = owner;
        this.pastFees = new ArrayList<Fee>();
        this.borrowHistory = new ArrayList<Log>();
    }

    /**
     * Creates a UserRecord object containing all the details associated with User
     */
    public UserRecord(User owner, List<Fee> pastFees, List<Log> borrowHistory) {
        this.owner = owner;
        this.pastFees = pastFees;
        this.borrowHistory = borrowHistory;
    }

    /**
     * Adds a fee to the fee history
     * 
     * @param fee -> new fee to be added to the fee history
     */
    public void appendFeeLog(Fee fee) {
        this.pastFees.add(fee);
    }

    /**
     * Appends a Log to the borrowing history
     * 
     * @param media -> media item to be added to the log object
     * @param date  -> date to be added to a new log object
     */
    public void appendBorrowHistory(Media media, Date date) {
        List<Log> tempBorrowHistory = this.borrowHistory;
        Log newLog = new Log(this.owner, media, date, "checkout");
        tempBorrowHistory.add(newLog);
        this.borrowHistory = tempBorrowHistory;
    }

    /**
     * Appends a Log to the borrowing history
     * 
     * @param media  -> media item to be added to the log object
     * @param date   -> date to be added to a new log object
     * @param detail -> description for the log object
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

    /**
     * gets the user
     * 
     * @return User -> user associated with this user record
     */
    public User getOwner() {
        return this.owner;
    }

    /**
     * sets the owner
     * 
     * @param owner -> changes owner associated with this user record
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * gets the fee history
     * 
     * @return List<Fee> -> fee history
     */
    public List<Fee> getPastFees() {
        return this.pastFees;
    }

    /**
     * sets a new fee history
     * 
     * @param pastFees -> fee history to be set
     */
    public void setPastFees(List<Fee> pastFees) {
        this.pastFees = pastFees;
    }

    /**
     * get the borrow history
     * 
     * @return List<Log> -> borrow history
     */
    public List<Log> getBorrowHistory() {
        return this.borrowHistory;
    }

    /**
     * set borrow history
     * 
     * @param borrowHistory -> borrow history to be set
     */
    public void setBorrowHistory(List<Log> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    /**
     * String representation of the UserRecord
     * 
     * @return String
     */
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
