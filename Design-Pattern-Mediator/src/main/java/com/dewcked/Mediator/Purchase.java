package com.dewcked.Mediator;

import java.io.*;

public class Purchase {
	String response = "n";

	public void go() {
		System.out.print("결제하시겠어요? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			System.out.println("결제해 주셔서 감사합니다.");
		}

		Exit exit = new Exit();
		exit.go();
	}
}