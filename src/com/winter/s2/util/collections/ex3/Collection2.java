package com.winter.s2.util.collections.ex3;

import java.util.ArrayList;

public class Collection2 {
	// Arraylist를 받아서 그 안에 있는 것을 사용하려고 하는 것
	// 매개변수는 중요치 않다.
	public void useList(ArrayList<Integer> ar) {
		// for(초기식;조건식;증감식){}
//		for(int i=0; i < ar.size(); i++) {
//			ar.get(i);
//		}

		// 단순하게 하나씩 꺼내서 하고싶을 때 --> 향상된 for문
		// 향상된 for문 : for(꺼낼데이터타입 변수명 : collection의 참조변수명){}
		for (Integer n : ar) {
			System.out.println(n); // get메서드를 안써도 이미 꺼낸 것~ --> 단순하게 돌릴 때
			// 꺼내기만 할 때
		}
		// 명확하게 무슨 타입인지 알 수 있으니까 이런 타입을 많이 씀

	}

}
