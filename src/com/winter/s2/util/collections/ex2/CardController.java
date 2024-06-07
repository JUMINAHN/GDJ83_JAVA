package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardController {
	// CardDTO dto;
	ArrayList<CardDTO> ar;
	CardService service;
	CardView view;

	public CardController() {
		this.service = new CardService();
		this.ar = this.service.init();
		this.view = new CardView();
	}

	public void start() {

		boolean flag = true;

		while (flag) {
			System.out.println("명함 관리 프로그램을 실행하였습니다. 번호를 선택해주세요");
			System.out.println("1. 명함 리스트 출력");
			System.out.println("2. 명함 리스트 추가");
			System.out.println("3. 명함 리스트 삭제");
			System.out.println("4. 명함 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			if (option == 1) {
				this.view.view(ar);
			} else if (option == 2) {
				this.service.addCard(ar);
			} else if (option == 3) {
				this.service.removeCard(ar);
			} else if (option == 4) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		}

	}
}