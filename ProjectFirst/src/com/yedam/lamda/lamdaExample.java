package com.yedam.lamda;

//class MyFuncClass implements MyFunctionalInterface{
//
//	@Override
//	public void run() {
//		System.out.println("실행");
//	}
//	
//}
public class lamdaExample {
	public static void main(String[] args) {
		// 1) 매개값이 없는 인터페이스.
		MyFunctionalInterface fi = new MyFunctionalInterface() {

			// 익명구현객체
			@Override
			public void run() {
				System.out.println("실행");
			}
		};
		fi.run();

		// 간단한 람다표현식. -> run() 메소드 구현하는 부분.
		MyFunctionalInterface fi2 = () -> System.out.println("실행");
		fi2.run();

		// 2) 매개값이 있는 인터페이스.
		
//		MySumInterface si = new MySumInterface() {
//			public void sum(int num1, int num2) {
//		
		
		MySumInterface si = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("두 수의 합: " + result);
		};
		si.sum(10, 20);
		
		// 3) 반환값이 있는  매개값이 있는 인터페이스.
		MyMultiInterface mi = (num1, num2) -> { //mi에는 익명구현객체가 할당되어있음.
				return num1 * num2;
		};
		int result = mi.multi(10,15);
		System.out.println("결과값은: " + result);
		
	}
}
