package com.yedam.classes.inherit;

public class Parent extends Object{//모든 클래스는 기본적으로 Object 클래스를 상속받고 있음.
	private String lastName;
	private String firstName;
	private String telNumber;//집전화번호
	
	protected  Parent() {
		
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public Parent(String lastName, String firstName, String telNumber) {
		super();//Object 클래스 상속.
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "lastName=" + lastName + "firstName=" + firstName;
	}
	
	
}
