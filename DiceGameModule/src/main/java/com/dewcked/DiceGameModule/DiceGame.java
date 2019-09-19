package com.dewcked.DiceGameModule;

/**
* @author  Joseph Gihwon Kwon -- Here comes that dreamer !
* @date 	2016-10-02
*/

public class DiceGame {
	private Die die1;
	private Die die2;
	private Die die3;

	public DiceGame(){
		die1 = new Die();
		die2 = new Die();
		die3 = new Die();
	}

	public void play(){
		int fv1;
		int fv2;
		int fv3;
		int sum;
		
	    while(true){
			die1.roll();
			fv1 = die1.getFaceValue();
			die2.roll();			
			fv2 = die2.getFaceValue();
			die3.roll();
			fv3 = die3.getFaceValue();
			sum = fv1 + fv2 + fv3;
				
			if(sum >= 15) {
				System.out.println("합이 " + sum + "(" + fv1 + "," + fv2 + "," + fv3 + ") 이어서 승리");
				break;
			}
			else if(sum <= 14 && sum >= 10){
				System.out.println("합이 " + sum + "(" + fv1 + "," + fv2 + "," + fv3 + ") 이어서 비김");
			}
			else if(sum < 10) {
				System.out.println("합이 " + sum + "(" + fv1 + "," + fv2 + "," + fv3 + ") 이어서 패배");
			}
	    }
	}
}