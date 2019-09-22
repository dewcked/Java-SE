package com.dewcked.Mediator;

public class Mediator {
	Welcome welcome;
	Login login;
	Shop shop;
	Purchase purchase;
	Exit exit;

	public Mediator() {
		welcome = new Welcome(this);
		login = new Login(this);
		shop = new Shop(this);
		purchase = new Purchase(this);
		exit = new Exit(this);
	}

	public void handle(String state) {
		if (state.equals("login.shop")) {
			shop.go();
		} else if (state.equals("welcome.login")) {
			login.go();
		} else if (state.equals("shop.purchase")) {
			purchase.go();
		} else if (state.equals("login.exit")) {
			exit.go();
		} else if (state.equals("purchase.exit")) {
			exit.go();
		} else if (state.equals("welcome.exit")) {
			exit.go();
		} else if (state.equals("shop.exit")) {
			exit.go();
		}
	}

	public Welcome getWelcome() {
		return welcome;
	}
}