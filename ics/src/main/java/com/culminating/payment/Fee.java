package com.culminating.payment;

import java.util.Date;
import com.culminating.media.Media;
import com.culminating.user.User;

public class Fee {
    private User recipient;
    private Media[] item;
    private double amount;
    private Date date;
    private String details;
    private boolean fulfilled;

    public Fee() {
        this.recipient = new User();
        (this.item = new Media[1])[0] = new Media();
        this.amount = -6.9;
        this.date = new Date();
        this.details = "";
        this.fulfilled = false;
    }

    public Fee(final User recipient, final Media[] item, final double amount, final Date date, final String details,
            final boolean fulfilled) {
        this.recipient = recipient;
        this.item = item;
        this.amount = amount;
        this.date = date;
        this.details = details;
        this.fulfilled = fulfilled;
    }

    /**
     * 
     */
    public void pay() {
        this.fulfilled = true;
    }

    public User getRecipient() {
        return this.recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public Media[] getItem() {
        return this.item;
    }

    public void setItem(Media[] item) {
        this.item = item;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isFulfilled() {
        return this.fulfilled;
    }

    public boolean getFulfilled() {
        return this.fulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    @Override
    public String toString() {
        String items = "";
        for (int i = 0; i < this.item.length; i++) {
            items += this.item[i].toString() + ",";
        }
        items = items.substring(0, items.length() - 1);
        String fee = "Recipient: " + this.recipient + "\nItem(s): " + items + "\nAmount: " + this.amount + "\nDate: "
                + this.date + "\nDescription: " + this.details + "\nFulfilled: " + this.fulfilled;
        return fee;
    }
}
