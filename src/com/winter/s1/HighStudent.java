package com.winter.s1;

// 적은 노력으로 코딩가능
// 상속은 단일 상속만 가능하다.
// 상속은 클래스간의 관계를 설정한다.
public class HighStudent extends MidStudent {
	private int science;

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

}
