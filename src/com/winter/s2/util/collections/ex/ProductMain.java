package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {
	// 프로그램을 짠다 == 데이터를 핸들링한다
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
		// productService.addProudct(ar);
		productService.removeProduct(ar);

		// 이전 배열은 기존 배열을 받아서 한개늘린 배열을 새로만들고, 새로만든 배열을 return 해줬음
		// 이젠 안해도 됨, 얘는 마음대로 늘렸다가 줄였다가 할 수 있음
		// 기존 주소에 추가해서 늘리고 줄이고 하는 것이다.
		// 배열의 내용 가져오는 것 --> get 활용
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());
			System.out.println("=================");
		}

	}

}
