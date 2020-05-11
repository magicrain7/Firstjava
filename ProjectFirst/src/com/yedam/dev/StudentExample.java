package com.yedam.dev;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Hong";
		s1.age = 20;
		s1.major = "English";

//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.major);

		Student s2 = new Student("Park");
//		s2.name= "Park";
		s2.age = 22;
		s2.major = "History";

		Student s3 = new Student("Choi", 25);
		s3.name = "Choi";
		s3.age = 25;
		s3.major = "Math";

		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = new Student();
		students[2] = s2;
		students[3] = s3;
		students[4] = s3;

		for (Student s : students) {
			System.out.println(s.name);
		}

	}

}
