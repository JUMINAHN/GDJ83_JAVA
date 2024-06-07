package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb; // null값****

	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
	}

	// 선생님 풀이
	public ArrayList<ProductDTO> init() {
		String datas = this.sb.toString();
		ArrayList<ProductDTO> ar = new ArrayList(); // productDTO 제네릭해줘
		StringTokenizer st = new StringTokenizer(datas, ",");
		// 돌렸을 떄 어떻게 나올까 예상 --> 추측한 그대로 나오는가:
		while (st.hasMoreTokens()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			productDTO.setName(st.nextToken().trim());
			productDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			ar.add(productDTO);
		}
		return ar;
	}

	// 기존의 가방에다가 새상품을 추가 --> ArrayList에
	// void 이건 수정 불가 --> 선언부 수정 불가
	// 하기에 새로운 상품을 만드는 것 --> 새로운 상품 new ProductDTO를 해라~
	// 상품 이름도 없고 재고도 없는 것을 입력받아서 만든 상품을 기존의 가방에 추가하자~
	// 기존 가방을 받아와서 해라~
	// 추가하고 메인으로 돌아갔을 때 for문 돌아가서 찍었을 떄 새로운 제품까지 찍는다.
	public void addProudct(ArrayList<ProductDTO> ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품의 가격을 입력하세요 : ");
		Integer price = sc.nextInt();
		System.out.println("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.println("상품의 수량을 입력하세요 : ");
		Integer quantity = sc.nextInt();

		ProductDTO pd = new ProductDTO();
		pd.setName(name);
		pd.setPrice(price);
		pd.setStock(quantity);
		// 넣은 것 배열에 추가
		ar.add(pd);
	}

}
