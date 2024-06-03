package com.winter.s1.lang;

public class S2Main {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2); // 주소비교 -> false

		flag = t1.equals(t2); // 주소값 내부 값을 비교
		System.out.println(flag);
	}

}
