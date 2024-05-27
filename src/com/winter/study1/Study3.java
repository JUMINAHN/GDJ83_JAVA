package com.winter.study1;

public class Study3 {
	public static void main(String[]args) {
		
		//연산자 : +, - , *, /, %
		//연산자 --> + 연산자는 산술연산자의 의미도 있고, 연결 연산자의 의미도 있다.
		//문자열 + primitive를 만나면 -> 문자열이 된다. (js과 동일)*****
		System.out.println("1"+1); //sysout ctrl space --> 자동완성
		System.out.println(1+"1"+1);
		System.out.println(1+'a'+"1"); //981이 나옴 --> int + char + string
		//문자열과 더했을 떈 문자가 되는데 -> char은 inttype으로 자동형변환이 된다.
		//****아스키코드표
		//char 2byte -> 01로 저장하기 떄문에 숫자로 바뀜*****************
		
		
		//물건의 총합계를 담을 변수
		int total = 15760; //25760원
		int money = 50000;
		//잔돈계산
		int result = money - total;
		System.out.println("잔돈 : " + result + "원");
		//만원짜리 2장, 천원 4장, 백원 2개, 십원 40개;****
		
		//만원갯수를 담을 변수
		//24240에 -> 2만 빼는 것
		int man = total/10000;
//		int cheon = (total - man*10000)/1000;
//		int beak = (total - man*10000 - cheon * 1000)/100;
		int cheon = result % 10000 / 1000;
		int beak = result % 1000 / 100;
		int sip = (total/10) - (man * 1000) - (int)(cheon * 100) - (beak *10);		
	}
}
