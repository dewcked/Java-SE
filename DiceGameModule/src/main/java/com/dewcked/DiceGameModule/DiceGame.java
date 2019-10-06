package com.dewcked.DiceGameModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
	File file;
	FileWriter writer;
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
		LoadScore();
		System.out.print ("~~"+highscore+"~~");
		if(score>highscore) {
			highscore = score;
			WriteScore();
		}
		ViewHighScore();
	}
	public void ViewHighScore() {
		System.out.println("현재 체고 점수: " + highscore);
	}
	public void LoadScore() {
		BufferedReader bReader = null;
        try {
        	String s;
            File file = new File("score.txt");
            bReader = new BufferedReader(new FileReader(file));
            // 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
            while((s = bReader.readLine()) != null);
            if(s != null)
            	highscore = Integer.parseInt(s);
        } catch(IOException e) {
        	return;
        }
	}
	public void WriteScore() {
		file = new File("score.txt");
		try {
            writer = new FileWriter(file, false);
            writer.write(""+highscore);
            writer.flush();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null) writer.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
	}
}