package com.winter.s2.util.collections.ex;

public class Account { // 이걸 모아서 하나의 통장이라고 하자
	private long number; // 계좌번호
	private String name; // 소유자, 예금주
	private String bank; // 은행명
	private String title;
	private long money; // 잔고
	private String password; // 1234지만 --> 0으로 시작될 수 있기 때문에

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
