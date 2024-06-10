package com.winter.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//jvm이 exception객체를 만듬
public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// try는 하나만 catch는 여러개 쓸 수 있음
		try {
			int num = 10;

			System.out.println("숫자 입력");
			int num2 = sc.nextInt(); // input미스매치 -> 더블 입력할시

			System.out.println(num / num2);
			// throw new ArithmeticException(); -> jvm이 예외가 발생하면 자체적으로 만들어서 발생시킴
		} catch (ArithmeticException e) {// 던지면 받는애가 필요하다. -> 메서드 형식 --> 던진애를 매개변수로 선언하고 받는것
			System.out.println("0으로 나눌 수 없습니다.");
			// 강제 종료없이 계속 내려가게 하는 것
		} catch (InputMismatchException e) {
			System.out.println("숫자 이외엔 값을 입력할 수 없습니다.");
		} catch (Exception e) { // 너무너무너무많으면 부모로 그냥 받아버린다.

		} catch (Throwable e) { // exception에서도 못받으면 Throwable에서 받는다.

		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(0); // 예외가 발생하는 것을 받아오니까 아래에 받아서 해결
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); // 아무런 메세지를 안주면 이렇게 출력
			// 왜 예외가 발생하는지에 대한 정보를 적어줘야함 --> 개발했을 떄 찍어줘야함
			// 뭐때문에 예외가 발생했는지 찾기 힘들다.
			// 왜 문제가 발생했는지 찍어주자
			System.out.println(e.getMessage()); // 메세지만 찍어줌 -> 왜 예외가 발생했는지는 xx
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception handling 해야한다는 의미
		System.out.println("프로그램이 종료합니다. ");
	}

}
