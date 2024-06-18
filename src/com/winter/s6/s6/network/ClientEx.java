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
import java.util.StringTokenizer;

public class ClientEx {
//192.168.7.111
	public static void main(String[] args) {
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null; // 문자열을 읽어줌
		Scanner scanner = new Scanner(System.in);

		try {

			sc = new Socket("192.168.7.111", 8282);
			System.out.println("server와 연결성공");

			while (true) {

//				System.out.println("client에서 서버로 보낼 메세지 입력 : ");
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				System.out.println("1.학생정보리스트  2.학생한명정보  3.종료");

				int mode = scanner.nextInt();
				String str = "";
				// 보내는
				os = sc.getOutputStream();// 0과 1을 처리
				ow = new OutputStreamWriter(os);
				// String str = scanner.next();
				ow.write(mode + "\r\n");// 서버에 mode를 보냄
				ow.flush();

				// System.out.println("Client에서 server로 보낸 : " + str);
				if (mode == 1) {
					// 학생정보리스트
					str = br.readLine();
					System.out.println("서버에서 보냄 :" + str);
					StringTokenizer st = new StringTokenizer(str, "-");

					while (st.hasMoreTokens()) {
						String s = st.nextToken();
						if (s == null) {
							break;
						}
						// 출력
						System.out.println(s.trim()); // trim으로 공백제거
						// System.out.println("====================");
					}

				} else if (mode == 2) {
					System.out.println("학생검색입니다.");
					// 학생한명리스트
					System.out.println("찾을 학생의 번호를 입력하세요: ");
					int num = scanner.nextInt();
					ow.write(num + "\r\n");// 서버에 학생번호를 보냄
					ow.flush();

					str = br.readLine();
					System.out.println("서버에서 보냄 :" + str);
					StringTokenizer st = new StringTokenizer(str, "/");
					System.out.println(st.nextToken().trim());

				} else {
					break;
				}

				// System.out.println("server에서 Client로 보낸 : " + str);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//				ow.close();
//				os.close();
//				ir.close();
//				is.close();
//				sc.close();
//				scanner.close();
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//	}

		}
	}
}
