package com.winter.study3.ex4;

public class ExMain4 {

	public static void main(String[] args) {
		Car car = new Car(); // 생성자 호출 -> 객체 생성~
		// 생성자 안만들어도 생성자가 호출 -> 컴파일러가 기본 생성자를 만들어준다.
		// 생성하면서 초기화가 이루어지는 것
		// 생성자는 혼자 못쓴다 -> new랑 쓸 수 있다 -> 객체만들때 호출
		car.info(); // -> 지금 값 없음

		Car car2 = new Car(200);// 태어나서부터 가격을 가지고 시작
		car2.info();

		// 무조건 값ㅇ ㅣ있어야한다고 개발자가 의도함
		Bike bike = new Bike("", 0);
	}
}
