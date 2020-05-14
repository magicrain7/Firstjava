package com.yedam.classes.abstract_class;
//추상 클래스()
public abstract class Animal {
	//필드
	String kind;
	//생성자
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드(자식클래스에서 반드시 정의 해야됨)
}
