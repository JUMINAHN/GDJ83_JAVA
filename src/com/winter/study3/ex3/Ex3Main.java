package com.winter.study3.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		// 자동차 구성요소는 같지만 객체가 다름 ****로직 그려보기
		Car car = new Car();
		car.color = "red";
		car.brand = "카니발";
		car.company = "현대";

		Car car2 = new Car();
		car2.color = "Black";
		car2.brand = "A7";
		car2.company = "아우디";

//		System.out.println(car); // 객체를 가리키는 주소
//		car.info(); // car2도 가능
//		// 만들어진 주소에 자기자신을 담고 있는 객체 ==**** (객체가 생성될 떄 그 주소)
//		// 객체 내부에서만 사용 가능;
//
//		System.out.println(car2); // 객체를 가리키는 주소
//		car2.info(); // car도 가능

		Cal cal = new Cal();
		cal.hap(10L, 20);
	}
}
