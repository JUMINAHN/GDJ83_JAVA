package com.winter.study3.ex1;

public class GameController { // 메뉴선택 -> 공격 or 마을 -> 선택한 것을 main에서 하고 오자
	// 몬스터 생성 클래스를 따로 만들자
	public void start() {
		System.out.println("start 메서드 실행");
		// 몬스터 생성 1마리, 그룹으로 생성 3마리
		// 만든 몬스터 여기서 사용
		MonsterFactory mf = new MonsterFactory();
		Monster0 m = mf.createMonster(); // 몬스터 만들어줘 --> 몬스터 객체값 반환
		System.out.println(m.name);
		System.out.println(m.level);

		Monster0[] monsters = mf.createMonsterGroup(); // 몬스터 들
		for (int i = 0; i < monsters.length; i++) {
			System.out.println("===================");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].level);
		}
	}
}
