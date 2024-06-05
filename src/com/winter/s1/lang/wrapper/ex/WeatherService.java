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

	// Scanner를 매개변수로 보내줄 수 있음
	// 매개변수로 여러개 받아올 수도 있다~~!!
	public WeatherDTO findByCity(WeatherDTO[] dtos) { // 위치를 받아옴 -> WeatherDTO
		// 선생님 풀이
		// WeatherDTO weatherDTO = null
		// 값을 입력받아야함 -> Scanner
		WeatherDTO weatherDTO = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고 싶은 지역은 입력해주세요 : ");
		String location = sc.next();
		// dto 배열 -> 서울 -> 부산 -> 제주 -> 광주 순
		for (int i = 0; i < dtos.length; i++) {
			if (location.equals(dtos[i].getCity())) {
				weatherDTO = dtos[i];
				break;
			}
		}
		return weatherDTO;
	}

}
