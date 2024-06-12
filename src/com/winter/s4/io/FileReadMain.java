package com.winter.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
//Scanner는 키보드라는 자원과 연결하는 것 --> 원래 끊어줘야 함 --> sc.close();
	public static void main(String[] args) {
		// 메모장의 첫줄을 읽어옴
		File file = new File("C:\\study", "study.java");
		BufferedReader br = null; // 문자를 모아서 문자열로 바꿔주는 보조 클래스
		FileReader fr = null;
		try {
			fr = new FileReader(file); // 니가 읽어올 파일의 경로를 적어라~ --> 문자 취급
			br = new BufferedReader(fr); // 매개변수로 reader로 넣음 --> 문자열로
			// 여러줄 읽고 싶어요
			while (true) {
				String s = br.readLine(); // 한줄 읽는 것 -> return 스트링으로
				// 한줄 읽으면 커서가 떨어짐
				// 한글자씩 읽어옴 --> int로 받아서 char로 형변환 하는 것******
				// 읽고나서 없으면 null이 나옴
				if (s == null) { // 즉 더이상 갈 때가 없으면
					break;
				}
				System.out.println(s);
			}

		} catch (Exception e) { // 예외발생할 수 있다 -> 파일 없으면 어쩔겁니까?
			e.printStackTrace(); // 연결된 자원을 끊어줘야 한다.
		} finally {
			// 자원해제 -> 연결된 순서의 역순
			try {
				br.close(); // 못 끊으면 어쩔꺼냐
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}
}
