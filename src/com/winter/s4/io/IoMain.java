package com.winter.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {
	// 개념만 보면 됨
	// stream == 연결선 ex) 종이컵 전화기 생각
	// 양방향 통신을 위해 두개 필요 (상대와 교차)
	// abc를 보내고 싶은데 a -> 01, b -> 01 c -> 01로 받아서 -> 디지털 신호로 다시 변환
	public static void main(String[] args) { // main에서 예외 터지면 jvm에서 처리 --> 걍 끝
		// 키보드에서 입력받은 것을 프로그램으로 받는다. (키보드는 0과 1)
		// 추상 클래스
		// bit를 받는다 --> 이진데이터
		InputStream is = System.in; // Scanner
		// 상기값을 구현한게 하기
		// 이걸 모아서 문자로 받는 애가 필요함 == char 처리
		InputStreamReader ir = new InputStreamReader(is);
		// String을 만드는 애가 필요하다.
		BufferedReader br = new BufferedReader(ir); // 입력받을 준비가 끝난 것
		// 아직까지 연결만 한 것 --> 입력하지 않은 것
		System.out.println("입력하세요 : "); // Scanner의 구성을 만들어보는 것 --> 그래서 원리만 알면됨
		// br에 담겨져있을 것
		String s = null; // 초기화하지 않으면 쓸 수 없다.
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한줄 읽어오는 것
		System.out.println(s); // 내보내는 것
		// 내보내겟다 out, 가져오겠다 input
	}

}
