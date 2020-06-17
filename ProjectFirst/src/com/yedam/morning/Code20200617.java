package com.yedam.morning;

public class Code20200617 {
	public static void main(String[] args) {
		int size = 10;
		int temp;
		int i = 0;
		int[] aray = new int[size];
		for (i = 0; i < aray.length; i++) {
			aray[i] = (int) (Math.random() * size) + 1;
			System.out.println(i);
		}
		for (i = 0; i < aray.length; i++) {
			if (aray[i] < aray[i + 1]) {
				temp = aray[i];
				aray[i] = aray[i + 1];
				aray[i + 1] = temp;
			} else {

			}
		}
	}
}
