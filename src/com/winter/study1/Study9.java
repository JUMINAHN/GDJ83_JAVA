package com.winter.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean flag = true;
		while(true) { //일반 true보다는 변수로 선언되는 게 좋음
			System.out.println("1.로그인 시도 // 2.프로그램 종료 : 옵션을 선택하세요");
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("ID를 입력하세요");
				int myId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("PW를 입력하세요");
				int myPw = sc.nextInt();
				sc.nextLine();
				if(id == myId && myPw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
					continue;
				}
			} else if(option == 2) {
				System.out.println("로그인 시도를 포기합니다.");
				sc.nextLine();
				flag = false;
				break;
			}	
		}
		
		int gold = 0;
		int level = 1;
		int mop = 3;
	
		System.out.println("게임을 시작합니다. 현재 레벨 : " + level + ", 현재 골드 : " + gold);
		while(flag) {
			System.out.println("사냥을 시작하겠습니까? // 1.예 , 2. 아니오");
			int load = sc.nextInt();	
			if(load == 1) {
				for(int i=1; i <= mop; i++) {
					System.out.println("몹 kill : " + i);
				}
				level++;
				System.out.println("레벨업!, 현재 레벨 : " + level);
				mop += 3;
				
				if(level == 5) {
					gold = 1000;
					System.out.println("레벨 달성 기념 골드 획득 : " + gold);
				} else if(level == 10) {
					gold = 2000;
					System.out.println("레벨 달성 기념 골드 획득 : " + gold);
				} else if(level == 15) {
					gold = 3000;
					System.out.println("레벨 달성 기념 골드 획득 : " + gold);
					break;
				}
			} else if(load == 2) {
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		System.out.println("현재레벨 : "  + level);
		System.out.println("현재골드 : " + gold);
	}
}
