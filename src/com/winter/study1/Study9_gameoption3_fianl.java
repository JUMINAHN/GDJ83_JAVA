package com.winter.study1;

import java.util.Scanner;

public class Study9_gameoption3_fianl {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int gold = 0;
		int level = 1;
		int mop = 3;
		System.out.println("게임을 시작합니다. 현재 레벨 : " + level + ", 현재 골드 : " + gold);
		while(true) {
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
				} else if(level == 10) {
					gold = 2000;
				} else if(level == 15) {
					gold = 3000;
					break;
				}
			} else if(load == 2) {
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		System.out.println("현재레벨 : "  + level);
		System.out.println("현재골드 : " + gold);

		//j * gold 


		 
		//14 -> 15 : 42마리 (3의배수)
		//레벨업할때 축하금으로 --> 레벨 바뀌면 
		//5레벨 달성시 1000G, 10레벨 2000G
		//만렙달성시 3000G -> 10의배수
		
		//만렙달성시 프로그램을 종료한다. -> 현레벨, 현골드 출력 
		//(레벨업 하기전에 사냥할거냐 종료할거냐 물어보기)
	}
}
