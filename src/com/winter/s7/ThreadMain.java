package com.winter.s7;

//요청이 들어오면 가상의 스레드 생성으로 동시다발 접속가능
public class ThreadMain {
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord(); // 작업을 위해 thread를 해야함
		Thread thread = new Thread(pw);
		// run메서드를 직접호출하는게 아니라 상속받은 메서드 중에서 start메서드 호출하면 번갈아가면서 일을 함

		pn.start(); // 스케쥴링 기법_운영체제 -> runnable : 실행 대기 상태 --> start는 쓰레드 클래스만 보유, runaable은 작업 더 필요
		thread.start(); // runaable 호출 --> 반복문 가능
	}
}
