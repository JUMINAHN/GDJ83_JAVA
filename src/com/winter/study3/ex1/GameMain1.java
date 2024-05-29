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
		m.type = "오크";
		m.hp = 100;
		m.level = 1;
		m.point = 50;

		System.out.println("이름 : " + m.name);
		System.out.println("종족 : " + m.type);
		System.out.println("체력 : " + m.hp);
		System.out.println("레벨 : " + m.level);
		System.out.println("경험치 : " + m.point);

		Dokki d = new Dokki();
		d.name = "도끼";
		d.dmg = 100;
		d.meter = 1;
		d.power = 100;
		d.inner = 5;

	}

}
