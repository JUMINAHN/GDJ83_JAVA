package com.winter.study1;

import java.util.Scanner;

public class Study9_gameoption {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int level = 1;
		int gold = 0;
		int maxLevel = 15;
		
		System.out.println("게임을 시작합니다. 현재 레벨 : " + level + ", 현재 골드 : " + gold);
		for(int i=0; i < (3*i) ;i++) {
			System.out.println(i + "마리 사냥");
			
			for (int j=0; j < level ;j++) {
				System.out.println("레벨업!, 현재 레벨 : " + level);
				level++;
				if(level == maxLevel) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if(level ==10) {
					
				} else if(level == 5) {
					
				}
			
			if(i ==(3*15)) {
				System.out.println(i + "마리 사냥");
				break;
				}
			}
		}
		
	
		//j * gold 


		 
		//14 -> 15 : 42마리 (3의배수)
		//레벨업할때 축하금으로 --> 레벨 바뀌면 
		//5레벨 달성시 1000G, 10레벨 2000G
		//만렙달성시 3000G -> 10의배수
		
		//만렙달성시 프로그램을 종료한다. -> 현레벨, 현골드 출력 
		//(레벨업 하기전에 사냥할거냐 종료할거냐 물어보기)
	}
}
