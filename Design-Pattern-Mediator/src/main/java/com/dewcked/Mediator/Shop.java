package com.dewcked.Mediator;

import java.io.*;

public class Shop {
	String response = "n";

	public void go() {
		System.out.print("구매하시겠어요? [y/n]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}

		if (response.equals("y")) {
			Purchase purchase = new Purchase();
			purchase.go();
		} else {
			Exit exit = new Exit();
			exit.go();
		}
	}
}