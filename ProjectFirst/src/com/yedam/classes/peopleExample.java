package com.yedam.classes;

public class peopleExample {
	public static void main(String[] args) {
		people p = new people();
		p.name = "Lee";
		p.age = 10;
		p.foot = 260;
		System.out.println("이름은: " + p.name + ", 나이는: " + p.age + "발사이즈는 : " + p.foot);

		people p1 = new people();
		p1.name = "ee";
		p1.age = 10;
		p1.foot = 260;
		System.out.println("이름은: " + p1.name + ", 나이는: " + p1.age + "발사이즈는 : " + p1.foot);
		
		people p2 = new people();
		p2.name = "e";
		p2.age = 10;
		p2.foot = 260;
		System.out.println("이름은: " + p2.name + ", 나이는: " + p2.age + "  신발사이즈는 : " + p2.foot);
		
		people[] pp = new people[3];
		pp[0] = p;
		pp[1] = p1;
		pp[2] = p2;
		for (people ppp : pp) {
			System.out.println(ppp.name + "/ " + ppp.age);
		}
	}
}
