package com.winter.s1;

public class S1Main {
	public static void main(String[] args) {
		// 모든 클래스의 조상은 Object다. 조상은 Object type이다.
		Object obj = new Object();
		int[] ar = { 1, 2, 3, 4, 5 };

		// Stack
		StackStudy ss = new StackStudy();
		int[] newAddSs = ss.add(ar);
		int[] newRemoveSs = ss.remove(ar);
		for (int i = 0; i < newAddSs.length; i++) {
			System.out.println(newAddSs[i]);
		}
		for (int j = 0; j < newRemoveSs.length; j++) {
			System.out.println(newRemoveSs[j]);
		}

		// Qstudy
		QStudy qs = new QStudy();
		int[] newAddQs = qs.add(ar);
		int[] newRemoveQs = qs.remove(ar);
		for (int k = 0; k < newAddQs.length; k++) {
			System.out.println(newAddQs[k]);
		}
		for (int m = 0; m < newRemoveQs.length; m++) {
			System.out.println(newAddQs[m]);
		}

	}
}
