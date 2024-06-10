package com.winter.s3.exceptions;

//이 클래스는 예외에 해당된다.
public class MyException extends Exception { // Exception클래스를 상속받으면 됨

	public MyException() {
	}

	public MyException(String message) {
		super(message); // 부모의 생성자를 함께 보내버림
		// 뭐때문에 발생했는지에 대한 내용을 안적었기 때문
		// get message로 꺼내서 볼 수 있음
	}
}
