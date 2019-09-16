package com.dewcked.DiceGameModule;
/**
 * @DiceGame.java
 * @author Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 2016-10-02
 */
public class DiceGame {
	//Change this value to change number of dice
	private static int dienum = 3;
	private Die[] dice;

	public int GetDiceNum(){
		return dienum;
	}
	public DiceGame() {
		dice = new Die[dienum];
		for(int i=0;i<dienum;i++) {
			dice[i] = new Die();
		}
	}

	public void play() {
		int[] fv = new int[dienum];
		int sum = 0;
		while (true) {
			for(int i=0;i<dienum;i++) {
				dice[i].roll();
				fv[i] = dice[i].getFaceValue();
				sum += fv[i];
			}
			if (sum > 14) {
				System.out.print("합이 " + sum + "(");
				for(int i=0;i<dienum-1;i++)
					System.out.print(fv[i] + ",");
				System.out.println(fv[dienum-1] + ") 이어서 승리");
				break;
			} else if(sum < 15 && sum>9){
				System.out.print("합이 " + sum + "(");
				for(int i=0;i<dienum-1;i++)
					System.out.print(fv[i] + ",");
				System.out.println(fv[dienum-1] + ") 이어서 비김");
			} else {
				System.out.print("합이 " + sum + "(");
				for(int i=0;i<dienum-1;i++)
					System.out.print(fv[i] + ",");
				System.out.println(fv[dienum-1] + ") 이어서 패배");
			}
		}
	}
}
