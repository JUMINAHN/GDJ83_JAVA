package com.winter.study3.student;

import java.util.Scanner;

public class StudentService {
	// 자바 모두 데이터타입
	// 학생 수 만큼 정수배열 만들어서 리턴
//	public int[] makeStudent() { // int 타입 배열 반환*****
//		Scanner sc = new Scanner(System.in);
//		// 같은 데이터 타입을 묶는 것
//		System.out.println("학생의 수를 입력하세요 : ");
//		// 학생 수 만큼 정수배열을 만들어서 return하세요 --> 호출한 측에서 사용할 수 있도록
//		int count = sc.nextInt();
//
//		// 학생들을 모을 배열을 리턴하고 싶은 것
//		int[] ar = new int[count];
//		return ar;
//	}

	public Student[] makeStudent() { // 학생들을 모을 배열을 리턴해라// 학생 한명을 만들어서 return해라
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student[] student = new Student[count]; // 배열만 만들어놓은 상황이니까
		for (int i = 0; i < student.length; i++) { // 배열은 공간만 만들어놓은거지 실제 학생이 들어가 있진 않음
			// 빈방에 학생을 넣어줘야함
			student[i] = new Student(); // --> 학생 자체를 만들어서 넣어줘야함 **** --> 클래스 사용하려면 객체부터 만들기!!!!!!!
			System.out.println("이름을 입력해주세요");
			student[i].name = sc.next();
			System.out.println("번호를 입력해주세요");
			student[i].num = sc.nextInt();
			System.out.println("국어 점수를 입력해주세요");
			student[i].kor = sc.nextInt();
			System.out.println("영어 점수를 입력해주세요");
			student[i].eng = sc.nextInt();
			System.out.println("수학 점수를 입력해주세요");
			student[i].math = sc.nextInt();
			student[i].total = student[i].math + student[i].kor + student[i].eng;
			student[i].avg = student[i].total / 3.0;
			// **logic 그려보기
			// ******정말 많이 사용
			// 학생객체를 만들고->주소를 넣는 것
		}
		return student;
	}

//		for (int i = 0; i < st.length; i++) {
//			System.out.println("학생 수 : " + i);
//		}

}
