package com.culminating.payment;

import java.util.Arrays;

public class Transaction {
	private static Fee[] fees;

	public Transaction() {
		Transaction.fees = new Fee[1];
	}

	public static void append(final Fee fee) {
		(Transaction.fees = Arrays.copyOf(Transaction.fees, Transaction.fees.length + 1))[Transaction.fees.length
				- 1] = fee;
	}

	@Override
	public String toString() {
		String allFees = "";
		String raw_block = "";
		for (int i = 0; i < fees.length; i++) {
			raw_block = fees[i].toString().replace("\n", "");
		}
		allFees += raw_block + "\n";
		return allFees;
	}
}