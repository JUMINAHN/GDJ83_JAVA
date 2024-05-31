package com.winter.s3;

public class S3Main {
	// 자식클래스명 is a 부모클래스명 -> 이 의미가 맞습니까? (의미가 맞지않으면 사용할 수 없음)
	// ex) 호랑이는 동물이다, 새는 동물이다..
	// 자식 has a 부모 --> 자식계열이면 상속이 아닌 멤버변수를 쓰자

	// Animal 선언은 가능하다 -> type으로 -> 추상클래스니까 -> 근데 객체는 못함
	// ex) 비행기는 동물이다.xx 비행기는 동물을 가지고있다xx(따로선언해야함)
	// 배열 선언 공식 -> 모으려고하나는 데이터 타입
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수"; // animal과 bird를 받음
		penguin.wing = 2;

		Animal animal = tiger; // 부모는 자식을 담을 수 있다. --> 주소값 공유 (부모가 아는 영역만 접근 가능)
		animal = penguin; // 즉 에니멀이 가지고 있는 공통밖에 할 수 없다.

		// ********QQQQQQQQQQQQQQQ
//		Animal a = new Animal(); //애니멀을 만든거임
//		tiger = (Tiger) a;  //만들때부터 이름과 에이지만 있지 파워는 없어서 안됨 --> 같은 상속인데??
		// --

		// tiger = (Tiger) animal; // Tiger 타입으로 바꿔서 집어넣자. -> 다형성 ~> 다양한 형태(형변환과 비슷)
		// 다형성이 적용되려면 관계가 있어야 함 -> 부모*자식

		System.out.println(animal.name); // 타이거에서 -> 펭귄의 주소가 전달됨
		// power를 찍으려니까 에러가 뜬다.
		// tiger가 Animal타입으로 형태가 바껴서 -> power메서드를 쓸 수 없다.
		// 부모가 접근할 수 있는 건 부모가 가지고 있는 부분만 접근할 수 있다.
		// 즉 메모리에 파워는 만들어져있지만 타입 자체가 바껴있기 때문에 자식이 정의된 부분엔 접근할 수 없다.

		Animal[] dropShip = new Animal[8]; // 다른 타입을 못넣음 -> pengguin;
		dropShip[0] = tiger; // type은 에니멀 타입!!!!!!
		dropShip[1] = penguin;

		Tiger animal3 = (Tiger) dropShip[0];
		// 다른 타입도 넣을 수 있음
	}
}
