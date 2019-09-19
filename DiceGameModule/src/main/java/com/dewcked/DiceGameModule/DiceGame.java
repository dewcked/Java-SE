package com.dewcked.DiceGameModule;

/**
 * @author  Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 	2016-10-02
 */

public class DiceGame {
	private Die die1;
	private Die die2;
	private Die die3;
	private Player gamer;
	public enum Result {win, tie, lose};
	
	public DiceGame(){
		die1 = new Die();
		die2 = new Die();
		die3 = new Die();
		gamer = new Player("Kim Game");
	}

	public static void main(String[] args) {
		DiceGame dicegame = new DiceGame();
		dicegame.initialize();
	}
	
	public void initialize() {
		Result result = null;
		
		while(true){
			result = gamer.play(die1, die2, die3);
			
			if(result == Result.win) {
				System.out.println("합이 15 이상이어서 승리");
				break;
			}
			else if(result == Result.tie){
				System.out.println("합이 10~14 이어서 승리");
			}
			else if(result == Result.lose) {
				System.out.println("합이 10 미만이어서 승리");
			}
		}
	}
}