package com.yedam.classes;
import com.yedam.classes.inherit.Parent;


public class ParentEx {
	public static void main(String[] args) {
		
		Parent parent = new Parent("","","");
		//parent.getLastName();//default-타 패키지에서 사용불가능
		//parent.getFirstName();//protected-타 패키지&&자식 아니면 사용 불가능
		parent.getTelNumber();//public
	}
}
