package com.winter.study3.ex1;

public class GameMain1 {
//	String name;
//	String type; //종족
//	int hp;
//	int level;
//	int point; //경험치
	public static void main(String[] args) {
		Monster m = new Monster();
		m.name = "오크1";
		m.type = "오크"; // 몬스터가 종족을 가지고 있다.
		m.hp = 100;
		m.level = 1;
		m.point = 50;

		Dokki d = new Dokki();
		d.name = "이빠진도끼"; // 도끼는 이름을 가지고 있다.
		d.dmg = 10;
		d.meter = 1;
		d.power = 1;
		d.inner = 5;

		// 이 몬스터에게 도끼를 줘야함
		m.axe = d;
		System.out.println(m.axe.name);
		d = new Dokki(); // 새로운 주소를 넣겠다
		d.name = "황금도끼";
		System.out.println(m.axe.name); // 그림으로 로직 그려보기

		Monster m2 = new Monster();
		m2.axe = d;

//		System.out.println("이름 : " + m.name);
//		System.out.println("종족 : " + m.type);
//		System.out.println("체력 : " + m.hp);
//		System.out.println("레벨 : " + m.level);
//		System.out.println("경험치 : " + m.point);

	}

}
