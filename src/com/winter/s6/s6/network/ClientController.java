package com.winter.s6.s6.network;

import java.util.Scanner;

public class ClientController {
	private ClientConnect clientConnect;
	private ClientService clientService;

	public ClientController() {
		clientConnect = new ClientConnect(); // 주석처리하고 1번 2번 잘돌아가는지 테스트
		clientService = new ClientService();
	}

	public void start() throws Exception {
		// 얘가 접속을 하고
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		clientConnect.getConnection();

		while (flag) {
			System.out.println("1. 전체 2. 상세 정보 3. 종료");
			int select = sc.nextInt();

			// 서버로 보내려면 output, 서버에서 받은걸 읽을려면 buffered reader
			if (select == 1) { // 1번이면 서버로 데이터 1번, 서버로 데이터 받아서 출력
				clientConnect.getOw().write(select + "\r\n");
				clientConnect.getOw().flush();
				// 서버가 실행 안뜨면 에러뜰 것

				// 서버쪽에서 보내면 준다.
				String info = clientConnect.getBr().readLine();
				clientService.getInfo(info); // 서버에서 받은걸 보내자

			} else if (select == 2) {

			} else {

			}
		}

	}

}
