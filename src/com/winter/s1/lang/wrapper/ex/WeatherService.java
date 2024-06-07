package com.winter.s1.lang.wrapper.ex;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb; // null
	Scanner sc = new Scanner(System.in);

	public WeatherService() { // 기본 생성자
		this.sb = new StringBuffer(); // null이 아닌 객체 생성 -> 새로운 것을 만들어서 집어넣는다
		this.sb.append("서울 , 29.3 - 맑음 - 60"); // 1개의 weatehrDTO
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80"); // 4개 다들어가 있음
	}

	public WeatherDTO[] init() {
		String info = this.sb.toString();
		info = info.replace(",", "-"); // 순서 --> 코드 순서를 읽어보자
		// System.out.println(info); // info를 받아서 스플릿한다.
		// WeatherDTO[] dtos = this.getWeathers(info); // WeatherDTO가 있는 배열을 주겠다.
		WeatherDTO[] dtos = this.useTokenizer(info);
		return dtos;
	}

	// info에는 한줄로 쭉있어~
	// 여러개가 모여서 하나의 클래스, dto를 구성해야할 때 Stringtokenizer가 편할 것
	private WeatherDTO[] useTokenizer(String info) { // split을 사용하지 않고 parsing 해보자
		StringTokenizer st = new StringTokenizer(info, "-"); // 코드 잘보기ㅜㅜ
		// 자를 문자열의 info를 받아옴 --> 날씨 정보 4개
		// 빼기 기준으로 잘라서 각각에 맞게 넣으려 하는 것
		// String배열이 아니라 tokenizer을 이용해서 한번 해보자
		WeatherDTO[] dtos = new WeatherDTO[4];
		int i = 0;
		// 배열에 짜르고 넣기 간소화하는 것
		while (st.hasMoreTokens()) {
			// trim을 안하면 공백자체도 얘가 문자로 이해하기 때문에 parse가 안된다는 점을 명심하고 유의하자
			WeatherDTO w = new WeatherDTO();
			w.setCity(st.nextToken().trim()); // 한번짜를때 4개씩 잘리니까 -> for문은 에러 뜰 것
			w.setGion(Double.parseDouble(st.nextToken().trim()));
			w.setStatus(st.nextToken().trim());
			w.setHumidity(Integer.parseInt(st.nextToken().trim()));
			dtos[i] = w;
			i++;
		}
		return dtos;
	}

	// 인덱스 번호를 계속 생각해야 한다. --> Split은 짤랏을 때 토큰이 독립적인것 = 이름만 있는 것
	private WeatherDTO[] getWeathers(String info) { // info를 받아서 스플릿한다.
		String[] infos = info.split("-"); // info가 스트링
		int idx = 0;
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4]; // 4번의 객체가 있어야함 --> 그림을 그려넣는게 정확함

		// 방법 2
		for (int i = 0; i < dtos.length; i++) {
			WeatherDTO w = new WeatherDTO();
			w.setCity(infos[idx++].trim());
			w.setGion(Double.parseDouble(infos[idx++].trim()));
			w.setStatus(infos[idx++].trim());
			w.setHumidity(Integer.parseInt(infos[idx++].trim()));
			dtos[i] = w;
		}
		return dtos; // 배열명을 리턴해주자
	}

	// Scanner를 매개변수로 보내줄 수 있음
	// 매개변수로 여러개 받아올 수도 있다~~!!
	public WeatherDTO findByCity(WeatherDTO[] dtos) { // 위치를 받아옴 -> WeatherDTO
		// 선생님 풀이
		// WeatherDTO weatherDTO = null
		// 값을 입력받아야함 -> Scanner
		WeatherDTO weatherDTO = null;
		System.out.println("찾고 싶은 지역은 입력해주세요 : ");
		String location = sc.next();
		// dto 배열 -> 서울 -> 부산 -> 제주 -> 광주 순
		for (int i = 0; i < dtos.length; i++) {
			if (location.equals(dtos[i].getCity())) {
				weatherDTO = dtos[i];
				break;
			}
		}
		return weatherDTO;
	}

	// 날씨 정보를 추가하는 메서드를 만든다.
	// 메서드명은 addWeather라고 할 것이다.
	// 도시명, 기온, 도시의 상태, 도시의 습도를 입력받음 -> 기존의 날씨 정보들에 추가 --> 하나더 추가해서 5개 --> 또하나 추가하면
	// 6개
	// 추가하고 1번누르면 5개 --> 추가하고 1번 누르면 6개
	// 배열의 크기는 바꿔서 넣어야 함

	public WeatherDTO[] addWeather(WeatherDTO[] ar) {
		// 선생님 풀이
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요 : ");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요 : ");
		weatherDTO.setGion(sc.nextDouble());
		System.out.println("현재 상태 입력 : ");
		weatherDTO.setStatus(sc.next());
		System.out.println("습도를 입력하세요 : ");
		weatherDTO.setHumidity(sc.nextInt());

		WeatherDTO[] newAr = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}
		newAr[ar.length] = weatherDTO; // 한개가 추가되는 효과를 볼 수 있음~
		return newAr;
	}

	public WeatherDTO[] remove(WeatherDTO[] ar) {
		WeatherDTO findW = this.findByCity(ar);
		WeatherDTO[] newAr = new WeatherDTO[ar.length - 1];
		for (int i = 0; i < newAr.length; i++) {
			if (findW == ar[i]) { // 2면
				newAr[i] = ar[i + 1];
				continue;
			}
			newAr[i] = ar[i]; // 이게 범위값을 초과하니까
		}

		return newAr;
	}

}
