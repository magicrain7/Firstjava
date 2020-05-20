package com.yedam.exceptions;

public class Account {
	private long balance;
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 " + (money - balance) + " 부족");
		}
		this.balance -= money;
	}
}
