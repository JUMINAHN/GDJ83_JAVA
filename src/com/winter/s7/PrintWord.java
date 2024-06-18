package com.winter.s7;

public class PrintWord implements Runnable {

	@Override
	public void run() {
		// 반복문에 대부분 사용
		this.print();
	}

	public void print() {
		for (int i = 'a'; i < 'a' + 10; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(1000);// 잠깐 자라
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
