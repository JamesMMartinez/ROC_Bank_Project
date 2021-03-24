package com.bankapp.transaction.service.impl;

public class TransactionValidations {
	
	public static boolean isValidAccountNumber(int accountNumber) {
		if (accountNumber > 700000001 && accountNumber < 999999999) {
			return true;
		} else {
			return false;
		}

	}
	
	
	public static boolean isValidAccountId(int accountId) {
		if (accountId < 2000 && accountId > 100 && accountId%10 == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidAmount(int amount) {
		if (amount <= 0) {
			return false;
		} else {
			return true;
		}

	}

}
