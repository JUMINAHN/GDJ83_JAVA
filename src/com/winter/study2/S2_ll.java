package com.winter.study2;

public class S2_ll {
	public static void main(String[] args) {
		// 배열 선언
		// 모으려고 하는 데이터 타입명 [] 변수명 = new 모으려고하는 데이터 타입명 [모으려는 개수];
		// 변수 선언 -> 데이터 타입 변수명; : 변수선언
		// String name; --> 선언시, 변수명 : String, name의 데이터 타입 int
		int[] ar = new int[3];
		// 변수명 -> 소문자 -> 소괄호 없음 -> int[] : 인트배열타입이다~
		// 우측 결과물을 좌측에 대입하자
		// new는 힙영역에 무언가 만들라!!*****
		// int type 3개를 이어서 만들라 --> 4byte 3개를 이어서 만들어라
		// ar이라는 변수는 실제 데이터ㅡㄹ 가리키는 주소 -> 참조변수 : 실제 데이터를 참조하는 주소가 있다
		// 지역변수 -> 시작되면 만들어지고 소멸, 초기화하지 않고 사용하면 에러 발생 --> ch = ' ', double = 0.0 : 초기값
		// ******String 기본값 null -> name = null;

		System.out.println(ar); // 주소값 -> @뒷부분이 배열을 가리키는 주소
		// 대괄호는 배열 Int 인트를 모아놓은 배열이다.
		String[] str = new String[3]; // 배열 크기는 변경이 안된다. //'a'는 가능 아스키코드 --> 어쩄든 int형이면 된다.
		System.out.println(str); // 배열인데 스트링을 모아놓은 배열이다. --> L jav.alng??
		// ar[0]은 int배열 ->
		// 힙영역에 들어가는 주소를 잘따라가야한다.
		// 이미 데이터가 있을 때 선언
		ar = new int[] { 3, 2, 1 }; // QQQQQQQQQQQQQ
		int[] ar3 = new int[3];

		int[] ar2 = { 1, 2, 3 };
		// 방이 하나씩 있다 --> 0번쨰 방에 있는 애를 꺼내서 출력 --> ar2에 따라가서 주소 x100에 -> x100에 있는 번호
		// 힙 영역에 만들어진 애들 자동 초기화
		// 인스턴스변수는 초기화가 자동으로 된다.*****
		System.out.println(ar3);
		System.out.println(ar3[0]); // 0출력
		ar3[0] = 50;
		ar3 = ar2; // 가능 --> 번지수 <로직그려보기>
		// 주소를 모르면 찾아가지 못함 -> 메모리를 차지함 -> JVM이 메모리가 모자랄 경우 -> 주소가없는 참조변수를 삭제함 GC
		System.out.println(ar3[0]);

//		ar[0] = 1;
//		ar[1] = 2;
//		ar[2] = 3;
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(i);
//		}
	}
}
