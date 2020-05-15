package com.yedam.morning;

public class code20200515 {
	public static void main(String[] args) {
		int i;
		int j;
		int k = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}
		System.out.println("===========================================");
	
		for (i = 1; i <= 5; i++) {
			for (j = 0; j <= 5; j++) {
				System.out.print(i+(j*5) + "\t");
			}
			System.out.println();
		}

	}
}