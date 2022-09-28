package b_info3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		tfName 	 = new JTextField(10);						// 이름
		tfId	 = new JTextField(10);						// ID
		tfTel	 = new JTextField(10);						// Tel
		tfGender = new JTextField(10);						// Gender
		tfAge 	 = new JTextField(10);						// Age
		tfHome 	 = new JTextField(10);						// Home
		
			// * 입력 공간(우측)
		ta = new JTextArea(5, 20);							// textArea
		
			// * 버튼(하단)
		bAdd 	= new JButton("Add");						// 추가 버튼
		bShow 	= new JButton("Show");						// 전체 보기 버튼
		bSearch = new JButton("Search");					// 검색 버튼
		bDelete = new JButton("Delete");					// 삭제 버튼			
		bCancel = new JButton("Cancel");					// 취소 버튼
		bExit 	= new JButton("Exit(alt + X)", new ImageIcon("src\\b_info\\imgs\\캡처1.PNG"));				// Exit
			bExit.setHorizontalTextPosition(JButton.CENTER);					// 수평_텍스트 넣음
			bExit.setVerticalTextPosition(JButton.BOTTOM);						// 수직_텍스트 넣음
			bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\캡처2.PNG"));// 마우스 올렸을 때 이미지 변경
			bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\캡처3.PNG"));	// 마우스 클릭했을 때 이미지 변경 
			bExit.setToolTipText("프로그램을 종료합니다");								// 마우스 커서 올렸을 때 팝업 말풍선 생성
			bExit.setMnemonic('x');												// 단축키 생성(alt는 자동으로 생성해줘서 입력한 문자만 추가로 기재해주면 됨) 
		
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
		pWest.setLayout(new GridLayout(6, 2)); // 6열 2행의 레이아웃 생성
		f.add(pWest, BorderLayout.WEST); // 프레임에 패널 붙이기 
		pWest.add(new JLabel("Name",JLabel.CENTER)); // 이름 라벨에 "Name" 입력 후 중앙정렬
		pWest.add(tfName); // 이름 입력 칸 붙이기
		pWest.add(new JLabel("Id",JLabel.CENTER)); // 주민번호 라벨에 "Id" 입력 후 중앙정렬
		pWest.add(tfId); // 주민번호 입력 칸 붙이기
		pWest.add(new JLabel("Tel",JLabel.CENTER)); // 전화번호 라벨에 "Tel" 입력 후 중앙정렬
		pWest.add(tfTel); // 전화번호 입력 칸 붙이기
		pWest.add(new JLabel("Gender",JLabel.CENTER)); // 성별 라벨에 "Gender" 입력 후 중앙정렬
		pWest.add(tfGender); // 성별 입력 칸 붙이기
		pWest.add(new JLabel("Age",JLabel.CENTER)); // 나이 라벨에 "Age" 입력 후 중앙정렬
		pWest.add(tfAge); // 나이 입력 칸 붙이기
		pWest.add(new JLabel("Home",JLabel.CENTER)); // 출신지 라벨에 "Home" 입력 후 중앙정렬
		pWest.add(tfHome); // 출신지 입력 칸 붙이기
		
		// 우측 textArea_붙이기
		f.add(ta, BorderLayout.CENTER);
		
		// 하단 버튼_붙이기
		JPanel pSouth = new JPanel();				// 만들기
		pSouth.setLayout(new GridLayout(1,6));		// 그리드 선언 및 1열 6행 버튼 생성
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
		// 이벤트 처리 함수
		public void eventProc() {
			// 'ADD' 버튼 눌렸을 때 
			bAdd.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생(add)"); 
				}	
			} );
		
			bShow.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생(show)");		// 팝업 발생
				}	
			} );
			
			bSearch.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생(search)");		// 팝업 발생
				}	
			} );
			
			bDelete.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생(delete)");		// 팝업 발생
				}	
			} );
			// cancel
			bCancel.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					clearTextField();
					
				}	
			} );
			
			bExit.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "이벤트 발생(exit)");		// 팝업 발생
				}	
			} );
			
			// 주민번호 입력창에서 엔터 쳤을 때
			tfId.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent e) {
					getJuminInfo(); // getJuminInfo() 메소드를 생성해 반복되는 것 넣기
				} // end of actionPerformed
			} ) ; // end of addActionListener	
			
			// 주민번호 입력창에서 포커스 이벤트가 발생했을 때
			tfId.addFocusListener(new FocusListener() {
				public void focusGained(FocusEvent e) {
				}
				public void focusLost(FocusEvent e) {
					getJuminInfo();
				} 	
			} ) ; // end of addFocusListener
			
			} // end of eventProc()			
		/*
		 각각의 텍스트 필드와 텍스트 에어리어의 값 지우기
		 */
		void clearTextField() {
			ta.setText(null);
			// 나머지 텍스트 필드
			tfName.setText(null);
			tfId.setText(null);
			tfTel.setText(null);
			tfGender.setText(null);
			tfAge.setText(null);
			tfHome.setText(null);
			
		} // end of clearTextField()
		
		
		void getJuminInfo() {
			
			String jumin = tfId.getText();
			if(jumin.length()<14) {
			JOptionPane.showMessageDialog(null, "-을 포함해서 주민등록번호 15자를 입력해주세요."); 
			return;
			}
			
			// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력
			char sung = jumin.charAt(7);
			String gender = null;			// 
			
			if(sung=='1'||sung=='3'||sung=='9') {
				gender = "남자";
				// System.out.println("남자");
			}else if(sung=='2'||sung=='4'||sung=='0'){
				gender = "여자";
				// System.out.println("여자");
			}
			tfGender.setText(gender);
			
			// (2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
			char chul = jumin.charAt(8);
			
			switch (chul) {								
				case '0': tfHome.setText("서울"); break;
				case '1': tfHome.setText("경기"); break;
				case '2': tfHome.setText("대전"); break;
				case '3': tfHome.setText("광주"); break;
				case '4': tfHome.setText("부산"); break;
				case '5': tfHome.setText("세종"); break;
				case '6': tfHome.setText("경상"); break;
				case '7': tfHome.setText("충남"); break;
				case '8': tfHome.setText("강원"); break;
				case '9': tfHome.setText("제주"); break;
			}
			
			// (3) 주민번호에서 연도에 의해 나이를 구해서 나이창에 출력
			String num  = jumin.substring(0, 2);			// 주민번호 앞 4자리 잘라서 num으로 저장
			int num1 	= Integer.parseInt(num);			// 형 변환(String → int)_연도 계산 필요로 정수로 변경
			int age 	= 0;
			
			Calendar c = Calendar.getInstance(); 			// 현재 시스템에 설정된 연도를 c에 입력		
			int year = c.get(Calendar.YEAR); 				// 시스템상 연도를 c에 저장 → year로 받음 
			
			if(sung=='0'||sung=='9') {
				age = year - (1800+num1);
			} else if(sung=='2'||sung=='1') {
				age = year - (1900+num1);
			} else if(sung=='4'||sung=='3'){
				age = year - (2000+num1);
			}
			tfAge.setText(String.valueOf(age));
			
		} // end of getJuminInfo()
		
	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}

}
