package com.yedam.generic;

public class Box<T> {
	T object;
	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
}
