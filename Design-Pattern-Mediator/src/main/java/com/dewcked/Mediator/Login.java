package com.dewcked.Mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class Login {
	String id;
	String password;
	public Login() {
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
		/* Create Session */
		Session sess = new Session();
		sess.setSession(UUID.randomUUID().toString());
		if(sess.getSession() == null) {
			Exit exit = new Exit();
			exit.go();
		} else {
			Shop shop = new Shop();
			shop.go();
		}

	}
} 