package com.winter.study1;

import java.util.Scanner;

//ctrl + f11
public class Study8_3 {
	public static void main(String[] args) {
		//원하는 결과물이 무엇인지 생각해봐야함
		Scanner sc = new Scanner(System.in);
		int tan = 3;

		for (int i = 0; i < tan; i++) {
			System.out.println("모드를 선택하세요 1.단발모드 2.점사모드");
			int select = sc.nextInt();
			
			int result = 0;
			String sth = "";
			
			if (select == 1) {
				result = 30;
				sth = "탕";
			} else {
				result = 10;
				sth = "탕탕탕";
			}

			for (int j = 0; j < result; j++) {
				System.out.println(sth + (j + 1) + "번");
			}
		}
		System.out.println("장전을 종료합니다.");

	}
}
