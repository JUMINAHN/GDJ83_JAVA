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
		while (true) {
			System.out.println("저장할 파일명을 입력, 원하지 않을 시 E or e : ");
			String fileName = sc.next();
			if (fileName.equals("E") || fileName.equals("e")) {
				break;
			}
			File file = new File("C:\\study", fileName); // 덮어쓰기가 됨
			FileWriter fw = null;
			try {
				// 기존에 파일명이 있다면 기본은 덮어 씌우기 (false)
				// append 즉 추가 (기존 내용 연결) -> false
				fw = new FileWriter(file, true);
				System.out.println("내용을 입력하세요 : ");
				String s = sc.next();
				fw.write(s + "\r\n"); // write는 보조 스트림을 쓸 필요가 없게 String을 담을 수 있는 타입이 있음 --> 작성
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
		}
		System.out.println("프로그램 종료");

	}
}
