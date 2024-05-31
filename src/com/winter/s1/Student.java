package com.winter.s1;

//초등학생꺼
public class Student {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int totals;
	private double avgs;

	public Student() {

	}

	public Student(int num) {
		super();
		this.num = num;
	}

	public void info() {
		System.out.println(this.num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotals() {
		return totals;
	}

	public void setTotals(int totals) {
		this.totals = totals;
	}

	public double getAvgs() {
		return avgs;
	}

	public void setAvgs(double avgs) {
		this.avgs = avgs;
	}

}
