package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy2 {
	public static void main(String[] args) {
		String name = "a-b-c";

		StringTokenizer st = new StringTokenizer(name);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("-")); // 자를 때 여기까지 잘라달라 --> 여기 만날때까지 짤라줘요
			// 기준이 조건에 따라서 계속 바껴야할 때
			// if를 써서 조건을 바꿀 수 있음 --> "" == String type 변수
			// parsing의 결과물을 token이라고 한다. == 용어 정도 알아먹으면 된다.
		}
	}
}
