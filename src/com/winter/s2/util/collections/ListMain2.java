package com.winter.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// 제네릭 : 타입의 제한을 주는 것 -> 이런 타입만 쓰자
		// E는 변수, T는 타입

		ArrayList<String> ar = new ArrayList<String>(); // 이 arraylist는 string을 모으려 함
		// 이 배열은 이제 string만 들어갈 수 있다. --> 타입의 제한을 주고 안정성을 확보할 수 있음
		ar.add("first");
//		ar.add(2); //-> generic 추가시 오류 뜸 
//		ar.add('c');
//		ar.add(true);

		// ArrayList -> object 타입을 제네릭에 넣어야 함 --> 정수를 넣고 싶으면 int말고 Integer
		ArrayList<Integer> ar2 = new ArrayList(); // int type만 넣고 싶다. --> 생성에 생략 가능
		ar2.add(2);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i)); // 하나씩 꺼내는 것 해야함 -> get
		}
		String name = (String) ar.get(0); // print는 잘되는데 에러가 뜨는 걸 볼 수 있다.
		// 같은 타입을 모은다. --> 실제로 같은 타입을 모은다
		// String도 int도 담을 수 있는 타입 --> Object
		// 즉 Object로 들어가기 때문에 꺼내도 Object

	}
}
