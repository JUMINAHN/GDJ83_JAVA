package com.winter.study3;

//추상화 작업
//학생은 하는일없음 -> 그냥 데이터 덩어리일뿐
public class Student { // 이런 덩어리들을 학생이라고 하자고 우리가 정의하는 것
	// 타입을 다르게 다루고 싶은 것 -> class는 설계도 -> 이렇게만들자고 정의한 것 -> 실제 객체는 아닌
	// 쓰려면 객체부터 생성하고 써야한다.
	int num; // 멤버변수 == 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int totals;
	double avgs;
}
