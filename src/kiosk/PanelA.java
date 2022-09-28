package kiosk;

import java.awt.Color;

import javax.swing.JPanel;

import e_tabbedpane.MainTest;

public class PanelA extends JPanel{

	MainTest parent;
	
	public PanelA (MainTest mainTest) {
		
		parent = mainTest; 
		
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		
	}
	
	void eventProc() {
		
	}
}
