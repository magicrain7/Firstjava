package com.yedam.collection.list;

public interface BoardService2 {
	abstract void insertBoard(Board board);//입력
	void updateBoard(Board board);//수정
	void deleteBoard(String title);//삭제
	void showBoard();//리스트
}