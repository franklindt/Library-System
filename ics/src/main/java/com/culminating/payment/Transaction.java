/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: transaction class
*/
package com.culminating.payment;

import java.util.ArrayList;

/**
 * Represents a transaction block using Fees
 * 
 * @see Fee
 */
public class Transaction {
	/** Transactions made of a list of individual Fees */
	private ArrayList<Fee> fees;

	/**
	 * Creates a transaction with a log of Fee objects
	 * 
	 * @see Fee
	 */
	public Transaction() {
		this.fees = new ArrayList<Fee>();
	}

	/**
	 * Creates a Fee in the Transaction log
	 * 
	 * @param fee -> a Fee object
	 */
	public void createFee(Fee fee) {
		fees.add(fee);
	}

	/**
	 * Gets the transactions
	 * 
	 * @return -> a the list of Transactions
	 */
	public ArrayList<Fee> getFees() {
		return this.fees;
	}

	/**
	 * Sets the transactions of Fees
	 * 
	 * @param fees
	 */
	public void setFees(ArrayList<Fee> fees) {
		this.fees = fees;
	}

	/**
	 * @return -> string representation of this class, shows all the Fee objects in
	 *         the transaction list
	 */
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