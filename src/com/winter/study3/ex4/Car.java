package com.winter.study3.ex4;

public class Car {
	String color = "white";
	String brand;
	String company;
	int price; // 가격 --> 선언과 동시 초기화 (1) : 잘안씀

	// 생성자 (constructor)
	// 객체 생성시 딱 한 번 호출되는 메서드 --> 멤버변수 초기화 및 특별한 일 하고 싶을 때
	// 접근제어자 클래스명과 동일([매개변수선언]) ; (static, void/int~ 없음)

	{
		// 인스턴스 초기화 블럭(알아만 두기) -> 멤버 변수 초기화 (2) ::거의 안씀
		price = 200;
	}

	public Car() {
		// new랑 만나서 해야함
		// 기본 생성자 -> 많이 사용 --> 메서드
		// 자동차 만들어질 때 기본으로
		// this()는 생성자내에서 제일 첫줄에 위치해야한다.(위에 코드가 없어야함)
		this(2500); // 메서드 -> 자기자신의 또다른 생성자를 호출하는 문법(생성자 호출);

//		System.out.println("자동차가 만들어집니다."); // this.는 참조변수 디스
//		this.color = "black"; // white에서 생성자가 만들어지면서 덮어 씌워짐
//		this.brand = "k3";
//		this.company = "기아";
//		// (3) -> 뒤에 값이 남는다.
//		this.price = 2500;
//		this.info();
	}

	// 메서드 오버로딩에 의해서 가능 -> 생성자 오버로딩
	public Car(int price) { // 여기는 지역변수
//		// this 생략 가능
//		// this price는 인스턴스 -> 힙영역
//		this.price = price;
//		this.color = "black"; // white에서 생성자가 만들어지면서 덮어 씌워짐
//		this.brand = "k3";
//		this.company = "기아";
		this(2500, "black");
	}

	public Car(int price, String color) {
		this(2500, "black", "k3");
		// this.price = price;
//		this.color = color;
//		this.brand = "k3";
//		this.company = "기아";
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "기아";
	}

	public void info() {
		System.out.println("info입니다.");
		System.out.println(this.color);
		System.out.println(brand); // this 생략 가능
		System.out.println(price);
	}

}
