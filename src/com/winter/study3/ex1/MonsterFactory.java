package com.winter.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	// 몬스터 한마리 생성 메서드
	public Monster0 createMonster() {
		// 몬스터 한마리 만들기 --> 몬스터 객체 생성 (몬스터 만드는 과정 쓰기)
		Monster0 m = new Monster0(); // 1마리 만들고
		return m; // 몬스터의 주소를 알면 재사용 가능
	}

	public Monster0[] createMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2; // random.nextint(); 0~4사이 정수하나 (0,1,2,3,4)
		Monster0[] monsters = new Monster0[count];

		for (int i = 0; i < count; i++) {
			// m1[i] = new Monster0(); // 몬스터 개수만큼 생성됨 --> 만든 몬스터를 몬스터를 모아놓는 애들에게 가서 i번째
			// 방에다가 가둬놓자
			Monster0 m = new Monster0();
			monsters[i] = m;
		}
		return monsters;

	}
}
