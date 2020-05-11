package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student(); // new는 인스턴스를 만드는거
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 179.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");
		System.out.println("이름은: " + stu.name + ", 나이는: " + stu.age);

		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 154.4;
		stu1.weight = 40.5;
		stu.eat("사과");
		System.out.println("이름은: " + stu1.name + ", 나이는: " + stu1.age);

		people stu2 = new people();
		stu2.city = "Daegu";
		stu2.age = 30;
		stu2.foot = 260;

		stu2.study("Java");
		System.out.println("지역은: " + stu2.city + ", 나이는: " + stu2.age);

		Student stu3 = new Student("choi");
		stu3.age = 55;
		stu3.height = 169.4;
		stu3.weight = 70.5;
		System.out.println("이름은: " + stu3.name + ", 나이는: " + stu3.age);
		stu.eat("수박");

		int[] intary = new int[5];
		intary[0] = 10;
		Student[] s1 = new Student[3]; // Student 라는 데이터타입을 새로 생성.
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu3;

		String inputStr = "choi";
		// Hong , Park, Choi

		for (Student stud : s1) {
			if (stud.name.equals("choi")) {
				System.out.println();

				System.out.println(stud.name + "/ " + stud.age);
			}
		}
	}
}
