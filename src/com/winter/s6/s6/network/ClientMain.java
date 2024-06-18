package com.winter.s6.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null; // 문자열을 읽어줌
		Scanner scanner = new Scanner(System.in);

		try {
			sc = new Socket("localhost", 8282);
			System.out.println("서버와 연결 성공");
			// String str = "";
			os = sc.getOutputStream();// 0과 1을 처리
			ow = new OutputStreamWriter(os);// buffer에 있는걸 내보낼 준비

			// 받는
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			while (true) {
				System.out.println("client에서 서버로 보낼 메세지 입력 : ");
				String str = scanner.next();

				// System.out.println("입력받은 메세지 : " + str);

				// 보내는
				ow.write(str + "\r\n");
				ow.flush();

//				System.out.println(str);
				if (str.toLowerCase().equals("exit")) {
					System.out.println("Client에서 exit 요청");
					break;
				}

				str = br.readLine();
				if (str.toLowerCase().equals("exit")) {
					System.out.println("Server에서 exit 요청");
					break;
				}

				System.out.println("=============================");
				System.out.println("server에서 보낸 메세지 :  : " + str);
				System.out.println("=============================");

			}
			// 보내고 끝남
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// close는 역순으로
				br.close();
				ow.close();
				os.close();
				ir.close();
				is.close();
				sc.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
