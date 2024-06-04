package com.winter.s1.lang.wrapper.ex;

public class WeatherServiceRe {
	// Controller -> 계층중 하나
	// Business Layer (층) -> 실제 코드 해야되야할 거, 데이터 전처리 후처리
	// DAO Layer - 데이터 베이스에 접근하는 객체
	private StringBuffer sb; // null

	public WeatherServiceRe() { // 기본 생성자
		this.sb = new StringBuffer(); // null이 아닌 객체 생성 -> 새로운 것을 만들어서 집어넣는다
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 1개의 weatehrDTO
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80"); // 4개 다들어가 있음
	}

	public void init() {
		String info = this.sb.toString();
		String info2 = info.replace(",", "-");

		String[] ar = info2.split("-");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i].trim();
		}

//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]); // 다 뗀거 확인 --> 기본 출력
//		}

		WeatherDTO wAr[] = new WeatherDTO[ar.length / 4]; // 4군데 넣을거야
		// wetaherDTO의 배열만 있는 것이고 -> 실제 Weather dto가 만들어지지 않는 것******
		for (int i = 0; i < wAr.length; i++) {
			WeatherDTO w = new WeatherDTO(); // 객체를 생성해서 배열에 넣어줘야함***
			wAr[i] = w;
		}

		// 하기 패턴을 쓸 것
		// ar length를 어떻게 증가시킬 것이냐~
		for (int i = 0; i < wAr.length; i++) {
			for (int j = 0; j < ar.length; j = j + 4) {
				wAr[i].setCity(ar[j]);
				wAr[i].setGion(Double.parseDouble(ar[j + 1]));
				wAr[i].setStatus(ar[j + 2]);
				wAr[i].setHumidity(Integer.parseInt(ar[j + 3]));
			}
		}

		for (int i = 0; i < wAr.length; i++) {
			for (int j = 0; j < ar.length; j = j + 4) {
				System.out.print(wAr[i].getCity());
				System.out.print(wAr[i].getGion());
				System.out.print(wAr[i].getStatus());
				System.out.print(wAr[i].getHumidity());
			}
		}
	}

}
// WeatherDTO a = new WeatherDTO();
//		WeatherDTO w[] = new WeatherDTO[4];
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < 4; j++) {
//				WeatherDTO a = new WeatherDTO();
//				w[j] = a;
//				if (i % 4 == 0) {
//					w[j].setCity(ar[0]);
//				} else if (i % 4 == 1) {
//					w[j].setGion(Double.parseDouble(ar[1]));
//				} else if (i % 4 == 2) {
//					w[j].setStatus(ar[2]);
//				} else if (i % 4 == 3) {
//					w[j].setHumidity(Integer.parseInt(ar[4]));
//				}
//			}
//		}

//		WeatherDTO w = new WeatherDTO();
//		w.setCity(ar[0]);
//		w.setGion(Double.parseDouble(ar[1]));
//		w.setStatus(ar[2]);
//		w.setHumidity(Integer.parseInt(ar[3]));

//		System.out.println(w.getCity());
//		System.out.println(w.getGion());
//		System.out.println(w.getHumidity());
//		System.out.println(w.getStatus());
