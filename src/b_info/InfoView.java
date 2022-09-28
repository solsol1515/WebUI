package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
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
	JTextField tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	ArrayList<PersonVO> list = new ArrayList<PersonVO>(); // generics로 노딱 지움(명확하게)
	
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
					 inputData();
					 clearTextField();
					 selectAll(); // 정보 입력 후 Add버튼 누를 경우, ta에 입력한 정보 출력됨
				}	
			} );
		
			bShow.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					selectAll(); // (위의 Add에도 selectAll() 호출이 되기때문에)Show버튼 누를 경우, ta에 입력한 정보 출력됨
				}	
			} );
			
			bSearch.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					selectByTel();
				}	
			} );
			
			// 전화번호 입력 후 텍스트 필드에서 엔터 쳤을 때
			tfTel.addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent e) {
					selectByTel();
				}	
			} );
			
			
			bDelete.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
				public void actionPerformed(ActionEvent e) {
					//selectAll();
					deleteByTel();
					clearTextField();
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
		
		// 'ADD' 버튼 눌렸을 때 텍스트 필드에 입력한 사용자의 값들을 PersonVO에 저장하기
		void inputData() {
			// (1) 각각의 텍스트 필드의 입력값 얻어오기
				// String name = tfName.getText(); (1)과 (2) 따로 쓸 때 사용
				// String id = tfId.getText();
				//tfTel.getText();
				//tfGender.getText();
				//tfAge.getText();
				//tfHome.getText();
			
			// (2) 1번의 값들을 PersonVO에 멤버변수에 저장(setter / constructor)
				PersonVO vo = new PersonVO();
				vo.setName(tfName.getText());
				vo.setId(tfId.getText());
				vo.setTel(tfTel.getText());
				vo.setGender(tfGender.getText());
				vo.setAge(Integer.parseInt(tfAge.getText()));
				vo.setHome(tfHome.getText());
				
				list.add(vo); // 입력받은 값 ArrayList에 저장
				
		} // end of inputData()
		

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
		
		/*
		 리스트에 저장된 정보를 모두 텍스트 에어리어에 출력 
		 */
		void selectAll() {
			ta.setText("-------------------- 전체 목록 --------------------\n"); // 저장 후 show로 입력한 정보 보기위해서 show 눌렀을 때 저장된 값이 중복되서 계속 출력되는 것을 방지하기 위해서 settext
			for(PersonVO vo : list) { // list의 값을 vo에 저장
				ta.append(vo.toString()); // ta에 vo의 값을 출력(vo를 형변환해서) settext쓸 경우, 전에 저장했던 정보가 초기화되기때문에 데이터 누적을 위해 append 사용 
			}
		} // end of selectAll()
		
		/*
		 * 함수명	: selectByTel
		 * 인자	: 없음
		 * 리턴값	: void
		 * 역할	: search버튼 눌렸을 때 개인 정보 호출, 전화번호 입력 후 엔터 쳤을 때 개인 정보 호출	 ???
		 * */
		void selectByTel() {
			// 입력한 전화번호 값 얻어오기
			String tel = tfTel.getText(); // 가져온 전화번호 값 String tel에 저장
			
			// 입력 받은 전화번호가 공백이라면(if문) 메세지 창("전화번호를 입력하세요") 띄우기
			if(tel.equals("")) {
				JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
				return;
			}
			
			// 리스트에 저장된 PersonVO의 전화번호와 비교 
			// 해당 전화번호가 있을 경우, 그 내용을 각각의 텍스트필드에 출력
				for(PersonVO vo : list) {
					if(tel.equals(vo.getTel())) { 
						tfName.setText(vo.getName());
						tfId.setText(vo.getId());
						tfTel.setText(vo.getTel());
						tfGender.setText(vo.getGender());
						tfAge.setText(Integer.toString(vo.getAge()));
						tfHome.setText(vo.getHome());
					} // end of if (텍스트필드에 입력한 전화번호와 vo에 저장된 전화번호 비교)
				} // end of for 
		} // end of selectByTel()
		
		void deleteByTel() {
			// 입력한 전화번호 값 얻어오기 	
			String tel = tfTel.getText();
			
			// 입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지 창 출력
			if(tel.equals("")) {
				JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
				return;
			}
			// 리스트에 저장된 PersonVO의 전화번호와 비교하여 
			// 해당 전화번호가 있으면 해당하는 PersonVO를 리스트에서 삭제
			// (참고) 삭제하고 나서 break로 반복문 끝내기
			// 파일 저장 or 데이터베이스에 저장(Oracle)
			for(PersonVO vo : list) {
				if(tel.equals(vo.getTel())) { 
					list.remove(vo);
					break;
				}
			}
		}
		
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
