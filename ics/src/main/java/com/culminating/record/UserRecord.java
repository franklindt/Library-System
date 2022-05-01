package com.culminating.record;

import java.util.Date;

import com.culminating.media.Media;
import com.culminating.payments.Fee;
import com.culminating.utils.Log;

public class UserRecord {
    private Fee[] pastFees;
    private Log[][] borrowHistory;

    public UserRecord(Fee[] pastFees, Log[][] borrowHistory) {
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

}
