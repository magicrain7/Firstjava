
package com.yedam.interfaces;

public interface RemoteControl {
	//상수 final static(포함)
	public int MAX_VALUME = 0; //한번 할당되면 변경안됨
	public int MIN_VALUME = 10;
	
	//추상메소드.
	public void turnOn();
	public void turnOff();
	
	
}
