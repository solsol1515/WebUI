package e_tabbedpane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel	{

	JLabel aLa = new JLabel("패널 A");
	JButton aBtn = new JButton("A버튼");
	
	MainTest parent; // 멤버변수 선언
	
	public PanelA(MainTest mainTest) {
		
		parent = mainTest; // 주소값만 받아줌
		
		setBackground(new Color(250, 240, 120)); // RGB(Red, Green, Blue)
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	void eventProc() {
		aBtn.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				parent.la.setText("안녕하세요");
			} // end of actionPerformed()	
			
		} ); // end of addActionListener()	
	} // end of eventProc()
}
