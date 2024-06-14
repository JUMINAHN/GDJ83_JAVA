package com.winter.s5;

public class Single {
	// SingleTone --> application에서 객체가 딱 한개임을 보장하겠다.
	int num = 10;
	private static Single single; // 자기 타입을 넣는다. --> null

	private Single() {

	}

	public static Single get() { // 객체를 만들지 않고 생성가능하기 때문에 --> Static이니까 this불가
		if (single == null) {
			Single.single = new Single();
		}
		return Single.single;
	}
}
