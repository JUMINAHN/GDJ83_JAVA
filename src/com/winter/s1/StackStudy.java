package com.winter.s1;

import java.util.Scanner;

public class StackStudy {

	Scanner sc = new Scanner(System.in);

	public int[] add(int[] ar) {
		int newAddStack[] = new int[ar.length + 1]; // 새로운 배열
		for (int i = 0; i < ar.length; i++) { // 맨앞에 인덱스에 새로운 것 추가
			if (i == 0) {
				System.out.println("0번째 배열에 입력될 값을 적어주세요 : ");
				newAddStack[0] = sc.nextInt();
			}
			newAddStack[i + 1] = ar[i];
		}

		return newAddStack;// 인트배열타입
	}

	public int[] remove(int[] ar) {
		// 하나의 요소를 삭제 -> 맨 앞에 0번 인덱스를 삭제하고, 삭제된 배열을 리턴하자
		int newRemoveStack[] = new int[ar.length - 1];
		for (int i = 1; i < ar.length; i++) { // 맨앞에 0번 인덱스 삭제
			newRemoveStack[i - 1] = ar[i];
		}
		return newRemoveStack;
	}
}
