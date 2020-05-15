package com.yedam.interfaces;

public class Audio implements RemoteControl {
                 //implements 구현하다
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

}
