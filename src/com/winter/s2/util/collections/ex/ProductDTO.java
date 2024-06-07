package com.winter.s2.util.collections.ex;

//DTO --> data transfer object;
public class ProductDTO {
	// 멤버변수는 전부다 private
	private Integer price; // 어짜피 int도 autoboxing 되니까 --> null이들어갈 수 있기 때문에 많이 사용
	private String name; // 제품명
	private Integer stock; // 수량 몇개냐?

	// 생성자 필요

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
