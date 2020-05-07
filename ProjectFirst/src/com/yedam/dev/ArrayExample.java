package com.yedam.dev;

public class ArrayExample {

	public static void main(String[] args) {
		int sum = 0;
		int[] intAry = new int[5]; //크기 정함
		
		intAry[0] = 10;
		intAry[1] = 15;
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;
//		intAry[5] = 35; 오류발생, 배열범위 초과.
		
		int[] intAry2 = {1,2,3,4,5};
		int[] intAry3 = new int[10];
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		//sum 변수에 intAry에 들어가잇는 각각의 합.
//		int sum = intAry[0] + intAry[1] + intAry[2]  + intAry[3] + intAry[4];
//		System.out.println(sum);
		
		sum=0;
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("합은 :" + sum);
		
		
		//문제 5,10,15,....50
		for(int i= 0; i<10 ; i++) {
			intAry3[i] = 5 * (i + 1);

			
		}
		//출력
		for(int i = 0; i < intAry3.length; i++) {
		System.out.println(intAry3[i]);
		
		}
	}
}
