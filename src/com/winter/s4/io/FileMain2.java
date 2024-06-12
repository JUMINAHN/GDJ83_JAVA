package com.winter.s4.io;

import java.io.File;

public class FileMain2 {
	public static void main(String[] args) {
		// study 2 폴더 삭제 --> 파일이나 폴더를 삭제하고 study 2 삭제해야함
		// Q.파일을 삭제해보자~
		File f = new File("C:\\study2");
		File[] ar = f.listFiles(); // 파일 객체로 변경되어서 가져옴
		for (File a : ar) {
			a.delete();
		}
		f.delete();
	}
}
