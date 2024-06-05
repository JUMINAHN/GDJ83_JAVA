package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {

	private WeatherDTO[] dtos; // null
	private WeatherService weatherService;
	private WeatherView weatherView;

	// dtos, weatherservice, weatherView의 초기화는 내부 생성자에서 하세요 -> 매개변수없이
	public WeatherController() {
		this.dtos = new WeatherService().init(); // 값이 초기화되니까 -> 서비스로 배열을 받아오는 것
		this.weatherService = new WeatherService();
		this.weatherView = new WeatherView();
	}

	// start : 메서드명
	// 1. 날씨 전체 정보 출력 -> 1번 누르면 출력
	// 초기화된 것에서 시작
	public void start() {
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요// 1. 날씨 전체 정보 출력 or 2. 종료");
			int option = sc.nextInt();
			if (option == 1) { // 날씨 전체 정보 출력 (dtos에 있는 값이 출력)
				weatherView.view(dtos); // 내가만든것에서 할거에요 -> 출력코드를 내부에서 진행
			} else if (option == 2) {
				System.out.println("프로그램을 종료합니다."); // 2. 종료 -> 2번누를때까지 계속
				flag = false;
			}
		}
	}
	// 날씨정보를 어디서 받아야한다. => weatherService의 init로 호출하자

}
