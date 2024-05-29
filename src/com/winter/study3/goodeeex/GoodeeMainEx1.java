package com.winter.study3.goodeeex;

import java.util.Scanner;

public class GoodeeMainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MoveController mv = new MoveController();
//		Goodee r = mv.move();
//		System.out.println("반 : " + r.className);
//		System.out.println("선생님 존함 : " + r.teacherName);
//		System.out.println("학생 수 :" + r.studentCount);

		Goodee[] r2 = mv.allMake(); // 배열 공간 즉 룸과 배열 안에 들어있는 반들
		for (int i = 0; i < r2.length; i++) {
			System.out.println("반이름 입력 : ");
			r2[i].className = sc.next();
			System.out.println("학생 수 입력 : ");
			r2[i].studentCount = sc.nextInt();
			System.out.println("선생님 존함 입력 : ");
			r2[i].teacherName = sc.next();
		}

		for (int i = 0; i < r2.length; i++) {
			System.out.println("반 이름 : " + r2[i].className);
			System.out.println("학생 수 : " + r2[i].studentCount);
			System.out.println("선생님 존함 : " + r2[i].teacherName);
			System.out.println("======");
		}

	}
}
