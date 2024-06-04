package com.winter.s1.lang.wrapper.ex;

public class WeatherService {
	// Controller -> 계층중 하나
	// Business Layer (층) -> 실제 코드 해야되야할 거, 데이터 전처리 후처리
	// DAO Layer - 데이터 베이스에 접근하는 객체
	private StringBuffer sb; // null

	public WeatherService() { // 기본 생성자
		this.sb = new StringBuffer(); // null이 아닌 객체 생성 -> 새로운 것을 만들어서 집어넣는다
		this.sb.append("서울 , 29.3 - 맑음 - 60");
	}

	public void init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = this.sb.toString(); // 내객체의 sb의 내용 --> this 생략 가능

		// Quiz2 -> split -> parsing 작업 : 하나의 문자열 여러개 나누는 것

		// Quiz4 잘될 수 있도록 해결해주세요 --> trim으로 지우고, replace로 공백제거
		String info2 = info.replace(",", "-");
		String[] ar = info2.split("-");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i].trim();
		}

		// Quiz 3 서울 데이터를 city, gion에 status, humidity에 넣어주세요
		WeatherDTO w = new WeatherDTO();
		w.setCity(ar[0]);
		w.setGion(Double.parseDouble(ar[1]));
		w.setStatus(ar[2]);
		w.setHumidity(Integer.parseInt(ar[3]));
//		System.out.println(w.getCity());
//		System.out.println(w.getGion());
//		System.out.println(w.getHumidity());
//		System.out.println(w.getStatus());
	}

}
