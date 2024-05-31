package com.winter.s1;

//Student를 확장해서 MidStudent를 만들자!
//Student를 상속받자~
public class MidStudent extends Student {
	// 똑같은 코드를 또 쓰고 새로운 내용을 추가하게 되는,, 비효율적
	// 따라서 해결 -> 물러받은것에서 확장시키자
	// 자기거만 추가하자~

	public MidStudent() { // 객체를 만드려면 무조건 생성자 호출 -> 부모객체를 만들고 자기를 만드는 것(생성자)
		// 객체를 만들기 위해선 생성자를 만들어야 함 == super()

		// super(); //생략되어있음 -> 부모의 생성자(Student를 먼저 생성을 하고, history를 추가해주는 것)
		// 잘 사용하진 않을 것 -> 특별한 일 없으면 부ㅁ는 기본생성자
		// 기본생성자가 없는데 기본 생성자를 호출하려고 하니까 오류(부모에 없다는 것)
		// this처럼 첫줄에 있어야 함
	}

	public void midInfo() {
		// this.num ==> 안됨 (num의 접근제어자 private)
		// 확장
		// 부모를 만들고 자식을 확장하는 것 (자식에서 부모를 가져오려고 하는 것) --> getter
		super.info(); // 부모 객체의 주소를 담고 있는 참조변수 --> history빼고 (잘안씀)
		// 부모 객체를 찾아가는 것
		System.out.println(this.history);
	}

	private int history;

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
