package com.winter.s3;

//개념적으로 객체를 만들면 이상하게 나온다 -> 의도적으로 new Animal 못하게 (abstrace 적용시)
public abstract class Animal { // 얘를 상속받아써라 //
	int age;
	String name;

	// 하는 일
	public abstract void sleep(); // 추상메서드인 것을 해줘라
}
