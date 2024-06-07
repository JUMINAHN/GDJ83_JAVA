package com.winter.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {
	// 프로그램을 짠다 == 데이터를 핸들링한다
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
		// productService.addProudct(ar);
		productService.removeProduct(ar);

		// 안찍어보면 삭제가 된지, 추가하면 추가가 된지 안했는지 모름
		// 성공하면 1을 리턴하고 실패하면 0을 리턴하도록 하자

		System.out.println("프린트 삭제가 성공했습니다.");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());
			System.out.println("=================");
		}

	}

}
