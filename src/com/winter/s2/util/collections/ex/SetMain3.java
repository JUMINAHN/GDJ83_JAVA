package com.winter.s2.util.collections.ex;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {
		HashSet<Integer> ar = new HashSet();
		ar.add(10);
		ar.add(8);
		ar.add(16);
		// 하나씩 꺼내서 출력하고 싶은데 -> index가 없음.. -> 하나만 꺼내는 메서드가 없음
		// Iterator 하나의 리스트처럼 생각해도 무방.
		Iterator<Integer> ir = ar.iterator(); // Hashset데이터 타입을 Iterator이라는 열거형 타입을 바꿔주는 것 --> 객체는 못만들지만 하나의 타입으로
												// 선언가능(인터페이스)
		// 객체는 못만들지만 타입명으로 선언할 수 있다.
		// 몇개가든지는 알수없음 -> 열거형이라서 하나 꺼내고 안꺼내고 반복
		// 몇개인지 몰라서 while --> 가끔나옴

		// 다음거가 있으면 --> set은 하나씩 꺼낼때 --> 이렇게쓴다고만 알아두자
		while (ir.hasNext()) {
			Integer num = ir.next();
			System.out.println(num);
		}
	}
}
