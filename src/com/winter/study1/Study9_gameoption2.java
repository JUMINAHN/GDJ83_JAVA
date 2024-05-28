package com.winter.study1;

import java.util.Scanner;

public class Study9_gameoption2 {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int mop = 3;
		int gold = 0;
		int maxLevel = 15;
		int level = 1;
		
		System.out.println("게임을 시작합니다. 현재 레벨 : " + level + ", 현재 골드 : " + gold);
		for (int i=1; i <= maxLevel ;i++) {
			
			for(int j=1; j <= (mop*j) ;j++) { //3*j
				System.out.println(j + "마리 사냥");
				if(mop*j == j) {
					System.out.println("레벨업!");
					break;
				}
			}
			if (i ==5) {
				gold = 1000;
				System.out.println("축하합니다. 골드를 제공합니다 : " + gold * 1);
			} else if(i == 10) {
				gold = 2000;
				System.out.println("축하합니다. 골드를 제공합니다 : " + gold * 2);
			} else if(i == 15) {
				gold = 3000;
				System.out.println("축하합니다. 골드를 제공합니다 : " + gold * 3);
			}
		}
		System.out.println("게임을 종료합니다. 현재 레벨 : " + level + ", 현재 골드 : " + gold);
		

		//j * gold 


		 
		//14 -> 15 : 42마리 (3의배수)
		//레벨업할때 축하금으로 --> 레벨 바뀌면 
		//5레벨 달성시 1000G, 10레벨 2000G
		//만렙달성시 3000G -> 10의배수
		
		//(레벨업 하기전에 사냥할거냐 종료할거냐 물어보기)
	}
}
