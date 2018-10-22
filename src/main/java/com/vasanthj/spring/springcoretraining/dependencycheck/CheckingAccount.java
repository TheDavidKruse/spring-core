package com.vasanthj.spring.springcoretraining.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class CheckingAccount {

	private int accountNumber;
	private float minBalance;
	private String secondaryOwner;

	public int getAccountNumber() {
		return accountNumber;
	}

	@Required
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}

	public String getSecondaryOwner() {
		return secondaryOwner;
	}

	public void setSecondaryOwner(String secondaryOwner) {
		this.secondaryOwner = secondaryOwner;
	}

	@Override
	public String toString() {
		return "CheckingAccount [accountNumber=" + accountNumber + ", minBalance=" + minBalance + ", secondaryOwner="
				+ secondaryOwner + "]";
	}
}
