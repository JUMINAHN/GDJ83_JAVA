package com.winter.study1;

import java.util.Scanner;

public class Study9_loginoption {
	public static void main(String [] args) {
		//로그인 검증
		//id 1234, pw 5678
		//로그인 시도 전, 1. 로그인 2. 종료
		//사용자의 id와 pw을 입력받아서 로그인시도를 N번 시도
		//틀리면 로그인 실패 출력 -> 로그인 검증(할거냐 안할거냐?)
		//반복문이 종료후에 종료를 선택했다면 프로그램을 종료하자
		//로그인 성공하면 성공을 출력하고 반복문 종료
		//로그인 성공해도 성공해도 반복문이 종료되면, 게임을 시작하자
		//2번선택후 종료했다면 -> 로그인을 안하고 온 것
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		while(true) {
			System.out.println("1.로그인 시도 // 2.프로그램 종료 : 옵션을 선택하세요");
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("ID를 입력하세요");
				int myId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("PW를 입력하세요");
				int myPw = sc.nextInt();
				sc.nextLine();
				if(id == myId && myPw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
					continue;
//					System.out.println("로그인 시도를 다시 진행하시겠습니까? : 1.진행 2.종료");
//					int next = sc.nextInt();
//					if(next == 1) {
//	
//						continue;
//					} else if(next ==2) {
//						System.out.println("2번 선택 : 로그인 시도 종료");
//						break;
//					}
//				}
				}
			} else if(option == 2) {
				System.out.println("로그인 시도를 포기합니다.");
				sc.nextLine();
				break;
			}	
		}
		
		
		//mmorpg 
		//시작 레벨 1로 시작해서 15가 만렙 
		//gold는 기본 0으로 시작 
		//1렙에서 2렙에서 갈려면 1->2렙->3렙 몬스터 숫자가 다름
		//1렙에서 2렙으로 갈때 3마리 사냥, 2에서 3으로 갈때 6마리, 3에서 4렙 9마리(3의배수)
		//14 -> 15 : 42마리 (3의배수)
		//1렙 바로 사냥가는 것 -> 3마리잡은 것 표기 -> 레벨업
		//레벨업할때 축하금으로 --> 레벨 바뀌면 
		//5레벨 달성시 1000G, 10레벨 2000G
		//만렙달성시 3000G -> 10의배수
		
		//만렙달성시 프로그램을 종료한다. -> 현레벨, 현골드 출력 
		//(레벨업 하기전에 사냥할거냐 종료할거냐 물어보기)
	}
}
