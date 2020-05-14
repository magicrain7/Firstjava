package com.yedam.classes.abstract_class;

public class Bird extends Animal {
	public Bird(String kind) {
		super(kind);
	}

	@Override
	public void sound() { // Animal에서 상속받는 하위클래스에서는 구현해줘야된다.
		System.out.println("짹짹");
	}
}
