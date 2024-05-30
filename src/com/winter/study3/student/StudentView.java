package com.winter.study3.student;

public class StudentView {
	// 개발자는 경우의수만큼 만들어야함

	// 메서드 오버로딩
	public void view(String str) { // 타입이 다르고, 타입 순서가 다르고, 받는타입이 다른 유형이기 때문에 메서드이름 동일
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
	}

	public void view(Student[] students) { // 어떻게 받아올 것이냐?
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			System.out.println(s.name);
			System.out.println(s.avg);
		}
	}
}
