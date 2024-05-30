package com.winter.s1;

public class Member {

	// 꺼내서 뭔가 만들때 private 멤버변수
	// 비만관리회원프로그램
	private String name; // 이름
	private int age;

	public Member(String name, int age) { // 생성자 -> 새로운 객체 만듬 (값 안바꾸겠다)
		this.name = name;
		this.age = age;
	}

	// getter setter
	public int getAge() { // 값 수정
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 외부에서 넣고 뺄 수 없다. --> shitf alt s

}
