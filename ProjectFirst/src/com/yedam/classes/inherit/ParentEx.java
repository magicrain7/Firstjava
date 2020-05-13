package com.yedam.classes.inherit;

public class ParentEx {
	public static void main(String[] args) {
		Parent parent = new Parent("Hong", "Kildong", "111-111");
		parent.getLastName();//default
		parent.getFirstName();//protected
		parent.getTelNumber();//public
	}
}
