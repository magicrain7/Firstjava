package com.yedam.collections;

interface Runnable<T> {
	public void run(T t);
}

class Car implements Runnable<String> {
	@Override
	public void run(String str) {
		System.out.println("자동차 달린다");
	}
}

class Bus implements Runnable<String> {
	@Override
	public void run(String intVal) {
		System.out.println("버스 꼬우");
	}
}

public class ImplementClassTwo {
	// 메소두 구현.
	public static void callRun(Runnable<String> runnable) {
		runnable.run("Hello");
	}

	public static void main(String[] args) {
		Runnable<String> runnable = new Car(); // list arraylist 관계?
		runnable.run("Car");
		runnable = new Bus();
		runnable.run("Bus");
		runnable = (str) -> System.out.println("익명 객체 달립니다");
		runnable.run("Run");

		callRun(new Car());
		callRun((str) -> System.out.println("메소드 매개값 달립니다."));
	}
};
