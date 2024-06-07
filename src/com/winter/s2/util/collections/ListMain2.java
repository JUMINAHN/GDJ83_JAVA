package com.winter.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// 제네릭 : 타입의 제한을 주는 것

		ArrayList ar = new ArrayList();
		ar.add("first");
		ar.add(2);
		ar.add('c');
		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i)); // 하나씩 꺼내는 것 해야함 -> get
		}
		String name = (String) ar.get(0); // print는 잘되는데 에러가 뜨는 걸 볼 수 있다.
		// 같은 타입을 모은다. --> 실제로 같은 타입을 모은다
		// String도 int도 담을 수 있는 타입 --> Object
		// 즉 Object로 들어가기 때문에 꺼내도 Object

	}
}
