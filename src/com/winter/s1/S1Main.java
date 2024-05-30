package com.winter.s1;

import com.winter.s2.Korea;

public class S1Main {
	public static void main(String[] args) {
//		Test test = new Test();
//		test.num = 10; // 멤버변수를 사용 가능하다.
//
//		// Korea korea = new Korea();
//		// korea. name --> default 같은 패키지가 아니기 때문에
//
//		Member member = new Member();
//		member.name = "test";
//		member.age = 20;
//	}
		Korea korea = new Korea();
		korea.setPop(20); // 집어넣을 떄 setter
		int p = korea.getPop(); // 꺼낼때 get
		System.out.println(p);
	}
}