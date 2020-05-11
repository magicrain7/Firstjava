package com.yedam.classes;

public class Calculator {
	String model;
	void powerOn(){ //매개값도 없고 리턴값 없음.
		System.out.println("전원을 켭니다");
	}
	int sum(int num1, int num2){ //sum은 변수 ()안에 값은 호출할때 정해짐.
		return num1 + num2;
		
	}
	double sum(double num1, double num2) { //매개변수로 받는 타입이 달라져서 sum변수를 또 사용가능.
		return num1 + num2;
	}
	void println(String str) { //매개값은 있지만 리턴값없음.
		System.out.println("결과값은: " + str);
	}
	void println(int str) {
		System.out.println("결과값은: " + str);
	}
	void println(double str) {
		System.out.println("결과값은: " + str);
	}
	double getAreaRectangle(double width, double height) {
		return width * height;
	}
	double getAreaRectangle(double width) {
		return width * width;
	}
}
