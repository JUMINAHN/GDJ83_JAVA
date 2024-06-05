package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {

	private StringBuffer sb; // null
	Scanner sc = new Scanner(System.in);

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

	// 날씨 정보를 추가하는 메서드를 만든다.
	// 메서드명은 addWeather라고 할 것이다.
	// 도시명, 기온, 도시의 상태, 도시의 습도를 입력받음 -> 기존의 날씨 정보들에 추가 --> 하나더 추가해서 5개 --> 또하나 추가하면
	// 6개
	// 추가하고 1번누르면 5개 --> 추가하고 1번 누르면 6개
	// 배열의 크기는 바꿔서 넣어야 함

	public WeatherDTO[] addWeather(WeatherDTO[] ar) {
		// 선생님 풀이
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요 : ");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요 : ");
		weatherDTO.setGion(sc.nextDouble());
		System.out.println("현재 상태 입력 : ");
		weatherDTO.setStatus(sc.next());
		System.out.println("습도를 입력하세요 : ");
		weatherDTO.setHumidity(sc.nextInt());

		WeatherDTO[] newAr = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}
		newAr[ar.length] = weatherDTO; // 한개가 추가되는 효과를 볼 수 있음~
		return newAr;
	}

	// remove weather
	// 기존 배열에서 하나를 삭제하는 것
	// 삭제하고 새로운 배열을 만들어라
	// 힌트 컨티뉴

	// 도시명을 입력받아서 일치하는 날씨정보를 삭제하자

	// 정렬 알고리즘 다시 사용해야할듯 ?
	public WeatherDTO[] remove(WeatherDTO[] ar) { // findBy 메서드 재활용할 수 있다.
		WeatherDTO findW = this.findByCity(ar); // 찾았어
		WeatherDTO[] newAr = new WeatherDTO[ar.length - 1];
		for (int i = 0; i < ar.length; i++) { // 버블 정렬
			if (ar[i] == findW) {// 이거 제외하고
				ar[i] = ar[i + 1];
				WeatherDTO temp = ar[i + 2]; // 버블정렬?
				ar[i + 1] = temp;
			}
		}
		for (int i = 0; i < newAr.length; i++) {
			newAr[i] = ar[i];
		}

		return newAr;
	}

//				for (int j = 0; j < newAr.length; j++) {
}
