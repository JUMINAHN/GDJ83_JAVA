package com.winter.study2;

import java.util.Scanner;

public class S2_2Solve2 {
	public static void main(String[] args) {
		// 학생 수를 입력받아서 학생수만큼 이름과 국어 + 영어 + 수학 점수을 입력받아서 출력하자 a 80 b 90
		// 국어 점수 영어 점수
		// 입력순서에 따라 번호 부여 *****
		// 메세지를 줄것 1.학생정보 입력 2. 학생 정보 출력 3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int count = 1;
		String[] name = new String[count];
		while (flag) {
			System.out.println("옵션//1.학생정보 입력 2. 학생정보 출력 3.프로그램 종료");
			int option = sc.nextInt();
			sc.nextLine();
			if (option == 1) {
				for (int i = 0; i < name.length; i++) {
					System.out.println("이름을 입력하세요 : ");
					name[i] = sc.nextLine();
				}
				continue;
			} else if (option == 2) {
				for (int i = 0; i < name.length; i++) {
					System.out.println("이름 : " + name[i]);
				}
			} else {
				System.out.println("프로그램 종료");
				flag = false;
			}
			count++;
		}

//		System.out.println("학생 수는 ? : ");
//		int num = sc.nextInt(); // 엔터키 만날때까지 읽어봄
//		sc.nextLine();
//		String[] name = new String[num];
//		int[] score = new int[num];
//		int[] score1 = new int[num];
//		int[] score2 = new int[num];
//		int[] schoolnum = new int[num];
//		int[] totals = new int[num];
//		double[] avgs = new double[num];

//		// nextline이 엔터키 가지고 가져감
//		for (int i = 0; i < name.length; i++) { // num자체가 길이이기 때문에 length가 적용될 필요가 없다. --> length 배열의 길이
//			System.out.println("학생 이름은 ? :");
//			name[i] = sc.nextLine();
//			System.out.println("국어 점수는 ? : ");
//			score[i] = sc.nextInt();
//			System.out.println("수학 점수는 ? : ");
//			score1[i] = sc.nextInt();
//			System.out.println("영어 점수는 ? : ");
//			score2[i] = sc.nextInt();
//			sc.nextLine();
//			schoolnum[i] = (i + 1);
//			totals[i] = score[i] + score1[i] + score2[i];
//			avgs[i] = totals[i] / 3;
//		}
//
//		System.out.println("순번\t이름\t국어\t수학\t영어\t총점\t평균"); // ***t에 대한 내용 잘 하기
//		for (int i = 0; i < name.length; i++) {
//			System.out.print(schoolnum[i] + "\t");
//			System.out.print(name[i] + "\t");
//			System.out.print(score[i] + "\t");
//			System.out.print(score1[i] + "\t");
//			System.out.print(score2[i] + "\t");
//			System.out.print(totals[i] + "\t");
//			System.out.println(avgs[i]);
//
//		}

		// name[i] + "의 국어 점수 : " + score[i] + "점, 수학 점수 : " + score1[i] + "점, 영어 점수 : "
		// + score2[i] + "점");

	}
}
