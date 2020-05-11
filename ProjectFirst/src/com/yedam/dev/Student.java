package com.yedam.dev;

public class Student {
	// 필드
	String name;
	int age;
	String major;

	// 생성자(인스턴스를 만드는값)는 필드값 초기화할때 사용
	public Student() { // 매개값이 없는건 디폴트 생성자

	}

	public Student(String name) { // 같은 이름 사용 가능 오버로딩
		this.name = name;

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String major) {
		this(name);
		this.age = age;
		this.major = major;
	}

	// 메소드
	void setMajor(String major) {
		this.major = major;
	}

	String getMajor() {
		return major;

	}

}
