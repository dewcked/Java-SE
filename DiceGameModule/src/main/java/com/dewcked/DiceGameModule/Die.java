package com.dewcked.DiceGameModule;

/**
 * @author  Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 	2016-10-02
 */

import java.util.Random;

public class Die {

	private int faceValue;

	public Die(){
		faceValue = 0;
	}

	public int getFaceValue(){
		return faceValue;
	}

	public void roll(){
		Random random = new Random();
		faceValue = random.nextInt(6) + 1;
	}
}