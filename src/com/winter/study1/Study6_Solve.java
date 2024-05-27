package com.winter.study1;

public class Study6_Solve {

	public static void main(String[] args) {
		
		int total = 300 ; //국영수 총점
		int average = total/3;
		
		//80~89를 숫자하나 
		//평균이 90점이상이면, a
		//80점이상 b
		//내림 함수
		switch (average/10) { //로직생각해보기 -> 생각열기
		case 10:
		case 9:
			System.out.println("A");
			int n = 10;
			break;
		case 8:
			System.out.println("B");
			//int n = 10;이 안됨 --> 두개 영역이 다른데 왜 선언이 안되느냐?
			//break 만약에 안쓰면 어떻게 할것인가? ********
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	
	}
}
