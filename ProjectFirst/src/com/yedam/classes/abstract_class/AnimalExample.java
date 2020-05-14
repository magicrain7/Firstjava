package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); 추상클래스는 인스턴스 생성불가.
		Animal animal = new Bird("조류"); //자식클래스의 인스턴스는 부모클래스에 형변환 가능.
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		animal = cat; // 상속관계에서는 자동형변환.
	}
}
