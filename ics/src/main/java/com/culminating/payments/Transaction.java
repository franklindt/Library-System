package com.culminating.payments;

import java.util.Arrays;

public class Transaction {
	private static Fee[] fees;

	public static void append(Fee fee) {
		fees = Arrays.copyOf(fees, fees.length + 1);
		fees[fees.length - 1] = fee;
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