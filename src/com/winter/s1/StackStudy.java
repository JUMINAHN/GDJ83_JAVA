package com.winter.s1;

public class StackStudy {

	public int[] add(int[] ar) {
		int newAddStack[] = new int[ar.length + 1]; // 새로운 배열
		for (int i = 0; i < ar.length; i++) {
			newAddStack[i] = ar[i];
		}

		return;// 인트배열타입
	}

	public int[] remove(int[] ar) {
		// 하나의 요소를 삭제 -> 맨 앞에 0번 인덱스를 삭제하고, 삭제된 배열을 리턴하자

	}

}
