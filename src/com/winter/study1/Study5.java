package com.winter.study1;

import java.util.Scanner;

public class Study5 {
	public static void main(String [] args) {
		//primitive 타입끼리 ==는 잘 작동하나, reference타입은 잘안됨
		//비교 연산자
		int num1 = 1;
		long num2 = 1L;
		System.out.println(num1 == num2);
		
		String name1 = "winter";
		String name2 = "winter";
		System.out.println(name1 == name2);//둘이같다? 
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("이름을 입력하세요");
		String name3 = sc.nextLine();
	
		System.out.println(name1 == name3); //다르다고 뜬다. --> 불완전하다.
		//refer type은 같을때도 있고, 다를 때도 있다.
		//같다고 할때는 primitive 기본형 타입만 쓸떄 사용하자 
		
		//shift연산자 개념만 알자
		}
	}

