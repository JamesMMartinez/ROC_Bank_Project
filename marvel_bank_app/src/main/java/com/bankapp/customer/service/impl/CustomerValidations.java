package com.bankapp.customer.service.impl;

public class CustomerValidations { //validations complete but not tested
	
	public static boolean isValidEmail(String email) {
		if (email != null && email.contains("@")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidCustPassword(String password) {
		if (password != null && password.matches("{8,25}") && password.contains("[0-9a-zA-Z]")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidCustFirstname(String firstname) {
		if (firstname != null && firstname.matches("[a-zA-Z]{3,15}")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidCustLastname(String lastname) {
		if (lastname != null && lastname.matches("[a-zA-Z]{3,25}")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidAddress(String address) {
		if (address != null && address.matches("[0-9a-zA-z]{3,40}")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidCustNumber(String number) {
		if (number != null && number.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isValidAccountId(int accountId) {
		if (accountId < 2000 && accountId > 100 && accountId%10 == 0) {
			return false;
		} else {
			return true;
		}

	}
	

}
