package com.culminating.utils;

import com.culminating.User.User;
import com.culminating.media.Media;
import com.culminating.payment.Fee;

import java.util.Date;
import java.util.ArrayList;

public class Handler {

	private ArrayList<Hold> currHolds;
	private ArrayList<Fee> fines;
	private ArrayList<ItemStatus> itemStates;

	public Handler() {
		this.currHolds = new ArrayList<Hold>();
		this.fines = new ArrayList<Fee>();
		this.itemStates = new ArrayList<ItemStatus>();
	}

	public Handler(ArrayList<Hold> currHolds, ArrayList<Fee> fines, ArrayList<ItemStatus> itemStates) {
		this.currHolds = currHolds;
		this.fines = fines;
		this.itemStates = itemStates;
	}


	private int searchItemStates(Media media) {
		for (int i = 0; i < this.itemStates.size(); i++) {
			if (this.itemStates.get(i).getItem().getSIN() == media.getSIN()) {
				return i;
			}
		}
		return -1;
	}


	public void addHold(Date date, Media media, User user) {
		currHolds.add(new Hold(user, media, date, "hold", false));
	}

	public void payPenalty(Fee fee) {
		for (int i = 0; i < fines.size(); i++) {
			if (this.fines.get(i) == fee) {
				this.fines.get(i).pay();
				this.fines.remove(i);
				return;
			}
		}
	}

	public void renew(User user, Media media) {
		int index = searchItemStates(media);
		if (index == -1 || itemStates.get(index).getUser().getName() != user.getName()) {return;}
		this.itemStates.get(index).renew(user);
	}

	public void checkOut(User user, Media media) {
		int index = searchItemStates(media);
		if (index == -1 || !this.itemStates.get(index).getStatus()) {return;}
		this.itemStates.get(index).checkOut(user, new Date());
	}

	public void checkIn(User user, Media media) {
		int index = searchItemStates(media);
		if (index == -1) {return;}
		this.itemStates.get(index).checkIn(user, new Date());
	}
}
