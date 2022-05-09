package com.culminating.payment;

import java.util.ArrayList;

public class Transaction {
	private ArrayList<Fee> fees;

	public Transaction() {
		this.fees = new ArrayList<Fee>();
	}

	public void createFee(Fee fee) {
		fees.add(fee);
	}

	public ArrayList<Fee> getFees() {
		return this.fees;
	}

	public void setFees(ArrayList<Fee> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		String allFees = "";
		String raw_block = "";
		for (int i = 0; i < fees.size(); i++) {
			raw_block = fees.get(i).toString().replace("\n", "");
		}
		allFees += raw_block + "\n";
		return allFees;
	}
}