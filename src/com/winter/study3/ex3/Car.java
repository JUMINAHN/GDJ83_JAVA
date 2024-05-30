package com.winter.study3.ex3;

public class Car {
	String color; // 이걸 보고 싶으면 -> Car 타입
	String brand;
	String company;

	// this : 나 자신 -> 참조변수 this********* : 객체의 주소를 담고 있음(참조변수)
	// 객체 생성 시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용 가능
	// this 자기 자신의 객체의 주소를 담고 있다.*********

	public void info() { // (Car car) car타입의 주소를 받아야함 --> 자동차의 색깔을 찍고 싶은 것 -> 멤버변수를 찾아가러면ㄴ
		// (2)
		// 멤버가 있는 객체의 주소를 알아야 찾아감
		// 찍으려고하는 객체의 주소가 있어야 함
		// 주소를 따라가면 color, brand, comapny가 있음
		System.out.println("info입니다.");
		System.out.println(this); // 선언안한다. 이미 이 변수가 들어있는 것
		// color을 찾아가려면 객체의 주소가 필요한데 -> this가 이를 가지고 있음 (자기자신을 가리키는 주소)
		System.out.println(this.color); // car2를 넣으면 car의 color가 나옴

		// this는 생략 가능
		// System.out.println(this.brand));
		System.out.println(this.brand);
		// 객체의 주소만 알면 접근 가능 -> 참조변수명.멤버메서드
		this.go(); // (1)
	}

	public void go() {
		System.out.println(this.company);
	}
}
