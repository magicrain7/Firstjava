package com.yedam.generic;

public class Course<T> {
	private String name;
	private T[] students;

	Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}

	String getName() {
		return this.name;
	}

	T[] getStudents() {
		return students;
	}

	void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
