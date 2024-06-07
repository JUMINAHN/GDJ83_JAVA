package com.winter.s2.util.collections;

import java.util.ArrayList;

public class ListTest {

	// String을 보내면 이제 타입에 대한 보장을 하는 것
	// 꺼내면 Object가 아닌 Stirng type으로 형변환 없이 쓸 수 있음
	public void info(ArrayList<String> ar) { // 누군가가 arraylist를 주면 작업을 하겠다.
		// arraylist가 오면 하나씩 꺼내서 뭔갈 하고싶다.
		for (int i = 0; i < ar.size(); i++) {
			String obj = ar.get(i); // 무슨 타입의 변수로 보낼지 모름.. 그래서 우리가 쓸 수 있는건 Object
			// Object를 기존에 사용해야 했는데 타입이 보장되니 -> String으로 받을 수 있음
			// String으로 형변환하고, Integer로 형변환하고 일일이 할 수 없다.
		}

		// Obejct가지고 쓸 수 있는게 별로 없다..
		// 타입의 제한이 있으나, Object로 받은 것 뿐이다.
		// Object에 담을 수 있는게 여러개이니 제한같이 보인다.
		// 실제로 사용하면 타입이 맞지 않을 때 문제가 발생함
	}
}
