package com.winter.study3.ex2;

public class Ex2Main { // 프로그램 실행 및 테스트
	// *배열 추가 및 삭제**다시
	public static void main(String[] args) {
		Study study = new Study();
		int[] ar = { 1, 2, 3, 4 };
//		ar = study.add(ar); // 매개변수로 보내는 값 == 인자값*** ==> 값을 보낸다!!!!!!!(주소)
//		System.out.println(ar.length); // 여기서만 이루어진다고 생각하자~
//
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}

		ar = study.remove(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
