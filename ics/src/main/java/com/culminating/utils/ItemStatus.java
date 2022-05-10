/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: ItemStatus class
*/

//packages ItemStatus in com.culminating.util
package com.culminating.utils;

//imports date
import java.util.Date;

//imports com.culminating.user.User and com.culminating.media.Media
import com.culminating.user.User;
import com.culminating.media.Media;

public class ItemStatus extends Log {
    private boolean status; //the status of the item
    private int times_renewed; //the number of times the item has been renewed

   /**
   *Default constructor a itemStatus: call superclass log
   *sets status to false
   *sets times renewed to -1
   */
    public ItemStatus() {
	super();
	this.status = false;
        this.times_renewed = -1;
    }

    /**
    *Constructor a itemStatus: sets user, item, date, detail, status and times_renewed from parameters
    *@param user, the user of the item status
    *@param item, the item of the item status
    *@param date, the date of the item status
    *@param detail, the details of the item status
    *@param status, the status of the item status
    *@param times_renewed, the number of times renewed of the item status
    */
    public ItemStatus(User user, Media item, Date date, String detail,boolean status, int times_renewed) {
        super(user, item, date, detail);
        this.status = status;
        this.times_renewed = times_renewed;
    }
   
    /**
    *Description: checks if the item can be renewed, if it can be renewed, it will be renewed
    *@param user, the user of the item status
    */
    public void renew(User user) {
        if (this.status == true) {return;}
        if (getUser().getName() != user.getName()) {return;}
        this.times_renewed++;
    }

    /**
    *Description: checks if the item could be checked out, and if it can be checked out, it will be checked out
    *@param user, the user of the item status
    *@param date, the date of the item status
    */
    public void checkOut(User user, Date date) {
        if (this.status == false) {return;}
        setUser(user);
        setDate(date);
        this.status = false;
    }

    /**
    *Description: checks in the item
    *@param user, the user of the item status
    *@param date, the date of the item status
    */
    public void checkIn(User user,Date date) {
        if (this.status == false && getUser().getName() == user.getName()) {
            this.status = true;
            setUser(new User());
            setDate(new Date());
        }
    }

    /**
    *Description:gets the status of the itemStatus
    *@return boolean status of the item status
    */
    public boolean getStatus() {
        return this.status;
    }

    /**
    *Description: sets the status of the item status
    *@param status, the status of the item status
    */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
    *Description: gets the timeRenewed of the item status
    *@return int times_renewed of the item status
    */
    public int getTimesRenewed() {
        return this.times_renewed;
    }

    /**
    *Description: sets the times renewed of the item status
    *@param times_renewed of the item status
    */
    public void setTimesRenewed(int times_renewed) {
        this.times_renewed = times_renewed;
    }

    /**
    *Description: prints all the attributes of the item status
    */
    public String toString() {
        return super.toString() + "\nAvailable: " + this.status + "\nRenews: " + this.times_renewed;
    }
}
