package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		long startTime, endTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i)); // 숫자를 문자로
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList: 걸린시간 " + (endTime - startTime));

		List<String> list2 = new LinkedList<>();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i)); // 숫자를 문자로
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList: 걸린시간 " + (endTime - startTime));
	}
}
