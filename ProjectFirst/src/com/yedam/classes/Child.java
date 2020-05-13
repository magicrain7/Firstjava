package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {
	Child(){
		super(); //Parent() : protected
	}///error
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber);	
	}
	
	//protected 구분.
	void showInfo() {
		Child child = new Child();
		//child.getLastName(); //default(동일안 패키지 내에서만 가능) 
		child.getFirstName(); //protected
		child.getTelNumber(); //public
	}
	
}
