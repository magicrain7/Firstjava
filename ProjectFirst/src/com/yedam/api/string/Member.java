package com.yedam.api.string;

public class Member implements Comparable<Member> { //제네릭타입의 인터페이스
	String name;
	Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	
	
}
