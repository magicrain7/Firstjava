package com.yedam.dev;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; // 크기는 사용자가 학생 수 입력 받으면 정해짐.
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.학생점수 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");

			int selectNo = scn.nextInt(); 
			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = scn.nextInt(); // studentNum < 배열을 크기를 정함
				scores = new int[studentNum]; // new int[5];
				System.out.println("배열이 생성되었습니다.");
			} else if (selectNo == 2) {
				int i = 0;
				for (int score : scores) {
					System.out.println("점수를 입력하세요.");
					score = scn.nextInt();
					scores[i++] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + (i+1) + "] : " + scores[i]); //i+1 1번째 학생
				}

			} else if (selectNo == 4) {
				// 합계,평균
				int sum = 0;
				int i = 0;
				int MaxValue = Integer.MIN_VALUE;
				// int cnt = 0 ;
				for (int score : scores) {
//					if(score >= MaxValue) {            왜 최대값이 안나오지 ㅠ
//						MaxValue = scores[i];
//						
//					}
					sum = sum + score;
					// cnt++;
				}
				double avg = (double) sum / scores.length; // (double)sum / cnt;
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + avg);
				//System.out.println("최고점수는 : " + MaxValue);
			} else if (selectNo == 5) {
				run = false;
			} // end of if
			System.out.println("프로그램 종료");
		} // end of while

	}// end of main()
} // end of class
