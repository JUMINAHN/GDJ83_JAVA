package com.winter.s3;

public abstract class Bird extends Animal { // 얘를 객체화하지못하게 함
	// 추가로 날개만 있으면 됨
	int wing;

	public abstract void fly(); // 니가 받아서 정의해~

	@Override
	public void sleep() {

	}

}
