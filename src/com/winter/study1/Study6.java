package com.winter.study1;

public class Study6 {

	public static void main(String[] args) {
		
		int total = 256 ; //국영수 총점
		int average = 256/3;
		int result = (int) (average * 0.1);
		
		//80~89를 숫자하나 
		//평균이 90점이상이면, a
		//80점이상 b
		//내림 함수
		switch (result) { //case 함수 작성 --> 생노가다*****
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
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
