package com.winter.s4;

public class Customer {
	int don;
	int point; // 포인트 적립해줘야 하니까

	// 매개변수를 하나만 선언
	// 다형성 형태를 다양하게 한다 -> 조건은 객체간의 관계가 있어야 함
	public void buy(Electric e) {
//		//가진 돈에서 물건의 가격을 빼고, 가진 포인트에 물건의 포인트를 더해야함
		this.don = this.don - e.price;
		this.point = this.point + e.point;

		System.out.println(don);
		System.out.println(point);
	}
}
