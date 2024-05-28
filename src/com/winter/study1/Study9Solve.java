package com.winter.study1;

import java.util.Scanner;

public class Study9Solve {
	
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
		/// 로그인 검증은 끝~~~ : 구분할 수 있는 데이터를 줘야한다.
		if (flag) {
			System.out.println("게임시작");
	
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
