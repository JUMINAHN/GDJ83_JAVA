package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	private WeatherDTO[] dtos; // null = 기본값
	private WeatherService weatherService; // null
	private WeatherView weatherView; // null
	private Scanner sc;

	public WeatherController() { // this == 자기객체를 나타내는 참조값
		// 타입을 쓸 수 있는게 없으면 새로 만들자 --> new뒤에 오는 것이 생성자
		// 생성자가 어떤 의미이냐 추가적으로 생각, 연결 연결 생각
		this.weatherService = new WeatherService(); // 초기값으로 대입을 하자, 즉 WeatherService타입을 대입해야 함
		this.weatherView = new WeatherView();// 주소를 넣자
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
			System.out.println("3. 프로그램 종료");
			int select = sc.nextInt(); // if-else , switch-case 선택
			if (select == 1) {
				// 정보 출력 weatherview
				this.weatherView.view(dtos); // 만들어놓은것***
			} else if (select == 2) {
				WeatherDTO wd = this.weatherService.findByCity(dtos);
				this.weatherView.view(wd);
			} else if (select == 3) {
				System.out.println("프로그램이 종료 됩니다.");
				flag = false;
				// 메서드내에서 종료할거면 return;
				// 어떨 때 retrun? break? - > while문이 종료되고 코드가 진행되어야 할 때 break
			}
		}
	}

}
