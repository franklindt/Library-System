/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: hold class
*/

//packages hold into com.culminating.utils
package com.culminating.utils;

//imports Date
import java.util.Date;

//imports com.culminating.user.User and com.culminating.media.Media
import com.culminating.user.User;
import com.culminating.media.Media;

public class Hold extends Log {
    private boolean arrived; //whether or not the holded media arrived

   /**
   *Default constructor a hold: call superclass utils
   *sets arrived to false
   */
    public Hold() {
	super();
	this.arrived = false;
   }

    /**
    *Constructor a hold: sets arrived, user, date, and detail from parameters
    *@param user, the user of the hold
    *@param item, the item that is being holded
    *@param date, the date of the hold
    *@param detail, the details of the hold
    *@param arrived, whether or not the hold arrived
    */
    public Hold(User user, Media item, Date date, String detail,boolean arrived) {
        super(user, item, date, detail);
        this.arrived = arrived;
    }
   
    /**
    *Description:gets whether or not the hold arrived
    *@return boolean arrived of the hold
    */
    public boolean getArrived() {
        return this.arrived;
    }

    /**
    *Description:sets whether or not the hold arrived
    *@param arrived, whether or not the hold arrived
    */
    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    /**
    *Description: prints all the attributes of hold
    */
    public String toString() {
        return super.toString() + "\nArrived: " + this.arrived;
    }
}
