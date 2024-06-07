package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb; // null값****

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
	}

	// Quiz init() 메서드 완성하기

	public ArrayList<ProductDTO> init() { // return
		// 상기 내역을 파싱해서 --> product DTO 객체에 맞는 값을 집어 넣자
		// 얘네를 이제 ArrayList에 만들어 집어 넣자!
		String sb2 = sb.toString();
		StringTokenizer st = new StringTokenizer(sb2, ",");
		ArrayList<ProductDTO> ar = new ArrayList(); // productDTO 제네릭해줘

		while (st.hasMoreTokens()) { // int string int
			// 배열
			ProductDTO p = new ProductDTO();
			p.setPrice(Integer.valueOf(st.nextToken().trim()));
			// p.setPrice(Integer.parseInt(st.nextToken().trim()));
			p.setName(st.nextToken().trim());
			p.setStock(Integer.valueOf(st.nextToken().trim()));
			// p.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(p);
		}

//		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i).getPrice());
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getStock());
//		}

		return ar;
	}
}
