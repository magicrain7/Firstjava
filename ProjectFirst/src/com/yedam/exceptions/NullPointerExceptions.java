package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "hello";
		// 예외처리
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2"); //String2를 찾아 있는지 확인
		} catch (NullPointerException e) {
			System.out.println("실행중 오류 발생.");
		} catch (Exception e) {  //최상위 예외 Exception
			System.out.println("알수없는 예외발생");
		}
		
		System.out.println("프로그램종료");
	}
}
