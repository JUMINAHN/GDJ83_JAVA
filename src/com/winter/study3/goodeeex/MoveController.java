package com.winter.study3.goodeeex;

import java.util.Scanner;

public class MoveController {

//	public Goodee move() {
//		// 반 한개 생성
//		Goodee gd = new Goodee();
//		gd.className = "C반";
//		gd.studentCount = 14;
//		gd.teacherName = "김대기 선생님";
//		// System.out.println("학생이 집으로 갑니다.");
//		return gd;
//	}

	public Goodee[] allMake() {
		// 구디 아카데미 자체
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 반이 있습니까?");
		int count = sc.nextInt();
		Goodee[] gds = new Goodee[count]; // goodee 방 개수(몇개만들지) 설정 -> null로 빈방, 반을 배정하지않으면 반구별못함
		for (int i = 0; i < gds.length; i++) {
			gds[i] = new Goodee(); // 반을 만들어서 방에 한 반씩 배정 --> null상태에 인 곳에 넣으면 배정된 반이 차지
		}
		return gds; // 방과 배정반이 있는 상태
	}

}
