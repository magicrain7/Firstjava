package com.yedam.dev;

class Student1{
	String name;
}

public class StringEqualExample {

	public static void main(String[] args) {
		Student1 st1 = new Student1();
		Student1 st2 = new Student1();
		st1.name = "Hong";
		st2.name = "partk";
		
		System.out.println(st1);
		System.out.println(st2);
		
		String str1 = "Hello";//new String("Hello");
		String str2 = "Hello";
		
		if(str1 == str2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다");
		}
	}

}
