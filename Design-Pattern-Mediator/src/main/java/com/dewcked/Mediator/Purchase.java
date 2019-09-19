package com.dewcked.Mediator;

import java.io.*;

public class Purchase {
	Mediator mediator;
	String response = "n";

	public Purchase(Mediator m) {
		mediator = m;
	}

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

		mediator.handle("purchase.exit");
	}
}