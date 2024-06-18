package com.winter.s6.s6.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {
	private ServerSocket ss;
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;// 외부 사용 가능
	private OutputStream os;
	private OutputStreamWriter ow;// 외부 사용 가능

	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	// 소켓 받기 위해서 멤버변수

	public void getConnect() throws Exception {
		ss = new ServerSocket(8282);
		socket = ss.accept();

		// input
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		// output
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
	}

	// 2. 해제
	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();
	}
}
