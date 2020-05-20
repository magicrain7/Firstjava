package com.yedam.exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);

		try {
			account.withdraw(2000);
		} catch (BalanceInsufficientException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("실행할 메뉴를 선택하세요.");
		}
		System.out.println("end of program");
	}
}
