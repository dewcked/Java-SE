package com.dewcked.DiceGameModule;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame{
	
	JTextField name,age;//클래스 변수로 선언
	JPanel panel;
	public Gui(){
		//new JFrame();생략됨 나자신이니까 쓸수 없음
		this.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);//프레임 완전하게 끄기
		this.setSize(300, 400);
		this.setVisible(true);
		
		//Layout 배치설정자
		panel = new JPanel();
		panel.setLayout(new GridLayout(20,1));
		this.add(panel);
	}
	void init() {

		panel.add(new JLabel("게임을 시작하시겠습니까?"));

		JButton acceptbutton = new JButton("네");
		JButton declinebutton = new JButton("아니오");
		panel.add(acceptbutton);
		panel.add(declinebutton);
		
		this.setVisible(true);
		//버튼 리스너 연결
		acceptbutton.addActionListener(new AcceptListener(this));
		declinebutton.addActionListener(new DeclineListener(this));
	}
	void play() {
		clean();
		DiceGame dicegame = new DiceGame();
		print(dicegame.play());
		init();
	}
	void print(List<String> prints) {
		for(String s: prints)
			panel.add(new JLabel(s));
	}
	void clean() {
		panel.removeAll();
		panel.updateUI();
	}
	class AcceptListener implements ActionListener{
		JFrame frame;
		public AcceptListener(JFrame f){
			frame = f;
		}
		public void actionPerformed(ActionEvent arg0) {
			//버튼을 누르면 이쪽으로 제어가 이동
			play();
		}
	}
	class DeclineListener implements ActionListener{
		JFrame frame;
		public DeclineListener(JFrame f){
			frame = f;
		}
		public void actionPerformed(ActionEvent arg0) {
			//버튼을 누르면 이쪽으로 제어가 이동
			System.exit(0);
		}
	}
}

