package com.winter.study1;

public class Study1 {
	//자바스크립트는 웹브라우저 -> html로딩시
	//자바는 window -> os가 실행시켜줌 -> jvm이 실행시켜준다. (자바 버츄어 머신)
	
	//자바의 장점
	//MAC <-> window : 둘다돌릴 수 있음 
	//자바 실행환경을 설치해서(jvm) 두개 다 돌아갈 수 있도록 만듬
	//java -> jvm이 os맞게 해석해준다.
	//단점 : 한번거쳐서 실행되어서 조금 딜레이될 수도 있다.
	
	public static void main(String[] ars) { //클래스 구성 요소 중 메서드
		//여러개 클래스 파일중에서 main이라고 부르는 애들 실행 
		//최초 프로그램을 실행시켜주는 역할
		//프로그램 종료는 메인 메서드가 종료될 때 
		
		//변수 - 변하는 수, 상수 - 변하지 않는 수
		//변수 저장 하드웨어 영역 : 메모리(RAM)차지 
		
		//js는 대입할떄 타입결정
		
		//변수 선언
		//데이터타입 변수명
		int num;
		num = 50; //변수안에 숫자를 넣는게 초기화다. --> 어떤 타입인지 미리 정해놓기
		num = 2000;
		// num = 2000L; --> 다른 데이터 타입이 들어갈 수 없음
		long num2 = 2000L; //수의 범위를 표현 -> 타입 구분
		System.out.println(num);
		
		//실수형 자릿수차이
		double ki = 169.8;
		System.out.println(ki);
		
		//문자형과 문자열이 있다. : 문자형 -> 문자 한글자
		char ch = 'a';
		System.out.println(ch);
		
		//논리형 -> true / false;
		boolean flag = true;
		flag = false;
		System.out.println(flag);
	}
	
}
