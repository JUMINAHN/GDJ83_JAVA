package com.winter.s6.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;// 외부 사용 가능
	private OutputStream os;
	private OutputStreamWriter ow;// 외부 사용 가능
	// 2. 멤버변수로 선언 --> 여러곳에서 사용 가능

	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	// 1. 연결 --> socket에서 데이터를 꺼내고 보내기 :: socket은 전화기랑 같다.
	public void getConnection() throws Exception {
		// socket통신 --> 상대방의 ip or port번호 ,, 상대방이 없으면 자기자신
		socket = new Socket("localhost", 8282);
		// 1.return을 socket으로 해주던가
		// 양방향 통신 -> inputstream, outputstream 하면됨
		// input스트림 소켓에서 꺼내와야 한다.

		// input
		is = socket.getInputStream();
		ir = new InputStreamReader(is); // reader는 문자열 한글자만
		br = new BufferedReader(ir); // 읽고 싶으면 -> socket연결 br만 있으면 됨
		// output
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

		// 2개 리턴 불가 -> 하나로 만들어야 함 br + ow
		// 2개를 멤버로 하는 클래스, 컬렉션 배열 --> 배열, list, set, map

	}

	// 2. 연결 --> 연결된 순서 역순
	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();
	}

}
