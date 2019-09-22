package com.dewcked.Mediator;

public class TestMediator {
	public static void main(String args[]) {
		TestMediator t = new TestMediator();
	}

	public TestMediator() {
		Welcome welcome = new Welcome();
		welcome.go();
	}
}