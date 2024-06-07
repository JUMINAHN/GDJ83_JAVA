package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter, iu, hani, 철수, 영희"; // 기존에는 split

		// split 편하게 사용
		// 메서드를 쓸려면 객체를 만들어야 함
		// 객체의 주소를 입력한다. --> == 객체 생성
		StringTokenizer st = new StringTokenizer(names, ","); // 다른 package에 있기에 import 해야함
		System.out.println("쉼표로 분리했을 떄 총 토근의 개수는 몇개인가요? : " + st.countTokens()); // 인트
		// 보통 while => 반복문의 횟수가 정해지지 않았을 때 사용
		// 여러개가 모아서 하나가 될 때
		// ex) winter 25, iu 30, hani 29, 철수 18, 영희 20살 이럴때 --> 2개가 합쳐서 한사람 정보
		while (st.hasMoreElements()) { // token이 더있습니까 ? 물어보는 것 -> token이 없을 떄 까지~
			// 실제 자르는게 아니라 다음께 있는지만 살펴본다.

			// 시작은 윈터에서부터 시작
			// 쉼표를 만날떄까지 있는지 보는 것
			// 영희를 넘어가면 false가 리턴됨 -> token이 없을 떄 까지 return

			// 있으면 다음 token을 반환해 달라.
			String name = st.nextToken(); // 하나씩 잘꺼내오긴 -> 쉼표 or 끝 만날떄까지 잘라옴
			// String age = st.nextToken(); // 두번 선언하면 -> 한번 true일때 두번 잘라온다.
			System.out.println(name.trim());
			// 잘라서 클래스의 멤버변수에 넣고 싶을 때
		}

		// 분리를 했을 때 독립된 데이터일떄 많이 사용
		String[] n = names.split(","); // 분리가 되어서 다 들어간 것
		// 별다른 객체 생성없이 자기의 참조 변수를 이용해서 메서드 한 번 호출하면 분리가 다 됨
	}

}
