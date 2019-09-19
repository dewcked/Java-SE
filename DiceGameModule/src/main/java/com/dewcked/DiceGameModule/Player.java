package com.dewcked.DiceGameModule;

import com.dewcked.DiceGameModule.DiceGame.Result;

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
	public Result play(Die die1, Die die2, Die die3) {
		Result result = null;
		die1.roll();
		die2.roll();
		die3.roll();
		int sum = die1.getFaceValue() + die2.getFaceValue() + die3.getFaceValue();
		if(sum >= 15)
			result = Result.win;
		else if(sum >= 10 && sum <= 14)
			result = Result.tie;
		else
			result = Result.lose;
		return result;
	};
}