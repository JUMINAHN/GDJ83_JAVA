package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) { // main은 프로그램 실행 -> test용도
		// DTO (Data Transfer Object) == 데이터를 담고 있는 객체
		// VO (Value Object)

		// WeatherController를 만들고 내부에서 객체를 생성하는 방법은?
		WeatherController wc = new WeatherController();
		wc.start();
	}
}
