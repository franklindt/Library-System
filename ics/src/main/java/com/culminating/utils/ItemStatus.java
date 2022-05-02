package com.culminating.utils;

public class ItemStatus extends Log {
	private boolean status;
    private int timees_renewed;

	public ItemStatus() {
		super();
		this.status = false;
        this.timees_renewed = -1;
	}

    public ItemStatus(User user, Media item, Date date, String detail,boolean status, int times_renewed) {
        super(user, item, date, detail);
        this.status = status;
        this.times_renewed = times_renewed;
    }

    public String toString() {
        return super.toString() + "\nArrived: " + this.arrived;
    }
}