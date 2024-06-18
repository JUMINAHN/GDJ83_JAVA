package com.winter.s6.s6.network;

public class ServerMain {
	public static void main(String[] args) {
		ServerConnect sv = new ServerConnect();
		try {
			sv.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
