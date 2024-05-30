package com.winter.study3.ex3;

public class Bike {
	String color;
	String brand;

	// 객체를 만들때 생성되는 변수-> 변수의 값이 자기자신의 객체 주소가 들어간다.
	// this는 객체 안에서만 물어본다. (각각의 객체)
	public void info() {
		System.out.println(this); // 이 this는 bike 클래스를 보고 만든 bike의 -> 각 클래스의 객체마다 물어본다.
	}
}
