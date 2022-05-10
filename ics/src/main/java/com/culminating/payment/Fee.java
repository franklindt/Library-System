/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: fee class
*/

//packages the fee into com.culminating.payment
package com.culminating.payment;

//imports Date, Media and User
import java.util.Date;
import com.culminating.media.Media;
import com.culminating.user.User;

public class Fee {
    private User recipient; // the recipient of the fee
    private Media[] item; // the item the fee belongs to
    private double amount; // the amount of fee
    private Date date; // the date the fee is due
    private String details; // the details of the fee
    private boolean fulfilled; // whether or not the fee has been fulfilled

    /**
     * default constructor a fee: call superclass payment
     * sets recipient to new User()
     * sets item = new Media[1] to new Media()
     * sets the amount to -6.9
     * sets the date to new Date()
     * sets the details to ""
     * sets fulfilled to false
     */
    public Fee() {
        this.recipient = new User();
        (this.item = new Media[1])[0] = new Media();
        this.amount = -6.9;
        this.date = new Date();
        this.details = "";
        this.fulfilled = false;
    }

    /**
     * Constructor a fee: sets recipient, item, amount, date, details, and fulfilled
     * from parameters
     * 
     * @param recipient, the recipient of the fee
     * @param item,      the item the fee belongs to
     * @param amount,    the amount of the fee
     * @param date,      the date the fee is due
     * @param details,   the details of the fee
     * @param fulfilled, whether or not the fee is fulfilled
     */
    public Fee(User recipient, Media[] item, double amount, Date date, String details,
            boolean fulfilled) {
        this.recipient = recipient;
        this.item = item;
        this.amount = amount;
        this.date = date;
        this.details = details;
        this.fulfilled = fulfilled;
    }

    /**
     * Description:gets the recipient of the fee
     * 
     * @return recipient of the fee
     */
    public User getRecipient() {
        return recipient;
    }

    /**
     * Description: sets the recipient of the fee
     * 
     * @param recipient, the recipient of the fee
     */
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    /**
     * Description: gets the media item
     * 
     * @return Media[] item that the fee belongs to
     */
    public Media[] getItem() {
        return item;
    }

    /**
     * Description: sets the item that the fee belongs to
     * 
     * @param Media[] item, the item the fee belongs to
     */
    public void setItem(Media[] item) {
        this.item = item;
    }

    /**
     * Description: gets the fee's amount
     * 
     * @return double amount of fee
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Description: sets the amount
     * 
     * @return double amount, the amount of the fee
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Description: gets the date
     * 
     * @return Date date of the fee
     */
    public Date getDate() {
        return date;
    }

    /**
     * Description: sets the date of the fee
     * 
     * @param date, due date of the fee
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Description: gets the details of the fee
     * 
     * @return String details of the fee
     */
    public String getDetails() {
        return details;
    }

    /**
     * Description: sets the details of the fee
     * 
     * @param details of the fee
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Description: gets whether or not the fee is fulfilled
     * 
     * @return boolean fulfilled of the fee
     */
    public boolean getFulfilled() {
        return fulfilled;
    }

    /**
     * Description: sets whether or not the fee is fulfilled
     * 
     * @param fulfilled of the fee
     */
    public void setFulfilled(boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    /**
     * Description: turns fulfilled to true
     */
    public void pay() {
        this.fulfilled = true;
    }

    @Override
    /**
     * Description: prints the attributes of the fee
     */
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
