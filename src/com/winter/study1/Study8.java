package com.winter.study1;

import java.util.Scanner;
//ctrl + f11
public class Study8 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int tan = 3;
		
		for(int i=0; i<tan; i++) {
			System.out.println("모드를 선택하세요 1.단발모드 2.점사모드");
			int select = sc.nextInt();
			if(select == 1) {
				for(int j=0; j<30; j++) {
					System.out.println("탕" + (j+1) + "번");
				}//안쪽 for의 끝이다.
			} else {
				for(int j=0; j<10; j++) {
					System.out.println("타타탕" + (j+1) + "번");
				}//안쪽 for의 끝이다.
			}
		}
		System.out.println("장전을 종료합니다.");
		
		
	}
}
