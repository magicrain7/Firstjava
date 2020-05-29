package com.yedam.morning;

import java.util.Scanner;

public class Code20200529 {
	public static void main(String[] args) {
		int a[] = new int[3];
		int b[] = new int[3];
		int[] intAry = new int[3];
		int num = 0;
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < intAry.length; i++) {
			a[i] = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
			System.out.println("a숫자 : " + a[i]);
		}
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.println("1~9까지 숫자입력하세요");
		for (int i = 0; i < intAry.length; i++) {
			num = scn.nextInt();
			b[i] = num;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				strike++;
			}
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j] && i != j) {
					ball++;
				}
			}

		}
		System.out.println("Strike: " + strike + "  ball :" + ball);
	}
}
