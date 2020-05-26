package com.yedam.collection.list;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
			}
		}
	}

	@Override
	public void deleteBoard(List<Board> list, String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void showBoard(List<Board> list) {
		for (Board board : list) {
			System.out.println(board.toString());
		}
	}

}
