package com.winter.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		// 배열이지만 몇칸인지 선언할 필요 없이 계속 집어 넣을 수 있음
		// 모든 클래스는 부모가 object -> name도 가능 ~ 부모가 오브젝트니까 (다형성)
		int num = 2;
		String name = "winter";
		ar.add(name);
		ar.add(num); // autoboxing --> Integer로 바꼈다가 object로 들어감!!
		ar.add(3.12); // autoboxing --> Double로 오토박싱되어 들어감
		ar.add('a'); // char -> CHARACTER로 autobxing
		ar.add(false); // boolean으로 오토박싱
		ar.add(num); // 얘네는 중복된 값을 허용한다.
		// 배열과 다르게 데이터 타입의 제한이 없고, 길이를 정하지 않아도 됨

		ar.add(1, "test"); // 중간에 넣을 수 있음 --> 1번 인덱스에 넣어라
		ar.set(0, 'c'); // 0번에 애를 바꾼다.
		ar.remove(0); // 0번 인덱스에 있는 애를 삭제해라 --> 지금 C가 들어있다가 삭제됨
		ar.remove(2); // 인덱스를 지워버리는 문제가 발생 -> 숫자 2를 지우고 싶음 --> 객체주소가 같은거 지움
		ar.clear(); // 다삭제
		// Q. 그럼 숫자 2지우고 싶으면 우쩜/?

		// 넘을 꺼내오고 싶음
		// ar에 모여져 있음 --> 배열 기반이지 배열 타입이 아님
		// 니가 꺼내고 싶은 index번호를 써라 --> 그래서 메서드가 있는것 꺼내오는것 get()
		// 배열 기반이니까 for를 돌림
		// 자체적인 코드
		// 중간에 삽입이나 삭제가 일어나면 느려짐

		for (int i = 0; i < ar.size(); i++) { // 얘네는 size씀 -- length랑 비슷한 것
			System.out.println(i + " = " + ar.get(i));
			// 순서유지가 된다.
		}

		// 자료 구조때문에 그런데 --> array linked 가있는 이유--> 어떤 구조를 써야 더 빠르게 접근가능?
		LinkedList lk = new LinkedList();
		lk.add("ad");
		// arrayList가 가지고 있는 함수랑 비슷함
		// linkedlist는 다른 배열을 복사해놓고 지우고 가져다 붙여놓음
		// 다음 인덱스의 주소를 붙임
	}

}
