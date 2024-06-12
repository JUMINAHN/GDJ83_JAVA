package com.winter.s4.io;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일에 입출력하기 전 파일에 대한 정보를 알아야 함
		// 파일 정보를 담고 있는 객체

		// \t 탭하라는 특수문자, \\ << \를 표시하고 싶으니까
		System.out.println();
		File file = new File("C:\\study"); // 알고싶은 파일의 폴더나 경로 --> 이건 폴더
		System.out.println(file.exists()); // 파일이 실제로 있습니까?
		System.out.println(file.isDirectory()); // is로 시작되면 boolean 타입 리턴 --> 얘가 폴더입니까?
		System.out.println(file.isFile()); // 파일입니까?
		System.out.println(file.getName()); // 파일의 이름 : 파일명, 폴더의 이름 : 폴더명
		System.out.println(file.length()); // 폴더, 파일의 크기
		System.out.println("============");

		// file = new File("C:\\study", "test.txt"); // String string --> 앞에는 폴더 그 밑에
		file = new File(file, "sub"); // 위와 같은것
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		file.mkdir(); // directory == 즉 폴더를 만들어라 --> 이미 만들어져있음
		// 있으면 안만들겠다~
		if (!file.exists()) {
			file.mkdir();
		}

		file = new File("c:\\study\\sub2\\student"); // 못만든다.. --> 최종적으로 만드려는게 student
		// 근데 sub2의 폴더가 없으니까 못만드는 것임 --> 즉 바로 밑에는 만들 수 있음
		// 부모가 없으면 만들지 뮷함
		// file.mkdir(); // 만들어라~
		file.mkdirs();// 없는것은 만들면서 내려가라~
		// createNewFile --> 파일만드는 것 == mkdir처럼

		file = new File("C:\\study\\test.txt");
		// 이 파일을 삭제 --> 폴더에 가보면 사라져있다.
		file.delete();

		file = new File("C:\\study\\sub");
		file.delete(); // 사라지지 않음
		// 폴더같은 경우 지우려면 안에가 비어있어야 함

		file = new File("C:\\study\\sub2"); // 내부에 폴더있으면 지워지지 않음
		file.delete();

		file = new File("C:\\study");
		String[] ar = file.list(); // list -> String 배열 --> 파일리스트를 확인함
		for (String s : ar) {
			System.out.println(s);
		}

		File[] e = file.listFiles(); // 내부안에 파일과 폴더를 구분함
		for (File f : e) {
			if (f.isFile()) {
				System.out.println("파일입니다 : " + f);
			} else if (f.isDirectory()) {
				System.out.println("폴더입니다 : " + f);
			}
		}

	}
}
