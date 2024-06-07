package com.winter.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy2 {
	public static void main(String[] args) {
		String name = "a-b-c";

		StringTokenizer st = new StringTokenizer(name);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("-")); // 자를 때 여기까지 잘라달라 --> 여기 만날때까지 짤라줘요
		}
	}
}
