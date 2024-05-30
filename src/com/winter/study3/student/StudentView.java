package com.winter.study3.student;

public class StudentView {

	public void view3(String str) {
		System.out.println(str);
	}

	public void view2(Student student) {
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
