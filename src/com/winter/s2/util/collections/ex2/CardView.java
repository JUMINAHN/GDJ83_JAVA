package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;

public class CardView {
	// 보여주기
	public void view(ArrayList<CardDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getCompany());
			System.out.println(ar.get(i).getEmail());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getPhonenumber());
			System.out.println("================");
		}
	}

}
