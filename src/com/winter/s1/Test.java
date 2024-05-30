package com.winter.s1;

public class Test {
	int num; // 안쓰면 default
	private String name;

	public void info() {// 같은 클래스내이기 때문에 메서드로 사용할 순 있음
		System.out.println(this.name);
	}
}
