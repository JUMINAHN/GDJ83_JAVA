package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudy {

	public void read() { // 이 메서드를 호출하면 파일을 읽어올 것임
		// info Text파일을 읽어오기
		// 한줄씩 일어오면 안되니까
		// 1.항목별로 파씽 -> 읽어서 파씽 후 출력
		File file = new File("C:\\study", "info.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file); // 예외 발생
			br = new BufferedReader(fr);
			while (true) {
				String s = br.readLine(); // 예외 발생 --> 한줄씩 읽으니까
				String[] ar = s.split(",");
				if (s == null) {
					break;
				}
				for (String ss : ar) {
					System.out.println(ss.trim());
				}
			}
			// 반복문을 돌리자 --> 문자열로 출력
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); // 닫아줘야하니까 위에 값이 있어야 함
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}
}
