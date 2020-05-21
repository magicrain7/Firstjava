package com.yedam.generic;
class Apple{
	
}
class Orange{
	
}
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		Orange orange = orangeBox.get();
	}
}
