package com.winter.s1.lang;

public class Test {
	int age = 10;
	double num = 3.1;

	@Override
	public boolean equals(Object obj) { // Test인데 Object타입으로 형태가 바뀐 것
		// Object 자체가 자식이 가지고 있는게 뭔지 모름
		Test t = (Test) obj;
		if (this.age == t.age && this.num == t.num) { // this 자기자신
			return true;
		} else {
			return false;
		}
	}

}
