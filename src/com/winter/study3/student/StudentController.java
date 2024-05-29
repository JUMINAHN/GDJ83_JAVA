package com.winter.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		System.out.println("student");

		// 1. 학생정보입력 2.전체정보출력 3.학생검색 4.종료
		Student[] students = null; // 배열의 개수와 --> 배열 각각에 학생 객체가 담김(초기)Q?
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentService service = new StudentService();
		while (flag) {
			System.out.println("1. 학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("학생 정보를 입력하세요"); // 역할별로 코드 분리 -> 그 코드만 보러가면된다. -> 다른곳에서 재사용가능
				students = service.makeStudent();
			} else if (select == 2) {
				System.out.println("전체 정보 출력 코드 작성");
				for (int i = 0; i < students.length; i++) {
					Student s = students[i];
					System.out.print(s.name);
					System.out.println(s.avg);
				}
				// students 배열안에 따라가야 학생정보 저장
			} else if (select == 3) {
				System.out.println("학생 정보를 검색하는 코드 작성");

			} else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				flag = false; // switch case에는 이게 유용 -> break기능
			} else {
				System.out.println("다시 정확한 숫자를 입력해주세요");
				continue;
			}

		}

	}
}
