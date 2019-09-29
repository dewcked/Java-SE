package com.dewcked.DiceGameModule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 2016-10-02
 */

public class Player {
	protected static String response = "n";

	public static void main(String[] args) {

		DiceGame dicegame = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("게임을 시작하시겠습니까? [y/n]? ");
			    try{
			      response = reader.readLine();
			    } catch (IOException e){ 
			      System.err.println("Error");
			    }
			if(response.equals("y")) {
				dicegame = new DiceGame();
				dicegame.play();
			}
			else
				break;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}