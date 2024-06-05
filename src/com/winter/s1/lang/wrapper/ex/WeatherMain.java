package com.winter.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object) == 데이터를 담고 있느 ㄴ객체
		// VO (Value Object)

		WeatherDTO[] dto = new WeatherService().init();
		WeatherView w = new WeatherView();
		w.view(dto);

	}
}
