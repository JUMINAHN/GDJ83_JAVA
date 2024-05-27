package com.winter.study1;

import java.util.Scanner;

public class Study4Solve {
	//숫자 4와 10이 관련되어있다.
	public static void main(String [] args) {
		//키보드와 연결 준비
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int result = num / 4 * 10 + num%4; //**********
		
		
		System.out.println("프로그램을 종료합니다.");
	
	
		//***규칙을 찾는 것이 중요하다 : 1~3까지는 n이나오고***
		//최초의 암호시스템? (로마시저)
		//데이터를 입력하면 다른 숫자가 나온다
		//0 -> n+(6*0)
		//1을 넣으면 -> 1이나오고,  
		//2을 넣으면 -> 2가 나오고, 
		//3을 넣으면 -> 3이 나오고
		
		//4을 넣으면 -> 10 -> (n+6*1)
		//5를 넣으면 -> 11이 나온다
		//6을 넣으면 -> 12
		//7을 넣으면 -> 13가 나온다
		
		//8 -> 20 -> n+6*2
		//9 -> 21
		//10을 넣으면 --> n+(6*2);
		//11
		
		//12 -> n+6*3
		//13
		//14
		//15
		
		//16 -> n+6*4
		
	}
}
