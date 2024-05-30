package com.winter.study3;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자]리턴타입 메서드명([매개변수선언]) {}
//	public void t1() { //되돌려줄 데이터가 없다 == void
//		int num = 3; 
//		int num2 = 6;
//		int result = num * num2; //사용하지 않으면 사라짐~ void 
//	}

	// 매개변수는 -> 0개이상 /**그려보기
	public Test t5(Test t) { // t는 x001
		System.out.println(t.level);
		t.level = 200; // (void) x001에서 받은걸 넣음 << 호출된 것

		t = new Test(); // (void) x001에 새로운 주소인 x002를 넣어 그러면 t는 지금 x002인데 (바뀌긴 했지만 반환하지 않았기 떄문?) -->
						// 주소자첼
		t.level = 500; // (void) x002의 레벨이 500 --> 근데 이걸 반환한게 아니기 때문에 *****
		return t;
	}

	// 매개변수 선언 -> 5/30
	public void t4(int sal) {
		// 프리 월급 : 월급을 받아서 -> 3.3% 제외한 실수령액 계산
		// 실수령액 = 월급 - (월급*0.033)
		double result = sal - (sal * 0.033); // double타입 --> 원래 연산이 안되가지고 형변환되는 것
		System.out.println("실수령액 : " + result); // 출력하고 끝내면 void -> 값을 활용하고 싶으면 데이터타입
		sal = 100;
	}

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
