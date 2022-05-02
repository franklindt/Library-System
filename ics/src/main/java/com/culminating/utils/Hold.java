package com.culminating.utils;

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

    public String toString() {
        return super.toString() + "\nArrived: " + this.arrived;
    }
}