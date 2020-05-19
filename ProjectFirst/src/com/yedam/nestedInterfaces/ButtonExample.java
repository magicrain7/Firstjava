package com.yedam.nestedInterfaces;
class CallListener implements Button.OnClickListener{  // Button.OnClickListener 클래스에 소속되어있는 인터페이스

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}
	
}
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		CallListener cListener = new CallListener();
		btn.setOnClickListener(cListener);
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
	}
}