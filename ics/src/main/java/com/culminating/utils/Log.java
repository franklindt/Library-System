/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Log class
*/

//packages log into com.culminating.utils
package com.culminating.utils;

//imports Date
import java.util.Date;

//imports com.culminating.media.Media and com.culminating.user.User
import com.culminating.media.Media;
import com.culminating.user.User;

public class Log {
    private User user; //the user of the log
    private Media item; //the item in the log
    private Date date; //the date of the log
    private String detail; //the details of the log

    /**
    *Default constructor a log:
    *sets user to User()
    *sets item to Media()
    *sets date to Date()
    *sets detail to  ""
    */
    public Log() {
        this.user = new User();
        this.item = new Media();
        this.date = new Date();
        this.detail = "";
    }

    /**
    *Constructor a log: sets user, item, date, and detail from parameters
    *@param user, the user of the log
    *@param item, the item in the log
    *@param date, the date of the log
    *@param detail, the details in the log
    */
    public Log(User user, Media item, Date date, String detail) {
        this.user = user;
        this.item = item;
        this.date = date;
        this.detail = detail;
    }

    /**
    *Description: gets the user of the log
    *@return User user of the log
    */
    public User getUser() {
        return this.user;
    }

    /**
    *Description: sets the user of the log
    *@param user, the user of the log
    */
    public void setUser(User user) {
        this.user = user;
    }

    /**
    *Description: gets the media in the log
    *@return Media item of the log
    */
    public Media getItem() {
        return this.item;
    }

    /**
    *Description: sets the item in the log
    *@param item, the item in the log
    */
    public void setItem(Media item) {
        this.item = item;
    }

    /**
    *Description: gets the date of the log
    *@return Date date of the log
    */
    public Date getDate() {
        return this.date;
    }

    /**
    *Description: sets the date of the log
    *@param date, the date of the log 
    */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
    *Description: gets the detail of the Log
    *@return String detail of the log
    */
    public String getDetail() {
        return this.detail;
    }

    /**
    *Description: sets the detail of the log
    *@param detail, the details in the log
    */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
    *Description: prints all attributes of log
    */
    public String toString() {
        return "User: " + this.user.toString() + "\nItem: " + this.item.toString() + "\nDate: " + this.date
                + "\nDescription: " + this.detail;
    }

}
