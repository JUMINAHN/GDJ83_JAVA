package com.winter.s3;

//Class대신 interface사용 
public interface Fly extends Landing { // 이안에 멤버로는 **상수와 추상 메서드로 이루어져있다.

	// 상수 : 인터페이스 접근 지정자는 public만 가능
	public static final int NUM = 1; // 초기값을 넣지 않을 시 에러****
	String NAME = "abc"; // 기울어져있으면 static --> public final을 넣지않았는데도?
	// interface에 변수명이 이렇다고 생각 --> 생략하면 public static을 앞에 넣어주는 것

	// 추상 메서드

	// 접근 지정자 public abstract
//	public abstract void t1(); //추상메서드니까 여기까지 -> 사용하려면 overridng
//	public int t2();; //abstract이 빠져도 넣어준다.
//	abstract String t3(int num)해도 public을 넣어주겠다. <<<<<<<- ????
//	void t4();
	// 조건 public abstract이 들어야가야한다.
	// 메서드명만 제시해주자

	public abstract void flyAble();

}
