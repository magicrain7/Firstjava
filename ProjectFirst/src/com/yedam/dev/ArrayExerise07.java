package com.yedam.dev;

public class ArrayExerise07 {

	public static void main(String[] args) {
		
		int[][] array= {{95,86}, {83,92,96},{78,83,93,87,88}};
		int sum = 0; int cnt =0;
		
		for(int i = 0 ; i < array.length; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				sum = sum + array[i][j];
				// a++;  for문 돌아갈때 a증가시켜서 몇번 반복했는지 카운트함.
			}
			cnt = cnt + array[i].length;
		}
		
		System.out.println("합계는 " + sum );
		System.out.println("평균은 " + (double)sum/cnt );
		
	}

}
