package com.winter.study3.student;

public class StudentMain {
	public static void main(String[] args) { // 프로그램시작
		StudentController sc = new StudentController();
		sc.start(); // start가 종료되어야 메모리삭제되고,(1)

	} // 프로그램 종료(2)
}
