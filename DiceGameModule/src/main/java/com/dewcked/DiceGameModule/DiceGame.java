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
				System.out.println("�빀�씠 15 �씠�긽 �씠�뼱�꽌 �듅由�");
				break;
			}
			else if(result == Result.tie){
				System.out.println("�빀�씠 10~14 �씠�뼱�꽌 鍮꾧�");
			}
			else if(result == Result.lose) {
				System.out.println("�빀�씠 10 �씠�븯(誘몃쭔)�뿬�꽌  �뙣諛�");
			}
		}
	}
}