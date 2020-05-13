package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color);//super => CellPhone(a,b);
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	@Override//부모클래스의 메소드와 선언부가 똑같아야 함. 즉 선언부는 재정의하는 게 아님.
	void powerOn() { //void powerOn(int a){
		System.out.println("DMB 폰의 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다.");
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 방송을 수신.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경.");
	}

	void turnOffDmb() {
		System.out.println("DMB 수신을 종료.");
	}
}
