package com.yedam.collection.list;


import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2 {
	List<Board> list = new ArrayList<>();
	
	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
			}
		}
	}

	@Override
	public void deleteBoard(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void showBoard() {
		for (Board board : list) {
			System.out.println(board.toString());
		}
	}

}