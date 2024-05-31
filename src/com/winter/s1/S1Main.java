package com.winter.s1;

public class S1Main {
	public static void main(String[] args) {
		MidStudent ms = new MidStudent();
		// 눈에는 안보이지만 상속받은게 있기 때문에 얘도 기능을 쓸 수 있다. (다가질 수 있다~)
		HighStudent hs = new HighStudent();

		ms.info();
	}
}
