package com.dewcked.DiceGameModule;

/**
 * @author Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 2016-10-02
 */

public class DiceGame {
	protected static int highscore = 0;
	private int gamecnt;
	private int score;
	private Die die1;
	private Die die2;

	public DiceGame() {
		die1 = new Die();
		die2 = new Die();
		score = 0;
		gamecnt = 10;
		
	}

	public void play() {
		int fv1;
		int fv2;
		int sum;

		for (; gamecnt != 0; gamecnt--) {
			die1.roll();
			fv1 = die1.getFaceValue();
			die2.roll();
			fv2 = die2.getFaceValue();
			sum = fv1 + fv2;

			if (sum == 7) {
				System.out.println("합이 " + sum + "(" + fv1 + "," + fv2 + ") 이어서 승리");
				score += 10;
			} else {
				System.out.println("합이 " + sum + "(" + fv1 + "," + fv2 + ") 이어서 패배");
			}
		}
		if(score>highscore)
			highscore = score;
		ViewHighScore();
	}
	public void ViewHighScore() {
		System.out.println("현재 체고 점수: " + highscore);
	}
}