package com.yedam.classes.inherit;

import java.util.Scanner;

public class AddressList {
	private Scanner scn = new Scanner(System.in);
	Friend addary1[] = new Friend[20];

	//생성자

	//메소드
	private void addList() {
		System.out.println("주소록에 입력하려는 친구 유형은?");
		System.out.println("그냥 친구 -> 1  대학친구 -> 2  회사친구 ->  3");
		System.out.println("=================================");
		System.out.println("선택> ");
		int menu = scn.nextInt();scn.nextLine();
		if (menu == 1) {//1번 주소 추가기능
			System.out.println("친구 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("친구 전화번호를 입력하세요");
			String phnum = scn.nextLine();

			Friend frd = new Friend(name, phnum);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					System.out.println(addary1[0]);
					break;
				}
			}

		} else if (menu == 2) {
			System.out.println("대학친구 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("대학친구 전화번호를 입력하세요");
			String phnum = scn.nextLine();
			System.out.println("대학친구 전공을 입력하세요");
			String major = scn.nextLine();

			UniversityFriend frd = new UniversityFriend(name, phnum, major);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					break;
				}
			}
		} else if (menu ==3 ) {
			System.out.println("회사친구 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("회사친구 전화번호를 입력하세요");
			String phnum = scn.nextLine();
			System.out.println("회사친구 부서를 입력하세요");
			String depart = scn.nextLine();

			CompanyFriend frd = new CompanyFriend(name, phnum, depart);

			for (int i = 0; i < addary1.length; i++) {
				if (addary1[i] == null) {
					addary1[i] = frd;
					break;
				}
			}
		}
	}//end of 1
	
	private void viewList() {
		
		for(int i=0; i<addary1.length;i++) {
			if(addary1[i]!=null) {
				addary1[i].showInfo();
			}
		}
	}//end of 2
	
	private void findName() {
		
		System.out.println("조회할 이름을 입력하세요");
		String name2 = scn.nextLine();
		for(int i=0; i<addary1.length; i++) {
			if((addary1[i]!=null) && addary1[i].name.equals(name2) ) {
				addary1[i].showInfo();
			}
		}
	}
	
	

	public void execute() {
		while (true) {
			System.out.println("주소록 프로그램을 실행합니다.");
			System.out.println("*************무엇을 하시겠습니까?*************");
			System.out.println("1.주소록 추가  2.주소록 리스트  3.친구 조회  4.종료");
			System.out.println("***************************************");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();//엔터값 하나 소비.
			if (menu == 1) {//1.주소 추가
				addList();
			} else if (menu == 2) {//2.주소 조회
				viewList();
			} else if (menu == 3) {//3.이름으로 보여주기
				findName();
			} else if (menu == 4) {//4.종료

				break;
			}
			

		} //end of while
		System.out.println("프로그램을 종료합니다.");
	}//end of execute

}//end of class