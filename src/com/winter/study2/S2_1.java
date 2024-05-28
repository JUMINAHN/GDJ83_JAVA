package com.winter.study2;

import java.util.Scanner;

public class S2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // new -> 힙영역 --> sc에 주소를 담는다.
		int[] ar = new int[5];
		// 0으로 모두 초기화되어있을 것 --> 자동
		// 각인덱스 번호 칸에 값을 키보드로 입력받아서 저장하기

		for (int i = 0; i < ar.length; i++) {
			System.out.println("배열에 들어갈 숫자를 입력해주세요");
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("배열의 크기를 입력받으세요");
		int size = sc.nextInt();
		int[] num2 = new int[size];
		// 상수대신 같은 타입의 변수가 들어갈 수 있다. --> 상수의 데이터 타입을 보고, 변수의 데이터 타입을 유추해서 넣는다.

	}
}
