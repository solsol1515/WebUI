package e_tabbedpane2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel	{

	JLabel aLa = new JLabel("패널 A");
	JButton aBtn = new JButton("A버튼");
	
	public PanelA() {
		setBackground(new Color(250, 240, 120)); // RGB(Red, Green, Blue)
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	void eventProc() {
		
	}
}
