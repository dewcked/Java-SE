package com.dewcked.Mediator;

import java.io.*;

public class Purchase {
	String response = "n";

	public void go() {
		System.out.print("�����Ͻðھ��? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			System.out.println("������ �ּż� �����մϴ�.");
		}

		Exit exit = new Exit();
		exit.go();
	}
}