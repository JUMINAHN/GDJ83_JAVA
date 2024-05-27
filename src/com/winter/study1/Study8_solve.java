package com.winter.study1;

import java.util.Scanner;

public class Study8_solve {
	public static void main(String[]args) {
		//이중 for문 사용
		//FPS(배그, 서든, 배필)
		//총알(30발, 탄창 3개) --> 소비할껀데 
		//점사,  단발 -> 탄창 3번 감

		//게임이 시작되면
		//1. 1번 입력시 단발 모드 1->
		//2. 2번 입력시 점사 모드 3 -> i가 3배
		//탕이라는 것 30번 + 10번(타타탕)
		//3. 다쏘면 단발할꺼야 점사로 할꺼야
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("모드를 선택하세요 1.단발모드 2.점사모드");
			int mode = sc.nextInt();
			if(mode==1) {
				for(int j=0; j<30; j++) {
					System.out.println("탕" + (j+1) +"번");
				}
			} else if(mode == 2){
				for(int j=0; j<10; j++) {
					System.out.println("타타탕" + (j+1) +"번");
				}	
			}
		}
		System.out.println("장전을 종료합니다.");
		
		
	}
}
