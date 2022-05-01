package com.culminating.record;

public class UserRecord {
    private Penalty pastFees;
    private Log[][] borrowHistory;

    public UserRecord(Penalty pastFees, Log[][] borrowHistory) {
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
    public Penalty getPastFees() {
        return this.pastFees;
    }

    public void setPastFees(Penalty pastFees) {
        this.pastFees = pastFees;
    }

    public Log[][] getBorrowHistory() {
        return this.borrowHistory;
    }

    public void setBorrowHistory(Log[][] borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

}
