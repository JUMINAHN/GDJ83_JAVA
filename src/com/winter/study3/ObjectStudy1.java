package com.winter.study3;

public class ObjectStudy1 {
	// class가 가장 중요함!!!!!!!!!!
	public static void main(String[] args) {
		// 학생객체 생성
		// new로 만들면 -> 객체의 주소가 반환된다.
		Student s = new Student(); // 연산의 결과물을 대입하자~ --> Student타입의 객체를 넣자.
		// s에는 Student 타입만 담을 수 있다.
		// s. <- .은 ~의
		s.num = 2; // x100의 주소를 가지고 오든, 값을 넣든가 한다. --> s.num(멤버변수)은 int -> s에가서 int니까
		s.name = "Iu";
		// name은 student를 구성하는 구성요소지 student가 아니라는 것

		System.out.println(s); // 주소값
		System.out.println(s.name); // 누구의 이름이냐~
		System.out.println(s.kor); // s.kor -> 이 변수를 사용하겠다. -> 다만 기본형은 초기화하지 않으면 사용할 수 없음
		// 힙에 만들어지는 애들은 기본적으로 초기화를 자동으로 해줌.

		Student s2 = new Student(); // 초기화함 -> 대입
		System.out.println(s2.name);

		Student s3 = null; // 이까지는 선언 가능
		s3 = s; // s2도 담을 수 있음
		// 주소를 주소에 넣겠다. ****로직 그려보기
		System.out.println(s3.name); // -> s3만 선언할 경우 값이 없다. 모든 변수는 사용하려면 초기화해야함
		// nullpointerexception = 주소가 없구나, 객체가 안만들어졌구나 인지하기;
		// 개발자는 에러메세지를 중요하게 봐야한다.--> 짜는 능력도 좋지만 있는 문제를 해결하는게 중요;

		s3.name = "winter"; // 같은 주소값 공유 --> 같은 객체를 바라보게 만들었기 때문
		System.out.println(s.name);

		// *****************
		Student s4 = new Student(); // 새로운 객체 생성 -> 새로운 학생
		s4.num = s.num;
		s4.name = s.name; // 윈터를 s4에 넣는다.
		s4.name = "hanl";
		System.out.println(s.name); // winter가 나옴 --> 주소를 집어넣은게 아니라 값을 꺼내서 집어넣었기 떄문에 *****깊은 복사

	}
}
