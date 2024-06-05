package com.winter.s1.lang.wrapper.ex;

public class WeatherView {

	// view
	// 날씨들의 정보를 받아서 이쁘게 출력하는 것 --> Main의 dtos
	// WeatherDTO [] dto
	public void view(WeatherDTO[] dto) {
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i].getCity());
			System.out.println(dto[i].getGion());
			System.out.println(dto[i].getStatus());
			System.out.println(dto[i].getHumidity());
			System.out.println("==============");
		}

	}
}
