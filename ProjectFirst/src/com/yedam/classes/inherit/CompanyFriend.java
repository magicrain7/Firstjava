package com.yedam.classes.inherit;

public class CompanyFriend extends Friend {

	String depart;

	public CompanyFriend(String name, String phnum, String depart) {
		super(name, phnum);
		this.depart = depart;
		
	}

	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("부서 : "+ this.depart);
	}

	
}
