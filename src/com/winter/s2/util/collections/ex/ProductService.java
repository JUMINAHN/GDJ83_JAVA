package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb; // null값****
	Scanner sc = new Scanner(System.in);

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

	public void addProudct(ArrayList<ProductDTO> ar) {
		ProductDTO productDTO = new ProductDTO();
		System.out.println("상품명을 입력 : ");
		productDTO.setName(sc.next());
		System.out.println("가격 입력 : ");
		productDTO.setPrice(sc.nextInt());
		System.out.println("상품의 수량을 입력하세요 : ");
		productDTO.setStock(sc.nextInt());
		ar.add(productDTO);
	}

	// 기존의 가방을 받아서 삭제해라
	// 일치하는 물건의 이름을 입력받아서 삭제 ---> return할 필요가 없음
	public void removeProduct(ArrayList<ProductDTO> ar) {
		System.out.println("찾을 상품을 입력해주세요 : ");
		String item = sc.next();

		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getName().equals(item)) {
				ar.remove(ar.get(i));
			}
		}
	}

}