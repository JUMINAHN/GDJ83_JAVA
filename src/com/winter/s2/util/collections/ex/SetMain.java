package com.winter.s2.util.collections.ex;

import java.util.HashSet;

//많이쓰는거 arraylist, 그다음에 map
public class SetMain { // set이라는 인터페이스다~ --> set은 HashSet을 많이쓴다.
	// 순서의 정함이 없다

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("frist");
		hs.add("second");
		hs.add("apple");
		hs.add("second"); // 똑같은 값이 들어오면 하나는 버려버린다.
		// 중복된 값을 원치않을 때 많이 사용한다.
		// 참조변수 찍으면 내부적으로 toString -> toString 오버라이딩
		System.out.println(hs); // 찍어보면 순서유지가 안됨 -> 정렬해서 넣어주는 것

		HashSet<ProductDTO> hs2 = new HashSet(); // object타입
		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();
		//hs2.add(productDTO2); // 둘다 다르다 --> 다른주소라서 다른값으로 인식 됨

		productDTO2 = productDTO;
		hs2.add(productDTO);
		System.out.println(hs2);
	}

}
