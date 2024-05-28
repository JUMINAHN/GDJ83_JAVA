package com.winter.study2;

import java.util.Scanner;

public class S2_2Solve_me2 {
	public static void main(String[] args) {
		// 학생 수를 입력받아서 학생수만큼 이름과 국어 + 영어 + 수학 점수을 입력받아서 출력하자 a 80 b 90
		// 국어 점수 영어 점수
		// 입력순서에 따라 번호 부여 *****
		// 메세지를 줄것 1.학생정보 입력 2. 학생 정보 출력 3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String[] name = null; // null초기값은 null
		int[] score = null;
		int[] score1 = null;
		int[] score2 = null;
		int[] schoolnum = null;
		int[] totals = null;
		double[] avgs = null;
		while (flag) {
			// 프로그램 종료 4번 -> 3. 학생 정보 검색 --> 학생번호 입력해서 일치하는 학생의 모든 정보 출력
			System.out.println("옵션//1.학생정보 입력 2. 학생정보 출력 3. 학생정보 검색 4.성적 순 출력 5.프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 수 입력");
				int count = sc.nextInt();
				sc.nextLine();
				name = new String[count];
				score = new int[count];
				score1 = new int[count];
				score2 = new int[count];
				schoolnum = new int[count];
				totals = new int[count];
				avgs = new double[count];
				for (int i = 0; i < name.length; i++) {
					System.out.println("학생 이름은 ? :");
					name[i] = sc.nextLine();
					System.out.println("국어 점수는 ? : ");
					score[i] = sc.nextInt();
					System.out.println("수학 점수는 ? : ");
					score1[i] = sc.nextInt();
					System.out.println("영어 점수는 ? : ");
					score2[i] = sc.nextInt();
					sc.nextLine();
					schoolnum[i] = (i + 1);
					totals[i] = score[i] + score1[i] + score2[i];
					avgs[i] = totals[i] / 3;
				}
				break;

			case 2:
				System.out.println("순번\t이름\t국어\t수학\t영어\t총점\t평균"); // ***t에 대한 내용 잘 하기
				for (int i = 0; i < name.length; i++) {
					System.out.print(schoolnum[i] + "\t");
					System.out.print(name[i] + "\t");
					System.out.print(score[i] + "\t");
					System.out.print(score1[i] + "\t");
					System.out.print(score2[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.println(avgs[i]);
				}
				break;

			case 3:
				System.out.println("찾고 싶은 순번? : ");
				int indexNum = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (name[indexNum - 1] == name[i]) {
						System.out.println("순번\t이름\t국어\t수학\t영어\t총점\t평균");
						System.out.print(schoolnum[i] + "\t");
						System.out.print(name[i] + "\t");
						System.out.print(score[i] + "\t");
						System.out.print(score1[i] + "\t");
						System.out.print(score2[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.println(avgs[i]);
					}
				}

				// 이미 개발된 것을 가져오는 것 -> 자기 프로그램에 맞게끔 변형
				// 이차원 배열 쓸일이 잘없음
			case 4: // 퀵정렬
				for (int i = 0; i < avgs.length - 1; i++) { // 나머지애들도 같이 움직여야 함.. --> 어려우면 성적만 정리해서 출력
					for (int j = i + 1; j < avgs.length; j++) {
						if (avgs[i] < avgs[j]) {
							// 둘이 자리를 바꿈 -> 평균의 값만 자리를 바꿈
							name[i] = name[j]; // 하나가 바뀔때 나머지도 바뀌는 것
							score[i] = score1[i];
							score2[i] = score2[j];
							totals[i] = totals[j];
							avgs[i] = avgs[j];
							schoolnum[i] = schoolnum[j];
							// 자리를 바꿨기 때문에 바뀐데이터 추렭
//							int temp = totals[j];
//							totals[j] = totals[j + 1];
//							totals[j + 1] = temp;
						}
					}
				}

				// 큰 순서대로 출력 4부터 0까지~**
				for (int i = totals.length - 1; i >= 0; i--) { // 배열을 큰 순서대로 출력하기 위해 역순으로 출력
					System.out.println((totals.length - i) + "등의 점수 : " + totals[i]);
				}
				// https://blog.naver.com/dlaaod012/222771867356

			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}
}
