package com.winter.s2.util.collections.ex3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collection1 {

	// arraylist 객체를 만들고 집어넣는 것
	public List<Integer> makeList() { // array든 Linked든 list타입이니까 받는 입장에서 편하게 만들자
		// ArrayList<Integer> ar = new ArrayList<Integer>();

		// 다형성 때문에
		List<Integer> ar = new LinkedList<Integer>(); // 오른쪽만 바꿔도 다른곳 손댈필요 없음
		ar.add(1);
		ar.add(2);
		return ar;
		// Vector도 ListInterface
	}

	public Map<String, Integer> makeMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		return map;
	}

}
