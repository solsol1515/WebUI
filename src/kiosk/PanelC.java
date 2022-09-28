package kiosk;

import java.awt.Color;

import javax.swing.JPanel;

import e_tabbedpane.MainTest;

public class PanelC extends JPanel{

	MainTest parent;
	
	public PanelC (MainTest mainTest) {
		
		parent = mainTest; 
		
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		
	}
	
	void eventProc() {
		
	}
}