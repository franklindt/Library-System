package com.culminating.payments;

import java.util.Date;
import com.culminating.media;
import com.culminating.user;

public class Fee {

	private User recipient;
	private Media[] item;
	private double amount;
	private Date date;
	private String details;
	private boolean fulfilled;

	public Fee(User recipient, Media[] item, double amount, Date date, String details, boolean fulfilled) {
		this.recipient = recipient;
		this.item = item;
		this.amount = amount;
		this.date = date;
		this.details = details;
		this.fulfilled = fulfilled;
	}

	public static void pay() {
		this.fulfilled = true;
	}

	public static String toString() {
		String fee = "Recipient: " + this.recipient + "\nItem(s): " + this.item +  "\nAmount: " + this.amount + "\nDate: " + this.date + "\nDescription: " + this.details + "\nPaid: " + this.fulfilled;
	}
}