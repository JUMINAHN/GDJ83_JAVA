package com.winter.s4;

public class S4Main {
	// Quiz
	// Himart
	// Electric : 가격, 브랜드
	// Tv : 가격*, 브랜드*, point, size
	// computer : 브랜드*, 가격*, point, cpu
	// phone : 브랜드*, 가격*, point, 칼라

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "삼성";
		tv.price = 500;
		tv.point = 50;
		tv.size = 100;

		Computer computer = new Computer();
		computer.brand = "애플";
		computer.price = 300;
		computer.point = 30;
		computer.cpu = "M3";

		Phone phone = new Phone();
		phone.brand = "LG";
		phone.price = 150;
		phone.point = 15;
		phone.color = "핑크";

		// 사는 사람이 있어야 함 -> 생성
		Customer customer = new Customer();
		customer.don = 1000;
		customer.point = 0; // 첫손님

		// 물건을 사서 계산
		customer.buy(computer); // 어떤 제품이던간에 사서 물건을 -> 포인트 : Electric에 담아서 하기
	}
}
