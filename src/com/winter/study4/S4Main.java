package com.winter.study4;

public class S4Main {
	// main메서드 static -> 객체 생성없이 실행하기 위함*** (static과 public 많이 사용, 통상적 public)
	// 남들 library를 보고, static 선언시 어떻게 써야할지만 이해하고 알 것
	// 문서를 보고 어떻게 사용하면 좋을까에 대한거 인지할 수 있으면 됨!!!
	public static void main(String[] args) {
		Car.company = " "; // 객체를 만들지 않고 생성함 -> 왜 안만드냐? 미리 있는 부분이기 때문에 QQ.설계도 자체에 값을 미리주겠다?
		// Q. 설계도를 통일하겠다~
		// 공통적으로 들어가는 것들은 static으로 들어감(만들어진 변수 사용할 때-> 어떻게 사용하느냐)

		// 클래스 변수(프로그램이 실행될 때~종료할 때) + 힙 : 참조변수 주소가 소멸될때까지 사용 가능..

		// 클래스명.메서드명();

		Car.info(); // QQQ.설계도 내용의 기능 확인?

	}
}
