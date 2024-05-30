package com.winter.study3.ex2;

public class Study {
	// 삭제? --> 기존보다 -1
	public int[] remove(int[] ar) { // 인트배열을 받아와서 마지막꺼 하나 삭제? --> 기존 배열 데이터 -> 끝에 거만 삭제
		int[] newAr2 = new int[ar.length - 1];
		for (int i = 0; i < newAr2.length; i++) {// 짧은거 기준으로 해야함 그 길이만큼할거니까~
			newAr2[i] = ar[i];
		}
		return newAr2;
	}

	// 매개변수로 배열
	public int[] add(int[] ar) {// x100이라는 주소를 받아서 -> 주소의 길이를 출력하는 것~ (같은 주소를 사용)
		System.out.println(ar.length);
		// ar[0] = 5; //같은 주소를 쓰니까 -> x100에 0번째 숫자가 바뀜
		// ar은 지역변수기 때문에 메인까지는 못함 따라서 ar[]으로 접근해야 함 -> 주소를 받아올거니까~

		// **다시 풀기 (그대로 배열 내부 복사)
		int[] newAr = new int[ar.length + 1];
		// 기존배열에 하나를 더추가하고 싶으면 == 새로운 배열을 만들 수 밖에
		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}
		return newAr;
	}

}
