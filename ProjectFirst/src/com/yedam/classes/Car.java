package com.yedam.classes;

public class Car {
	String model;
	int maxSpeed;
	public Car() { //생성자 (필드값을 받아서 항상 초기화 할 필요는 없다)
		maxSpeed = 100;
	} 
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	//매소드 선언
	void showInfo() {
		System.out.println("모델명: " + model + ", 최고속도: " + maxSpeed);
	}
	
}
