package com.winter.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String [] args) {
		//반복문 - for / while
		//3과목의 점수를 입력받아서 합계를 구해라
		Scanner sc = new Scanner(System.in);
		int sum = 0; //합계를 보관할 변수
		for(int i=0; i < 3; i++) {
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sum += num;//합계에 변수를 더하자 
		}
		System.out.println("점수 합계 : " + sum);
		
		//a부터 z까지 출력하고 싶음
		//i가 0일때 a; 
		int c = 97;
		//char c ='a'
		for (int i = 0; i < 26 ; i++) {
			System.out.println((char)c); //c
			c++;
		}
		
		for(int i ='a';i<='z';i++) {
			System.out.println((char)i); //char가 형변환이되니까
		}
		
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.print("abc"); //enter가 안되었다.
//		System.out.print("def");
//		System.out.println("");
//		System.out.println("123");
	
	}
}
