package com.winter.study3.ex3;

public class Cal {
	// 오버라이딩?
	// 메서드 오버로딩******
	// 같은 이름 메서드 여러개 만드는 것*******
	// 매개변수 타입의 조합이나 개수가 다르면 성립
	// 메서드의 내용은 달라도 상관없다.

	// 매개변수로 두개의 숫자를 입력받아서 출력하는 것
	// 타입 개수,매개 변수, 매개변수 순서만 신경슴
	// println도 오버로딩 중 하나

//	public void hap(int num1, int num2) { --> 변수명은 상관없음 타입의 조합을 보기 위함임
//		
//	}

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 + n2); // 자동 형변환
	}

	// 동일한 이름 메서드 -> 중복 선언
	public void hap(long n1, int n2) {
		System.out.println(n1 + n2); // 자동 형변환
	}

	public int hap(double n1, int n2) {
		System.out.println(n1 + n2); // 자동 형변환
		return 0;
	}
}
