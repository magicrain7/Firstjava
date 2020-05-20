package com.yedam.exceptions;

import org.omg.CORBA.ExceptionList;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i <= intAry.length; i++) {
			try {
				intAry[i] = i + 1;
				System.out.println(intAry[i]);
				int num = Integer.parseInt(args[0]);  //문자타입의 숫자를 인트형 숫자로 바꾸는 Integer.parseInt
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
			} catch(NumberFormatException e1) {
				System.out.println("변환불가");
			} catch(Exception e2) {
				System.out.println("알수없는 오류.");
			}
		}
		System.out.println("end of program.");
	}
}
