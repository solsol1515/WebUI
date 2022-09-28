package kiosk;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class MainTest {

	JFrame f;
	JButton btn;
	JLabel lab;
	
	Panel panelA;
	Panel panelB;
	Panel panelC;
	Panel panelD;
	
	MainTest(){
		
		f = new JFrame("Kiosk 주문창");
		
		panelA = new Panel();
		panelB = new Panel();
		panelC = new Panel();
		panelD = new Panel();
		
	} // end of MainTest
	
	public static void main(String[] args) {

		MainTest test = new MainTest();
		//f.addLayout();
		//f.eventProc();
	} // end of main
	
	void addLayout(){
		
		f.setLayout(new BorderLayout());
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("메인 메뉴", panelA);
		tab.addTab("사이드 메뉴", panelB);
		tab.addTab("음료", panelC);
		tab.addTab("주류", panelC);
		
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} // addLayout()
	
	void eventProc() {
		
	} // end of eventProc()
}
