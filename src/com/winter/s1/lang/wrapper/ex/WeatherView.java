package com.winter.s1.lang.wrapper.ex;

public class WeatherView {

	// view
	// "날씨들"의 정보를 받아서 이쁘게 출력하는 것 --> Main의 dtos
	// WeatherDTO [] dto -> 날씨하나는 WeatherDTO하나
	public void view(WeatherDTO[] dto) {// 누군가가 dto를 주면 내가 출력하겠다.
		for (int i = 0; i < dto.length; i++) { // 배열의 길이 -> dto
			System.out.println(dto[i].getCity());
			System.out.println(dto[i].getGion());
			System.out.println(dto[i].getStatus());
			System.out.println(dto[i].getHumidity());
			System.out.println("==============");
		}
	}

	public void view(WeatherDTO wd) {
		System.out.println(wd.getCity());
		System.out.println(wd.getGion());
		System.out.println(wd.getStatus());
		System.out.println(wd.getHumidity());
		System.out.println("==============");
	}
}
