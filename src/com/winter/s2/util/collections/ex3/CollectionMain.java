package com.winter.s2.util.collections.ex3;

public class CollectionMain {
	public static void main(String[] args) {
		// collection 1, 2를 연결하려고 하는 것
		// c1에서 만든 arraylist를 c2에 보내려고하는 것
		Collection1 c1 = new Collection1(); // 멤버가 없는 클래스
		Collection2 c2 = new Collection2();

		// ArrayList<Integer> ar = c1.makeList();
		// c2.useList(ar); //만든 list를 c2로 보내는 것
		// 상기 내용과 같다.
		// useList --> 다른 리스트 값을 가져오는 것
		c2.useList(c1.makeList());
	}
}
