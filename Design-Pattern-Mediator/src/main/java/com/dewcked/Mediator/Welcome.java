package com.dewcked.Mediator;

import java.io.*;

public class Welcome {
	Mediator mediator;
	String response = "n";

	public Welcome(Mediator m) {
		mediator = m;
		System.out.print("KGU Ȩ���� �湮�� �ּż� �����մϴ�~\n");
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
			mediator.handle("welcome.shop");
		} else {
			mediator.handle("welcome.exit");
		}
	}
}
