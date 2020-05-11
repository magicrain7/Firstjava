package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
		//new Calculator();
		Calculator c1 = new Calculator();
		c1.pi = 2.2;
		
		Calculator.pi = 3.14;
		Calculator.sum(45, 45);
	}
}
