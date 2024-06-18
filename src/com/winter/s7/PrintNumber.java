package com.winter.s7;

public class PrintNumber extends Thread { // 쓰레드 상속

	@Override // run메서드 오버라이딩
	public void run() {
		// 보통은 이 안에 반복문으로 무언갈 한다.
		this.info(); // 반복문이 돌 것임
	}

	public synchronized void info() {// sychronized 한번에 한사람만 접속 가능 데드락만 주의
		Object obj = new Object(); // obj에서 확인 가능

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);// 1초재우고 싶으면 1000을 줌 --> 잠깐 잣다가 다시 올라가라
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
