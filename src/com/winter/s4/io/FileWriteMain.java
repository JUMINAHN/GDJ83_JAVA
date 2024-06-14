package com.winter.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
	public static void main(String[] args) {
		// 읽는애랑, 보조스트링 --> Read
		// Data는 문자열 -> 문자 -> 0과1

		// 문자열 -> 문자 -> 01
		Scanner sc = new Scanner(System.in);
		// boolean flag = true;
		System.out.println("저장할 파일명을 입력 : ");
		String fileName = sc.next();
		File file = new File("C:\\study", fileName); // 덮어쓰기가 됨
		FileWriter fw = null;
		try {
			// 기존에 파일명이 있다면 기본은 덮어 씌우기 (false)
			// append 즉 추가 (기존 내용 연결) -> false
			while (true) {
				fw = new FileWriter(file, true);
				System.out.println("내용을 입력하세요 : ");
				String s = sc.next();
				if (s.equals("E") || s.equals("e")) { // upper lower 다 상관없음
					break;
				}
				fw.write(s + "\r\n"); // write는 보조 스트림을 쓸 필요가 없게 String을 담을 수 있는 타입이 있음 --> 작성
				// buffer를 밀어내고 다시땡겨오는 것 --> 네트워크를 통할때
				// **??
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
}
