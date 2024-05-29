package com.winter.study3;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자]리턴타입 메서드명([매개변수선언]) {}
//	public void t1() { //되돌려줄 데이터가 없다 == void
//		int num = 3; 
//		int num2 = 6;
//		int result = num * num2; //사용하지 않으면 사라짐~ void 
//	}

	// 리턴 타입의 제한은 없다. --> 어떤 데이터 타입이던 모두 리턴이 된다.
	public int t1() {
		int num = 3;
		int num2 = 6;
		int result = num * num2;

		return result; // return의 데이터 개수는 딱 하나만 가능하다.
		// 메서드 종료 -> return
	}

	public void t2() { // return이 없다.
		Random random = new Random();
		// 0이상 10미만에 정수 하나를 랜덤하게 리턴해주는 것
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return; // return 데이터를 안줌 -> void에도 return이라는 구문을 쑬 수 있다. == 그 즉시종료한다.
		} else {// 홀수
			System.out.println(num);
		}
	}
}
