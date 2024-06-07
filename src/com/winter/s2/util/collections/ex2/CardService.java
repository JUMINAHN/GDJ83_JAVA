package com.winter.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CardService {
	StringBuffer sb;
	Scanner sc = new Scanner(System.in);

	public CardService() {
		this.sb = new StringBuffer();
		sb.append("라인 , 김라인-line@line.com-11112222-");
		sb.append("네이버- 오이버 -ohver@naver.com- 33334444-");
		sb.append("토스-박토스 ,parkto@toss.com-55556666- ");
		sb.append("카카오-황카오-hwangka@kakao.com,77778888");
	}

	public ArrayList<CardDTO> init() {
		String sb2 = this.sb.toString();
		sb2 = sb2.replace(",", "-");
		StringTokenizer st = new StringTokenizer(sb2, "-");
		ArrayList<CardDTO> ar = new ArrayList();

		while (st.hasMoreTokens()) {
			CardDTO dto = new CardDTO();
			dto.setCompany(st.nextToken().trim()); // String 값을 넣는다.
			dto.setName(st.nextToken().trim());
			dto.setEmail(st.nextToken().trim());
			dto.setPhonenumber(Integer.valueOf(st.nextToken().trim()));
			ar.add(dto);
		}
		return ar;
	}

	// 추가
	public void addCard(ArrayList<CardDTO> ar) { // 추가
		CardDTO dto = new CardDTO();
		System.out.println("명함 담당자의 회사를 입력해주세요 : ");
		dto.setCompany(sc.next());
		System.out.println("명함 담당자의 이름을 입력해주세요 : ");
		dto.setName(sc.next());
		System.out.println("명함 담당자의 전화번호 8자리를 입력해주세요 : ");
		dto.setPhonenumber(sc.nextInt());
		System.out.println("명함 담당자의 이메일을 입력해주세요 : ");
		dto.setEmail(sc.next());

		ar.add(dto);
	}

	// 삭제
	public void removeCard(ArrayList<CardDTO> ar) {
		System.out.println("찾을 담당자의 이름을 입력해주세요 : ");
		String name = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				break;
			}
		}
	}

}
