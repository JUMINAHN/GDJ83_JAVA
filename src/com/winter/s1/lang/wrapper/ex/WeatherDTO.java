package com.winter.s1.lang.wrapper.ex;

public class List<WeatherDTO> {
	// DTO의 모든 멤버 변수는 private로 설정한다.
	// getter * setter 필요

	// 도시명
	private String city; // 서울이면 서울 부산이면 부산
	// 기온
	private double gion; // ex)16.9도
	// 눈, 태풍, 비 == 현재 상태(날씨정보)
	private String status;
	// 습도
	private int humidity;

	// 생성자는 여러개 만들어도 상관이 없지만, 기본생성자는 필수

	// getter - setter
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
