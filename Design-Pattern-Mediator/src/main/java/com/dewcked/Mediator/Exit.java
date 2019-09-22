package com.dewcked.Mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exit {
	String response;
	
	public void go() {
		System.out.print("������ ����Ͻðڽ��ϱ�? [y/n]?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}
		Session sess = new Session();
		if (response.equals("y")) {
			if(sess.getSession() != null) {
				Shop shop = new Shop();
				shop.go();
			} else {
				Login login = new Login();
				login.go();
			}
		} else {
			System.out.println("�ȳ��� ������~.");
		}
	}
}
