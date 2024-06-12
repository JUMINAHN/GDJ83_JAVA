package com.winter.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	public List<MenuDTO> read() { // 이 메서드를 호출하면 파일을 읽어올 것임
		// info Text파일을 읽어오기
		// 한줄씩 일어오면 안되니까
		// 1.항목별로 파씽 -> 읽어서 파씽 후 출력
		// 2.DTO를 만든후에 (메뉴수대로 --> 리턴을 해줌) DTO를 리턴해줌 --> main에서 출력후 확인만
		File file = new File("C:\\study", "info.txt");
		FileReader fr = null;
		BufferedReader br = null;
		List<MenuDTO> ar2 = new ArrayList();
		try {
			fr = new FileReader(file); // 예외 발생
			br = new BufferedReader(fr);
			while (true) {
				MenuDTO m = new MenuDTO();
				String s = br.readLine(); // 예외 발생 --> 한줄씩 읽으니까
				if (s == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(s, ",");
//				String[] ar = s.split(",");
				while (st.hasMoreTokens()) {
					m.setMenuName(st.nextToken().trim());
					m.setPrice(Integer.parseInt(st.nextToken().trim()));
					m.setKcal(Integer.parseInt(st.nextToken().trim()));
					ar2.add(m);
				}
			}
			// 반복문을 돌리자 --> 문자열로 출력
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); // 닫아줘야하니까 위에 값이 있어야 함
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return ar2;
	}
}
