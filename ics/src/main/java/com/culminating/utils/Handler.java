/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: handler class
*/
package com.culminating.utils;

import com.culminating.user.User;
import com.culminating.media.Media;
import com.culminating.payment.Fee;

import java.util.Date;
import java.util.ArrayList;

public class Handler {

    /**
     * currHolds in system
     */
    private ArrayList<Hold> currHolds;
    
    /**
     * fines in system
     */
    private ArrayList<Fee> fines;
    
    /**
     * itemStates in system
     */
    private ArrayList<ItemStatus> itemStates;
    
    /**
     * users in system
     */
    private ArrayList<User> users;

    /**
     * Default Constructor of Handler, Initializes the attributes currHolds, fines, itemStates and users    
     */
    public Handler() {
        this.currHolds = new ArrayList<Hold>();
        this.fines = new ArrayList<Fee>();
        this.itemStates = new ArrayList<ItemStatus>();
        this.users = new ArrayList<User>();
    }

    /**
     * Constructor of Handler
     * @param currHolds, currHolds in system
     * @param fines, fines in system
     * @param itemStates, itemStates in system
     * @param users, users in system
     */
    public Handler(ArrayList<Hold> currHolds, ArrayList<Fee> fines, ArrayList<ItemStatus> itemStates, ArrayList<User> users) {
        this.currHolds = currHolds;
        this.fines = fines;
        this.itemStates = itemStates;
        this.users = users;
    }
    
    public static void main (String [] args) { 
        //testing this class code here
    }

    /**
     * Find media in itemStates
     * @param media, media to find
     * @return i or -1
     */
    private int searchItemStates(Media media) {
        for (int i = 0; i < this.itemStates.size(); i++) {
            //find the media item from itemStates by compare the sin
            if (this.itemStates.get(i).getItem().getSIN() == media.getSIN()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Add hold media in system
     * @param date, the hold time
     * @param media, the hold media
     * @param user, the user which hold the media
     */
    public void addHold(Date date, Media media, User user) {
        currHolds.add(new Hold(user, media, date, "hold", false));
    }

    /**
     * Pay fee in system
     * @param fee, the fee need to be paid
     */
    public void payPenalty(Fee fee) {
        for (int i = 0; i < fines.size(); i++) {
            //find the fee in fines by compare the name
            if (this.fines.get(i).getRecipient().getName().equals(fee.getRecipient().getName())) {
                this.fines.get(i).pay();
                this.fines.remove(i);
                break;
            }
        }
    }

    /**
     * renew media in system
     * @param user, the user need to be renewed
     * @param media, the media need to be renewed
     */
    public void renew(User user, Media media) {
        int index = searchItemStates(media);
        if (index == -1 || !itemStates.get(index).getUser().getName().equals(user.getName())) {
            return;
        }
        this.itemStates.get(index).renew(user);
    }

    /**
     * checkOut media from system
     * @param user, the user need to borrow media
     * @param media, the media need to be borrowed
     */
    public void checkOut(User user, Media media) {
        int index = searchItemStates(media);
        if (index == -1 || !this.itemStates.get(index).getStatus()) {
            return;
        }
        this.itemStates.get(index).checkOut(user, new Date());
    }

    /**
     * checkin media to system
     * @param user, the user need to checkin media
     * @param media, the media need to be checkin
     */
    public void checkIn(User user, Media media) {
        int index = searchItemStates(media);
        if (index == -1) {
            return;
        }
        this.itemStates.get(index).checkIn(user, new Date());
    }
    
    /**
     * Find user in system
     * @param user, the user need to be found
     * @return  -1 if doesn't find; index in users if find.
     */
    private int searchUser(User user) {
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getName().equals(user.getName())) {
                return i;
            }
        }
        return -1;
    }
   
    /**
     * Add media in system
     * @param media, the media need to be added in system
     * @return  true if succeed; false if already exist.
     */
    public boolean addMedia(Media media) {
        boolean succeed = true;
        int index = searchItemStates(media);
        if (index == -1) {
            ItemStatus item = new ItemStatus(new User(), media, new Date(), "", true, -1);
            this.itemStates.add(item);
        } else {
            succeed = false;
        }
        return succeed;
   }
   
    /**
     * Add user in system
     * @param user, the user need to be added in system
     * @return  true if succeed; false if already exist.
     */
   public boolean addUser(User user) {
       boolean succeed = true;
       int index = searchUser(user);
       if (index == -1) {
          this.users.add(user);
       } else {
           succeed = false;
       }
       return succeed;
   }
   
   /**
    * Remove user from system
    * @param user, the user need to be removed from system
    * @return  true if succeed; false if doesn't exist.
    */
   public boolean removeUser(User user) {
       boolean succeed = true;
       int index = searchUser(user);
       if (index == -1) {
           succeed = false;
       } else {
           this.users.remove(index);
       }
       return succeed;
   }

   /**
    * Description: Gets the currHolds
    * @return the currHolds
    */
   public ArrayList<Hold> getCurrHolds() {
       return currHolds;
   }

   /**
    * Description: Sets currHolds
    * @param currHolds, the currHolds
    */
   public void setCurrHolds(ArrayList<Hold> currHolds) {
       this.currHolds = currHolds;
   }

   /**
    * Description: Gets the fines
    * @return the fines
    */
   public ArrayList<Fee> getFines() {
       return fines;
   }

   /**
    * Description: Sets fines
    * @param fines, the fines
    */
   public void setFines(ArrayList<Fee> fines) {
       this.fines = fines;
   }

   /**
    * Description: Gets the itemStates
    * @return the itemStates
    */
   public ArrayList<ItemStatus> getItemStates() {
       return itemStates;
   }

   /**
    * Description: Sets itemStates
    * @param itemStates, the itemStates
    */
   public void setItemStates(ArrayList<ItemStatus> itemStates) {
       this.itemStates = itemStates;
   }
   
   /**
    * Returns description of the handler.
    *
    * @return  description of the handler.
    */
   public String toString() {
       return "This is the handler class to handle the actions";
   }
} 
