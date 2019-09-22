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
		System.out.println("회원 정보를 입력해 주세요.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("회원 아이디: ");
			id = reader.readLine();

			System.out.print("회원 비밀번호: ");
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