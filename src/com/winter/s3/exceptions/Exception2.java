package com.winter.s3.exceptions;

public class Exception2 {

	// 어떤 조건에 의해 강제적으로 예외를 만들어야할 때 -> 사용자 정의 exception 만들어야함
	public void hap(int n1, int n2) throws Exception {
		int h = n1 + n2;

		if (h > 99) {// 안만들고 그냥 예외만 발생시켜도 됨
			throw new MyException("3자리 수는 몰라요"); // 내가 만든 예외를 만들어서 던져버리자~
		}

	}
}
