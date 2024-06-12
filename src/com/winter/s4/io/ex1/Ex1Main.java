package com.winter.s4.io.ex1;

import java.util.ArrayList;

public class Ex1Main {
	public static void main(String[] args) {
		ReadStudy r = new ReadStudy();
		ArrayList<MenuDTO> ar = r.read();
		for (MenuDTO a : ar) {
			System.out.println(a.getMenuName());
			System.out.println(a.getKcal());
			System.out.println(a.getPrice());
			System.out.println("==========");
		}
		System.out.println("종료");
	}
}
