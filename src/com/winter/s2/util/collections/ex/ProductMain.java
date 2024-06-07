package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {
	// 프로그램을 짠다 == 데이터를 핸들링한다
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
		productService.addProudct(ar);
		;

		// 배열의 내용 가져오는 것 --> get 활용
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());
			System.out.println("=================");
		}

	}

}
