package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB폰","흰색",10);
		//부모클래스(CellPhone)의 필드.
		System.out.println(dcp.model + ", "+ dcp.color);
		//자기클래스(DmbCellPhone)의 필드
		System.out.println(dcp.channel);
		//부모클래스의 메소드
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoices("안녕하세요");
		dcp.receiveVoices("반갑습니다.");
		//자신클래스의 메소드
		dcp.turnOnDmb();
		dcp.changeChannel(12);
		dcp.turnOffDmb();
		
		dcp.powerOff();
	}
}