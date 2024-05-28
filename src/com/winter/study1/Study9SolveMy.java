package com.winter.study1;

import java.util.Scanner;

public class Study9SolveMy {
	
	public static void main(String[] args) {
		//로그인 검증
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean flag = true; //while문 돌릴려고!!
		while(flag) {
			System.out.println("1. 로그인 2. 종료");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("ID 입력");
				int yId = sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("종료");
				flag = false;
			}
		}
		//for문으로 접근*****
		/// 로그인 검증은 끝~~~ : 구분할 수 있는 데이터를 줘야한다.
		if (flag) {
			System.out.println("게임시작");
			int level = 1;
			int mop = 3;
			int gold = 0;
			for(level = 1; level < 15; level++) {
				System.out.println("현재 레벨 : " + level);
				System.out.println("게임을 시작하겠습니까? // 1.시작 2. 종료");
				int option = sc.nextInt();
				if (option == 2) {
					break;
				}
				for(int i=1; i <= mop ;i++) {
					System.out.println("몹 킬 : " + i + "마리");
				}
				if(level == 5) {
					gold = 1000;
					System.out.println("gold 획득! : " + gold);
				} else if (level == 10) {
					gold = 2000;
					System.out.println("gold 획득! : " + gold);
				}
				mop += 3;
			}
			gold = 3000;
			System.out.println("gold 획득! : " + gold);
			System.out.println("최종 레벨 : " + level);
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
