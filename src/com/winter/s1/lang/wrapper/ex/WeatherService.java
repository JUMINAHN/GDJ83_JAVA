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
		String info2 = info.replace(",", "-");

		String[] ar = info2.split("-");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i].trim(); // ar[i]에 모든 데이터가 담겨있음
		}

		// wetaherDTO의 배열만 있는 것이고 -> 실제 Weather dto가 만들어지지 않는 것****** **그림을 그리면
		// 답이나온다!!!!!
		WeatherDTO wAr[] = new WeatherDTO[ar.length / 4]; // 4군데 넣을거야
		for (int i = 0; i < wAr.length; i++) {
			WeatherDTO w = new WeatherDTO(); // 객체를 생성해서 배열에 넣어줘야함***
			wAr[i] = w;
		}
		for (int i = 0; i < ar.length / 4; i++) {
			wAr[i].setCity(ar[i * 4]);
			wAr[i].setGion(Double.parseDouble(ar[i * 4 + 1]));
			wAr[i].setStatus(ar[i * 4 + 2]);
			wAr[i].setHumidity(Integer.parseInt(ar[i * 4 + 3]));
		}

//		for (int i = 0; i < ar.length / 4; i++) {
//			System.out.print(wAr[i].getCity());
//			System.out.print(wAr[i].getGion());
//			System.out.print(wAr[i].getStatus());
//			System.out.println(wAr[i].getHumidity());
//			System.out.println("======");
//		}

		// 하기 패턴을 for구문으로..
		/*
		 * wAr[0].setCity(ar[0]); wAr[0].setGion(Double.parseDouble(ar[1]));
		 * wAr[0].setStatus(ar[2]); wAr[0].setHumidity(Integer.parseInt(ar[3]));
		 * 
		 * wAr[1].setCity(ar[4]); wAr[1].setGion(Double.parseDouble(ar[5]));
		 * wAr[1].setStatus(ar[6]); wAr[1].setHumidity(Integer.parseInt(ar[7]));
		 * 
		 * wAr[2].setCity(ar[8]); wAr[2].setGion(Double.parseDouble(ar[9]));
		 * wAr[2].setStatus(ar[10]); wAr[2].setHumidity(Integer.parseInt(ar[11]));
		 * 
		 * wAr[3].setCity(ar[12]); wAr[3].setGion(Double.parseDouble(ar[13]));
		 * wAr[3].setStatus(ar[14]); wAr[3].setHumidity(Integer.parseInt(ar[15]));
		 */

	}

}

//		WeatherDTO w = new WeatherDTO();
//		w.setCity(ar[0]);
//		w.setGion(Double.parseDouble(ar[1]));
//		w.setStatus(ar[2]);
//		w.setHumidity(Integer.parseInt(ar[3]));

//		System.out.println(w.getCity());
//		System.out.println(w.getGion());
//		System.out.println(w.getHumidity());
//		System.out.println(w.getStatus());
