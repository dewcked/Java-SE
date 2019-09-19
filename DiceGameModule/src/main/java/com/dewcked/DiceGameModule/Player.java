package com.dewcked.DiceGameModule;

/**
 * @author  Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 	2016-10-02
 */
 
public class Player {
	private String name;
	/* 2019-09-19 KCW */
	/* manually added */
	/* without this code, program would not run! */
	public Player(String string) {
		this.name = string;
	}
	/* 2019-09-19 KCW */
	/* manually added */
	/* without this code, program would not run! */
	public boolean play(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		int sum = die1.getFaceValue() + die2.getFaceValue();
		if(sum == 7)
			return true;
		return false;
	};
}