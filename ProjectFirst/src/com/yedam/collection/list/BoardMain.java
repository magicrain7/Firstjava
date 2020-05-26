package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceImpl();
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.추가 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {
				System.out.print("제목입력:");
				String title = scn.nextLine();
				System.out.print("내용입력:");
				String content = scn.nextLine();
				System.out.print("작성자입력:");
				String writer = scn.nextLine();
				Board board = new Board(title, content, writer);
				service.insertBoard(list, board);
				
			} else if(menu==2) {
				System.out.print("제목입력:");
				String title = scn.nextLine();
				System.out.print("변경내용입력:");
				String content = scn.nextLine();
				Board board = new Board(title, content, null);
				service.updateBoard(list, board);
				
			} else if(menu==3) {
				System.out.print("제목입력:");
				String title = scn.nextLine();
				service.deleteBoard(list, title);
				
			} else if(menu==4) {
				service.showBoard(list);
				
			} else if(menu==5) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
