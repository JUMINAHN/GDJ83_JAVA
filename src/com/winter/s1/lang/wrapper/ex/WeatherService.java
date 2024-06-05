package com.winter.s1.lang.wrapper.ex;

public class WeatherService {
	// Controller -> 계층중 하나
	// Business Layer (층) -> 실제 코드 해야되야할 거, 데이터 전처리 후처리
	// DAO Layer - 데이터 베이스에 접근하는 객체
	private StringBuffer sb; // null

	public WeatherService() { // 기본 생성자
		this.sb = new StringBuffer(); // null이 아닌 객체 생성 -> 새로운 것을 만들어서 집어넣는다
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 1개의 weatehrDTO
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80"); // 4개 다들어가 있음
	}

	public void init() {
		String info = this.sb.toString();
		System.out.println(info);

		info = info.replace(",", "-");

		String[] infos = info.split("-");
		for (int i = 0; i < infos.length; i++) {
			infos[i] = infos[i].trim(); // ar[i]에 모든 데이터가 담겨있음
		}

		//선생님 풀이
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4]; //4번의 객체가 있어야함 --> 그림을 그려넣는게 정확함
		//dtos[?] = WeatehrDTO를 때려넣는 것
		for(int i=0; i < dtos.length; i++) {
			dtos[i] =
		}
	}

}
