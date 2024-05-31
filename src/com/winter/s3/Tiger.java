package com.winter.s3;

public class Tiger extends Animal { // Animal 상속받으려고 했는데 abstract 메서드가 있음
	// 해결을 위해서 해당 클래스도 abstract하는 것
	// 미완성 메서드를 해당 클래스에서 완성시키면 해결 (같은 이름 메서드 여러개)
	// 메서드 오버라이딩을 통해 해결~ (상속받은 메서드 재정의)
	// 메서드 선언부(Header)는 동일하게 -> 접근 제어자는 수정 가능 (같은 범위나 더 넓은 범위로는 수정 가능)

	int power;

	public void sleep() { // 바디 부분을 완성시켜라~
		System.out.println("누워자기");
	}
}
