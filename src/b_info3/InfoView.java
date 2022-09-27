package b_info3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {

	// 1. 멤버 변수 선언
	
	JFrame f;
	JTextField tfName, tfId,   tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 2. 멤버 변수 객체 생성
	InfoView(){
			// * 프레임
		f = new JFrame("DBTest");							// 프레임 제목 만들어주기
		
			// * 입력 항목(좌측)
		tfName = new JTextField(10);						// 이름
		tfId = new JTextField(10);							// ID
		tfTel = new JTextField(10);							// Tel
		tfGender = new JTextField(10);						// Gender
		tfAge = new JTextField(10);							// Age
		tfHome = new JTextField(10);						// Home
		
			// * 입력 공간(우측)
		ta = new JTextArea(5, 20);					// textArea
		
			// * 버튼(하단)
		bAdd = new JButton("Add");					// Add
		bShow = new JButton("Show");				// Show
		bSearch = new JButton("Search");			// Search
		bDelete = new JButton("Delete");			// Delete			
		bCancel = new JButton("Cancel");			// Cancel
		bExit = new JButton("Exit");				// Exit
	}
	
	// 3. 화면 구성 & 출력 borderlayout - west center(텍스트 에어리어) east south(패널)
	
	/* 전체 프레임 BorderLayout
	   WEST: JPanel (GridLayout(6, 2))
	   CENTER: textArea
	   SOUTH: JPanel GridLayout(1, 6)
	 */
	
	public void addLayout() {
		// 붙이기 작업
		// 프레임_붙이기
		f.setLayout(new BorderLayout());
		
		// 좌측 textField_붙이기(JPanel(GridLayout(6, 2))
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6, 2));
		f.add(pWest, BorderLayout.WEST);
		pWest.add(new JLabel("Name",JLabel.CENTER));
		pWest.add(tfName);
		pWest.add(new JLabel("Id",JLabel.CENTER));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel",JLabel.CENTER));
		pWest.add(tfTel);
		pWest.add(new JLabel("Gender",JLabel.CENTER));
		pWest.add(tfGender);
		pWest.add(new JLabel("Age",JLabel.CENTER));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home",JLabel.CENTER));
		pWest.add(tfHome);
		
		// 우측 textArea_붙이기
		f.add(ta, BorderLayout.CENTER);
		
		// 하단 버튼_붙이기
		JPanel pSouth = new JPanel();				// 만들기
		pSouth.setLayout(new GridLayout(1,6));		// 그리드 선언
		f.add(pSouth, BorderLayout.SOUTH);			// 프레임 안에 붙이기 
		pSouth.add(bAdd);							// 그리드 안에 버튼 붙이기 ↓
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();

	}

}
