package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	private WeatherDTO[] dtos; // null = 기본값
	private WeatherService weatherService; // null
	private WeatherView weatherView; // null
	private Scanner sc;

	public WeatherController() {
		this.weatherService = new WeatherService();
		this.weatherView = new WeatherView();
		this.dtos = this.weatherService.init(); // weatherService에서 우리가 만들어 놓은거가 있으니까
		// weatehrDTO배열타입의 주소가 들어가야 함 -> 배열은 몇갤 모을지 선언해줘야 함. weather의 init를 호출하면 배열
		this.sc = new Scanner(System.in);
	}

	public void start() { // 몇번 할지 모르니까 반복문 while
		// 지역변수 선언해도됨 scanner
		boolean flag = true;
		while (flag) {
			System.out.println("1. 날씨 전체 정보 출력");
			System.out.println("2. 날씨 정보 검색 ex)도시명을 검색해주세요"); // 어떤 도시의 하나만 알고 싶음
			// Service에서 메서드 만들 것
			System.out.println("3. 날씨 정보 추가");
			System.out.println("4. 날씨 정보 삭제");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt(); // if-else , switch-case 선택
			if (select == 1) {
				// 정보 출력 weatherview
				this.weatherView.view(dtos); // 만들어놓은것***
			} else if (select == 2) {
				WeatherDTO wd = this.weatherService.findByCity(dtos);
				this.weatherView.view(wd);
			} else if (select == 3) {
				dtos = this.weatherService.addWeather(dtos); // 반환 받아야함
				// 주소를 반환 -> 기존 주소에 : 새로바뀐 주소를 출려갛고싶으니까
			} else if (select == 4) {
				dtos = this.weatherService.remove(dtos);
			} else if (select == 5) {
				System.out.println("프로그램이 종료 됩니다.");
				flag = false;

				// **집에서 그림 구조그려보기
			}
		}
	}

}
