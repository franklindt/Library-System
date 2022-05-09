package com.culminating.utils;

import java.util.Date;

import com.culminating.User.User;
import com.culminating.media.Media;

public class Hold extends Log {
	private boolean arrived;

	public Hold() {
		super();
		this.arrived = false;
	}

    public Hold(User user, Media item, Date date, String detail,boolean arrived) {
        super(user, item, date, detail);
        this.arrived = arrived;
    }

    public boolean getArrived() {
        return this.arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public String toString() {
        return super.toString() + "\nArrived: " + this.arrived;
    }
}