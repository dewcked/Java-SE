package com.dewcked.Mediator;

import java.io.*;

public class Shop {
	Mediator mediator;
	String response = "n";

	public Shop(Mediator m) {
		mediator = m;
	}

	public void go() {
		System.out.print("구매하시겠어요? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			mediator.handle("shop.purchase");
		} else {
			mediator.handle("shop.exit");
		}
	}
}