package com.winter.study4;
//그외 제어자 이해하기

//**static : 객첼 생성하지 않고 사용 가능, 하나의 프로그램 안에 공통으로 사용할 때  --> 멤버변수 / 멤버메서드
public class Car {
	// 접근지정자 그외지정자 데이터타입 변수명
	// 클래스 변수
	// 대부분 자체 초기화를 진행한다.
	public static String company; // *변수명이 기울어졌다는건 static이 붙은 것 -> 객체를 만들지 않고 쓴다.
	// 객체를 안만들면 주소가 없음 , 근데 주소를 알아야 찾아갈 수 있다. --> 메서드영역(클래스)
	// stack이 먼저 차지 -> heap(만들어질수도 안될수도)
	// 메서드영역 -> 우리가 올린 코드를 올리고 -> main을 찾은 후 -> 스택에 준다.
	// 메서드영역 -> 사용할 클래스 로딩 --> 즉 메서드영역이 가장먼저실행되고 -> 스택이 실행되고 -> 힙이실행된다.
	// static 메서드영역에 만들어진다. --> 메인이 실행되기전에 company란 변수가 생성됨
	// stack에서 company주소를 알아야 가져갈텐데 쓸 수 있는 방법이 있는가?
	// 참조변수 대신 Car, 즉 클래스를 쓴다.
	// 클래스명.변수명

	static {
		// static 초기화 블록이 따로있음 -> 이게 있냐 없나의 차이지만, 이걸 잘 보지는 않을 것임
	}

	public final int price = 30; // final : 한번데이터 값은 변경이 불가하다. -> 초기화 안할 시 에러가 뜬다.

	// static은 instance 접근 불가
	public static void info() { // 객체를 만들지 않고 쓸 수 있다. -> Main 시작전부터
		System.out.println(Car.company); // class에 static 접근
		// System.out.println(this.price); // 객체 생성을 안해서?(힙영역에 만들어지는게 보장이 되지 않기 떄문에)
		// 인스턴스변수 입장에서는 this가 되지만 static에선 만들어지는게 보장이 되지 않기 떄문에 this를 사용할 수 업슴
		System.out.println("static 메서드이다.");
		// this.info(); -> 객체 만들어져야 쓸 수 있는데 동적이라, 만들어지지도 않을수도 있는데 어떻게 호출해?
	}

	// instance는 static instance 모두 접근 가능
	public void info2() {
		Car.info(); // 메서드 내에서 다른 메서드 호출 가능(main이랑 똑같음)
		// 프로그램 시작 전부터 만들어져있으니까 사용가능
		System.out.println(Car.company);
		final int num = 30; // 변순데 변할 수 없다 == 상수처럼 쓰라
		// num = 10; -> 상수이기에 값 못바꿈
	}
}
