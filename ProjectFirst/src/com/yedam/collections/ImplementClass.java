package com.yedam.collections;

interface Runnable {
	public void run();
}

class Car implements Runnable {
	@Override
	public void run() {
		System.out.println("자동차 달린다");
	}
}

class Bus implements Runnable {
	@Override
	public void run() {
		System.out.println("버스 꼬우");
	}
}

public class ImplementClass {
	// 메소두 구현.
	public static void callRun(Runnable runnable) {
		runnable.run();
	}

	public static void main(String[] args) {
		Runnable runnable = new Car(); // list arraylist 관계?
		runnable.run();
		runnable = new Bus();
		runnable.run();
		runnable = () -> System.out.println("익명 객체 달립니다");
		runnable.run();

		callRun(new Car());
		callRun(() -> System.out.println("메소드 매개값 달ㄹ비니다."));
	}
};
