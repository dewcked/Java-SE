package com.dewcked.Mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exit {
	Mediator mediator;
	String response;
	
	public Exit(Mediator m) {
		mediator = m;
	}

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
			if(sess.getSession() != null)
				mediator.handle("login.shop");
			else
				mediator.handle("welcome.login");
		} else {
			System.out.println("�ȳ��� ������~.");
		}
	}
}
