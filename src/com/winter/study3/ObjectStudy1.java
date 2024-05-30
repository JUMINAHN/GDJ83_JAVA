package com.winter.study3;

//
//import com.winter.study3.student.Student;
//
public class ObjectStudy1 {
	public static void main(String[] args) {
		StudyReturn sr = new StudyReturn();
		int sal = 5000000; // 변수명이 같을 뿐 중복선언이 아니다.
		sr.t4(sal);

		// ***5/30 -> 연습(구조 그려보기)
		Test test = new Test();
		test.level = 1;
		// x001의 주소를 받앗어
		Test test2 = sr.t5(test); // 상기객체를 사용하기 새로운 객체를 사용하고 싶으면 새로운 변수 생성
		// (void)test type이니까 test타입의 객체를 만들어야 가능 --> 주소만 받아오고 ****주소 자체만 온다고 판단하면 됨
		// (void)신규 x002를 쓰려면 return으로 반환받아야 했을 것

		// 우리친구 x001에 대한 레벨 호출 --> return 받은게 없으면 --> 그냥 눈에보이는것만 있다고생각하자
		System.out.println(test.level); // 주소에 담긴 값을 호출 ->x001에대한 호출만 한거기 때문
		System.out.println(test2.level);
	}
}
