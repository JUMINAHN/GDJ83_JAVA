package com.winter.s2;

public class Korea { // class public
	private int pop; // 인구수 --> 멤버변수 private
	private String name;
	private String song;
	private String flower;
	private String capital;

	// 외부에서 데이터를 보호하기 위해서 접근 지정자를 쓴다

	public int getPop() { // 메서드 private
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
