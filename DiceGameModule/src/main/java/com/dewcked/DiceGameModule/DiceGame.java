package com.dewcked.DiceGameModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph Gihwon Kwon -- Here comes that dreamer !
 * @date 2016-10-02
 */

public class DiceGame {
	private int highscore;
	private int gamecnt;
	private int score;
	private Die die1;
	private Die die2;
	File file;
	FileWriter writer;
	List<String> prints = new ArrayList<String>();
	
	public DiceGame() {
		die1 = new Die();
		die2 = new Die();
		score = 0;
		gamecnt = 10;
		highscore = 0;
	}

	public List<String> play() {
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
				prints.add("합이 " + sum + "(" + fv1 + "," + fv2 + ") 이어서 승리");
				score += 10;
			} else {
				prints.add("합이 " + sum + "(" + fv1 + "," + fv2 + ") 이어서 패배");
			}
		}
		LoadScore();
		if(score>highscore) {
			highscore = score;
			WriteScore();
		}
		ViewHighScore();
		return prints;
	}
	public void ViewHighScore() {
		prints.add("현재 체고 점수: " + highscore);
	}
	public void LoadScore() {
		BufferedReader bReader = null;
        try {
        	String s;
            File file = new File("score.txt");
            bReader = new BufferedReader(new FileReader(file));
            // 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
            s = bReader.readLine();
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