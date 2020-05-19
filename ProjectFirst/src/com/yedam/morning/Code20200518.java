package com.yedam.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int temp = 0;
		int[] intAry = { 14, 8, 5, 3, 7, 11 };

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				if (intAry[i] < intAry[j]) {
					temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
//			if(i<=i+1) {
//				temp = intAry[i];
//				intAry[i] = intAry[i+1];
//				intAry[i+1] = temp;
//			}else if{			
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);

		}
	}
}
