package com.winter.study1;

import java.util.Scanner;

public class Study9Solve2 {
	
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
			int gold = 0;
			int mon = 3;
			for(level = 1; level < 15; level++) {
				System.out.println("1. 사냥 2. 종료");
				int select = sc.nextInt();
				if(select != 2) {
					break;
				}
				if(level%5 == 0) { //5로 나눌떄 나머지가 0이라면 /이 접근 방식 기억할 것!!***
					gold = gold + (level/5)*1000; //이 접근 방식 기억할 것!!***
					System.out.println(level + "축하금 : " + (level/5)*1000 + "을 지급" );
				}
				System.out.println("현재 레벨 : " + level);
				for(int j=0;j<(level*mon);j++) {
					System.out.println((j+1) + "번째 사냥");
				}
			}
			gold = gold + 3000;
			System.out.println("최종 레벨 : " + level + "소유 골드 : " + gold);
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
