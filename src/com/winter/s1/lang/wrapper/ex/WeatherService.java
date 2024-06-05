package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {

	private StringBuffer sb; // null

	public WeatherService() { // 기본 생성자
		this.sb = new StringBuffer(); // null이 아닌 객체 생성 -> 새로운 것을 만들어서 집어넣는다
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 1개의 weatehrDTO
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80"); // 4개 다들어가 있음
	}

	public WeatherDTO[] init() {
		String info = this.sb.toString();
		info = info.replace(",", "-"); // 순서 --> 코드 순서를 읽어보자
		// System.out.println(info); // info를 받아서 스플릿한다.
		WeatherDTO[] dtos = this.getWeathers(info); // WeatherDTO가 있는 배열을 주겠다.
		return dtos;
	}

	private WeatherDTO[] getWeathers(String info) { // info를 받아서 스플릿한다.
		// 선생님 풀이
		String[] infos = info.split("-"); // info가 스트링

		int idx = 0;
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4]; // 4번의 객체가 있어야함 --> 그림을 그려넣는게 정확함

		// 방법 2
		for (int i = 0; i < dtos.length; i++) {
			WeatherDTO w = new WeatherDTO();
			w.setCity(infos[idx++].trim());
			w.setGion(Double.parseDouble(infos[idx++].trim()));
			w.setStatus(infos[idx++].trim());
			w.setHumidity(Integer.parseInt(infos[idx++].trim()));
			dtos[i] = w;
		}
		return dtos; // 배열명을 리턴해주자
	}

	// Weathercontroller에서 serive랑 view 만들어놈, service에서 init findbyId만들 것
	// 즉 2번 누르면 findbyID호출해서 찾은 것을 리턴하면->호출한쪽 (controller)
	// 날씨정보들이 있어야 검색을 찾을 건데 날씨 정보들을 컨트롤러에 보관하고 있음 -> 이 날씨 정보들을 ws에 보내야 거기서 검색할 것

	public WeatherDTO findByCity(WeatherDTO[] dtos) { // 위치를 받아옴 -> WeatherDTO
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고 싶은 지역은 입력해주세요 : ");
		String location = sc.next();
		// dto 배열 -> 서울 -> 부산 -> 제주 -> 광주 순
		for (int i = 0; i < dtos.length; i++) {
			if (location.equals(dtos[i].getCity())) {
				return dtos[i];
			}
		}
		return null;
	}

}

//		if (location.equals("서울")) {
//			return dtos[0];
//		} else if (location.equals("부산")) {
//			return dtos[1];
//		} else if (location.equals("제주")) {
//			return dtos[2];
//		} else if (location.equals("광주")) {
//			return dtos[3];
//		} else {
//			return null;
//		}

// 방법 1
//		for (int i = 0; i < infos.length; i = i + 4) { // 16번도는 것
//			WeatherDTO w = new WeatherDTO();
//			w.setCity(infos[i]);
//			w.setGion(Double.parseDouble(infos[i + 1]));
//			w.setStatus(infos[i + 2]);
//			w.setHumidity(Integer.parseInt(infos[i + 3]));
//			dtos[i] = w;
//			idx++;
//		}