package com.winter.study1;

import java.util.Scanner;

//ctrl + f11
public class Study8 {
	public static void main(String[] args) {
		//원하는 결과물이 무엇인지 생각해봐야함
		Scanner sc = new Scanner(System.in);
		int tan = 3;

		for (int i = 0; i < tan; i++) {
			System.out.println("모드를 선택하세요 1.단발모드 2.점사모드");
			int select = sc.nextInt();
			
			int result = 10;
			String sth = "타타탕";			
			if (select == 1) {
				result = 30;
				sth = "탕";
			} 
			for (int j = 0; j < result; j++) {
				System.out.println(sth + (j + 1) + "번");
			}
		}
		System.out.println("장전을 종료합니다.");
		//문법이나 생각하는 것을 늘리기 위해서 진행할 것
		//백엔드 코드는 정해져있다. --> 문제를 꼬아서 만들고,,
		//생각하는 사고를 기르기 + 문법

	}
}
