package com.winter.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;
//20%정도 사용

public class MapMain1 {
	public static void main(String[] args) {
		// 키 값으로 String을 많이 쓴다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 키는 개발자가 직접 만들어야 함
		// List는 0번부터 자동으로 붙지만, key는 개발자가 직접 만들어야 함

		System.out.println(map.isEmpty()); // 비어있습니까? -> null은 객체가 만들어져있음
		map.put("k1", 1); // autoboxing
		map.put("k2", 2);

		// 하나씩 꺼내는 것
		System.out.println("키 값이 무엇? : " + map.get("k1"));

		System.out.println(map.size());
		System.out.println(map.containsKey("k1")); // map안에 xx라는 키가 있습니까?
		System.out.println(map.containsValue(1)); // xx라는 값이 있습니까?
		System.out.println(map); // 참조변수를 찍겠다는 의미는 간단한 확인 --> 키=값

		map.remove("k2"); // 키만, 키 벨류모두 쓸 수 있음
		map.clear(); // 안에 요소들을 삭제시켜주는 것

		// 개발자가 만드는 키이기에 패턴이 존재하지 않음
		// key들을 set로 바꿈 --> 중복되지 않은 것으로
		Iterator<String> it = map.keySet().iterator(); // Set<String> 타입으로.. --> 하나씩 꺼내는 애가 없음

		// set은 하나씩 꺼내기 위해서 Iterator로 바꿔라
		// map에 있는 것을 하나 하나 꺼내고 싶은 것
		// 열거형 -> while
		while (it.hasNext()) {// 다음게 있습니까? --> tokenizer와 비슷한 역할
			String k = it.next(); // 다음 꺼 주세요 --> 모아놓은걸 꺼내면 String --> Stirng모아놓으니까
			// 키를 하나 꺼낸 것 -> 이 키로 맵에서 꺼내려고 하는 것
			Integer v = map.get(k); // 값을 가져옴
			System.out.println(k + " : " + v);
		}
		// 반복문은 list, keyvalue

		// 전체를 출력하고 싶음
//		for(int i =0 ; i< map.size();i++) {
//			map.get(map); // key를 써야하는데 key를 어떻게 쓸 것인가? 
//		}
	}
}
