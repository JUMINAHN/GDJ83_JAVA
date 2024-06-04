package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object) == 데이터를 담고 있느 ㄴ객체
		// VO (Value Object)

		WeatherService ws = new WeatherService(); // Stringbuffer안에 지금 생성되고 서울 이런거 생김
		ws.init();
	}
}
