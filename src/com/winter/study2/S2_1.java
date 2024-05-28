package com.winter.study2;

import java.util.Scanner;

public class S2_1 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		// 0으로 모두 초기화되어있을 것 --> 자동
		// 각인덱스 번호 칸에 값을 키보드로 입력받아서 저장하기
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			System.out.println("배열에 들어갈 숫자를 입력해주세요");
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}
}
