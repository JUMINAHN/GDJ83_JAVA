package com.winter.s3;

//날개
public class Eagle extends Bird implements Fly { // extends 상속은 1개만 ,implemetns interface제공은 2~3개이상 가능
//Eagle도, Bird도, Fly도 된다~

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void flyAble() {
		// TODO Auto-generated method stub

	} // implemetns 구햔한 interface
		// 내부에 추상있의까 오버라이딩하라고함

}
//상속까지만 하면 기본적인 문법은 끝이다~~~ -> 이걸로 반복하는것
