package com.culminating.payments;

import java.util.Date;
import com.culminating.media.Media;
import com.culminating.user.User;

public class Fee {

	private User recipient;
	private Media[] item;
	private double amount;
	private Date date;
	private String details;
	private boolean fulfilled;
   
   public Fee() {
      this.recipient = new User();
      this.item = new Media[1];
      this.item[0] = new Media();
      this.amount = -6.9;
      this.date = new Date();
      this.details = "";
      this.fulfilled = false;
   }

	public Fee(User recipient, Media[] item, double amount, Date date, String details, boolean fulfilled) {
		this.recipient = recipient;
		this.item = item;
		this.amount = amount;
		this.date = date;
		this.details = details;
		this.fulfilled = fulfilled;
	}

	public void pay() {
		this.fulfilled = true;
	}

	@Override
	public String toString() {
      String items = "";
      for (int i = 0; i < this.item.length; i++) {
         items += item[i].toString() + ",";
      }
      items = items.substring(0,items.length()-1);
		String fee = "Recipient: " + this.recipient.toString() + "\nItem(s): " + items + "\nAmount: " + this.amount
				+ "\nDate: " + this.date + "\nDescription: " + this.details + "\nPaid: " + this.fulfilled;
		return fee;
	}
}