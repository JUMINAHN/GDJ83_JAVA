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
		StudentView studentView = new StudentView();
		while (flag) {
			System.out.println("1. 학생정보입력 2.전체정보출력 3.학생검색 4.종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("학생 정보를 입력하세요"); // 역할별로 코드 분리 -> 그 코드만 보러가면된다. -> 다른곳에서 재사용가능
				students = service.makeStudent(); // 학생 정보

			} else if (select == 2) {
				System.out.println("전체 정보 출력 코드 작성"); // 5월 30일 시작
				if (students != null) {
					studentView.view(students); // (5/30)students 반환** how logic ?? ----------------------------->매개변수
												// // 활용
				} else {
					studentView.view("학생정보를 먼저 입력하세요"); // --> 나중에 재활용을 위해
				}

			} else if (select == 3) {
				System.out.println("학생 정보를 검색하는 코드 작성"); // 학생들중에서 --> 스튜던트 배열
				// 내가 원하는 학생의 정보하나만 출력하고 싶다.
				// 학생번호로 정보 검색! --> 학생번호 입력받아서 일치하는 학생 찾는 것 -> 찾은 학생의 정보 출력
				Student student = service.findByNum(students);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.view("검색결과가 없습니다");
				}

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
