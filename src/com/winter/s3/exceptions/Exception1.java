package com.winter.s3.exceptions;

public class Exception1 {

	// 보통은 많이 던지는 것을 사용 -> 나혼자 개발하는것이 아니기 때문에
	public void ex1(int num) throws ArithmeticException, Exception { // 예외가 발생하면 던지겠다
		// throws는 여러개 가능하다.
		int n = 20;
		System.out.println(n / num); // 여기서 발생한 예외
	}
}
