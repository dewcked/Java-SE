package com.dewcked.Mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
	Mediator mediator;
	String id;
	String password;
	public Login(Mediator m) {
		mediator = m;
		id = null;
		password = null;
	}

	public void go() {
		System.out.println("ȸ�� ������ �Է��� �ּ���.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("ȸ�� ���̵�: ");
			id = reader.readLine();
			
			System.out.print("ȸ�� ��й�ȣ: ");
			password = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}
		
		/* Here comepare with account database */
		boolean authenticated = true;
		if(!authenticated) {
			mediator.handle("login.exit");
		}
		
	}
}