package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
		System.out.println(getLargeValue1(40, 20, 15));

		System.out.println(getLargeValue(new int[] { 3, 6, 2, 8, 70 }));

		String result = getString("Hello", "world");
		System.out.println(result);

		String[] ary = { "Lee", "kim", "park", "choi", "han" };

		System.out.println(getString(ary));

		int[][] intAry3 = new int[3][3];
		intAry3[0] = new int[] { 1, 2, 3 };  //2차원 배열 new int 배열타입 지정, 힙영역에 인스턴스를 만들겠다.
		intAry3[1] = new int[] { 4, 5, 6 };
		intAry3[2] = new int[] { 7, 8, 9 };

		intAry3[0][0] = 1;
		intAry3[0][1] = 2;
		intAry3[0][2] = 3;

		for (int i = 0; i < intAry3.length; i++) {
			for (int j = 0; j < intAry3[i].length; j++) {
				System.out.print(intAry3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

	public static String getString(String[] strAry) {
		String result = "";
		for (int i = 0; i < strAry.length; i++) {
			result = result + strAry[i] + " - ";

		}

		return result;

	}

	public static String getString(String str1, String str2) {
		String result = str1 + " - " + str2;
		return result;
	}

	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < ary.length; i++) {
			maxValue = Integer.MIN_VALUE;
			if (ary[i] >= maxValue) {
				maxValue = ary[i];
			}

		}
		return maxValue;
	}

	public static int getLargeValue1(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue) {
			maxValue = a;
		}
		if (b >= maxValue) {
			maxValue = b;
		}
		if (c >= maxValue) {
			maxValue = c;
		}
		return maxValue;

	}

}
