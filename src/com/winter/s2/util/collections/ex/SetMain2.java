
package com.winter.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {
	public static void main(String[] args) {

		String n = "123";
		Object obj = n;
		System.out.println(obj instanceof String); // 이런 귀찮음 줄일려고 generic만듬

		Random random = new Random();// 랜덤하게 6번
		int num = random.nextInt(45) + 1;// 1부터 45까지
		// 만약 첫번째 뽑은 번호가 6
		// 6이 나올 확률이 있으면 중복
		int[] ar = new int[6];
		for (int i = 0; i < ar.length; i++) {// 3이면 2만큼 돌아

		}

		// 배열에서 중복제거 arraylist에서 중복제거

		// for든 while든 상관없다.
		ArrayList<Integer> list = new ArrayList(); // 6번 뽑아야함
//		while(list.size() != 6) {
//			
//		}
		// index번호 1개당 번호 1개 --> 안겹치게 만들어오기 (homework)

		HashSet<Integer> hs = new HashSet<Integer>(); // 중복값 생기면 버려버림
		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1); // 알아서 중복값 삭제함
		}
		System.out.println(hs); // 중복 뽑는거 안만들도 됨
	}

}
