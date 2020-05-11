package com.yedam.classes;

public class CarExample {
	public static void main(String[] args) {
		
		//필드는 생성자의 값을 초기화할때 사용한다.
		Car c1 = new Car();
		c1.model = "Sonata";
		System.out.println(c1.maxSpeed);
		
		Car c2 = new Car(200);
		c2.model = "BMW";
		
		Car c3 = new Car("Benz");
		c3.maxSpeed = 300;
		
		Car c4 = new Car("Accent", 200);
		
	}
}
