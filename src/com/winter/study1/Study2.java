package com.winter.study1;

public class Study2 {
	//자바는 무조건 class만들고 시작
	
	public static void main(String [] args) { //변수명 , args , age, out
		//메서드명(), println();
		//int age = 30;
		//System.out.println(age);

		//형변환 -> primitive 타입끼리만 형변환 // boolean 제외*******
		//자동형변환 : byte -> short, char -> int -> long -> float -> double **
		//수 표현의 개수(비트 조합) : long이 수를 더 많이 표현 -> 1.00000000000000000001 --> 누가 ㄷ ㅓ많은 수를 표현
		
		//기본형은 곧바로 값을 대입
		//reference type -> 객체를 이야기 : class
		//String -> 참조형
		String name = "winter"; //원래 String name = new String("winter");
		//String은 너무 많이 쓰니까 값을 바로 대입할 수 있도록 만들어줌 String na="iu"; --> ***reference type;
		//reference type
		Object obj = new Object();
		int age = 1;
		String na ="1";
		long numL = 30L; //정수형 30L
		//int num2 = num1; //못넣게 되어있음
		int num2 = (int) numL; //-> 형변환 : 명시적 형변환 -> 강제 형변환 --> 큰 타입을 작은 타입에 넣을 때 
		// 데이터가 바뀔 가능성도 있다. *****?
		
		float f1 = 1.2F;
		double d1 = f1; //(double)형변환 자동 적용 --> 묵시적(자동) 형변환 --> 큰 타입에 작은타입을 넣을 때 생략 가능
		
		
		//type자체가 다르기 떄문에 비교할 수 없음
		//System.out.println(age == na);
		//refer와 primitive타입은 연산이 안됨~!
		
		//연산자는 같은 타입끼리만 연산이 가능하다. ******
		//산술 연산자 : %, +, -, *, /
		//js에는 "1" * 1이 되었지만, 자바는 안됨
		
		//타입이 다름에도 불구하고 연산이 된다. --> 정수 + 실수 
		//-> 그 이유는 형변환 (type의 변환:다른타입으로 바꾸겠다)
		
		int total = 100;
		double avg = (double)total/3; //결과자체를 왼쪽에 대입 --> total을 먼저 더블로 바꾸고~
		avg = 33.22;
		total = (int) (avg*10);
		System.out.println(total);
		
		//over flow --> 이건 개념만 알면됨 **
		byte b = 127;
		byte b2 = 1;
		//b + b2; //(byte타입이긴함) -> 넘처흐르면? --> -128로 됨 : 넘쳐흐르기 떄문에 
		b = (byte) (b+b2);
		System.out.println(b);
		
		//under flow --> -127 -2 = -129 >> 그래서 127로 위로 감
	}
}
