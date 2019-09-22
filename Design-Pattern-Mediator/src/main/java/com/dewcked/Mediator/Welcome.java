package com.dewcked.Mediator;

import java.io.*;

public class Welcome {
	String response = "n";

	public Welcome() {
		System.out.print("KGU 홈쇼핑 방문해 주셔서 감사합니다~\n");
	}

	public void go() {
		System.out.print("쇼핑하시겠어요? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			Login login = new Login();
			login.go();
			Shop shop = new Shop();
			shop.go();
		} else {
			Exit exit = new Exit();
			exit.go();
		}
	}
}
