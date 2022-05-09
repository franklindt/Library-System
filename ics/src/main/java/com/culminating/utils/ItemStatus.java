package com.culminating.utils;

import java.util.Date;

import com.culminating.user.User;
import com.culminating.media.Media;

public class ItemStatus extends Log {
    private boolean status;
    private int times_renewed;

    public ItemStatus() {
        super();
        this.status = false;
        this.times_renewed = -1;
    }

    public ItemStatus(User user, Media item, Date date, String detail, boolean status, int times_renewed) {
        super(user, item, date, detail);
        this.status = status;
        this.times_renewed = times_renewed;
    }

    public void renew(User user) {
        if (this.status == true) {
            return;
        }
        if (getUser().getName() != user.getName()) {
            return;
        }
        this.times_renewed++;
    }

    public void checkOut(User user, Date date) {
        if (this.status == false) {
            return;
        }
        setUser(user);
        setDate(date);
        this.status = false;
    }

    public void checkIn(User user, Date date) {
        if (this.status == false && getUser().getName() == user.getName()) {
            this.status = true;
            setUser(new User());
            setDate(new Date());
        }
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTimesRenewed() {
        return this.times_renewed;
    }

    public void setTimesRenewed(int times_renewed) {
        this.times_renewed = times_renewed;
    }

    public String toString() {
        return super.toString() + "\nAvailable: " + this.status + "\nRenews: " + this.times_renewed;
    }
}