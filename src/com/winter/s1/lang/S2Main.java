package com.winter.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println("obj : " + flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2); // 주소비교 -> false

		// **equals 내부에 t1 == t2가 들어있는 것이다. (기존 주소값)
		// equals를 오버라이딩 받아서 너가 쓰고싶은대로 해! --> 아직 안했기떄문에
		flag = t1.equals(t2);
		System.out.println(flag);

		// String은 immutable 불변, 변화가 없는 객체
		String name = "winter"; // 값을 넣으니 상수구역에 만들어진다(primitive)처럼 -> 주소만 받는다
		System.out.println("이름 입력");
		String name2 = sc.next(); // 다른 영역에 만들어짐
		String name3 = "winter"; // 같은 글자는 글자 상수풀~ --> 같은 주소를 보고 있음 (힙영역)
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println("기존 + 입력값 :  " + name.equals(name2)); // 내부에 equals 자체 오버라이딩
		// 주소가 아니라 실제 값을 비교하기 위해선 equals를 사용한다.

		// 상수구역 winter, name2는 어딘가에 만들어질 것
		// String type은 불변이다.
		name3 = name3 + name2; // winterwinter의 주소를 반환해서 name3에 넣는다. 불변이기 떄문에
		// 두개이상을 더하면 새로운 객체를 만든다.
		// 한번만들면 데이터를 바꿀 수 없다. --> 새로운 객체의 주소를 반환하는 것 : 즉 객체가 세개*********!
		System.out.println(name3);

		System.out.println("1" + 1 + 1 + '1'); // "1"+1에서 새로운 객체 생성 "1"+1이 혼합된 객체에 "1"+1+1이 됨..
		// 변경되는게 아니라 하나하나 추가가 되는 것

	}

}
