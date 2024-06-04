package com.winter.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		// immutable
		StringBuffer sb = new StringBuffer();
		// 문자열을 누적 시키고 싶을 때 (하나의 객체에 다 담으려고 하는것, 새로운 객체 생성 없이)
		// winter와 iu를 더하고 싶음
		sb.append("winter");
		sb.append("iu");
		sb.append(10);
		System.out.println("sb = " + sb);

		String result = sb.toString(); // String과 StringBuffer 타입이 다르니까 안들어가는게 당연
		// Object -> toString()을 호출함
		// 담을때는 toString()이 호출되지 않기 때문에 당연히 안된다
		// 원래 주소는 toString()주소를 찍지만, 얘는 데이터값이 나온다
		// toString오버라이딩 되어있을 것
		System.out.println(result);

		// 문자열을 더하기 할 때 새로운 객체가 만들어짐(String은)

	}

}
