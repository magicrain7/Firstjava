package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
		if (m1.equals(m2)) {
			System.out.println("동등합니다");
		} else {
			System.out.println("다릅니다.");
		}
		System.out.println(m1.toString());
		
		if (m1 == m2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("다른개체입니다.");
		}
	}
}
