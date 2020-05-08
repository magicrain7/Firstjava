package com.yedam.classes;

public class people {
	String city;
	int age;
	int foot;
	String name;
	int people[];
	
	void tour() {
		System.out.println("여행합니다.");
	}
	void study(String stud) {
		System.out.println(stud + "공부합니다" );
	}
	void showInfo() {
		System.out.println(" " + city + " " + age + " " + foot);
	}
}
