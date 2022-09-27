package a_sample;

import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.ButtonGroup;
/*
 * 자바의 GUI(화면)
 * 	- AWT: 1.2 이전
 * 	- Swing: 1.2 이후
 * 		대부분 클래스 앞에 J
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {

	JFrame f;			// 프레임
	JButton btn, c_btn;	// 버튼 
	Checkbox java_ckb, oracle_ckb;	// 체크박스
	JRadioButton fm_radio, m_radio;	// 라디오버튼
	JTextField tf;
	JTextArea ta;
	
	ATest(){
		f = new JFrame("나의 첫 창");				// 생성자 타이틀 초기화_프레임
		btn = new JButton("클릭");				// 버튼 객체 생성
		c_btn = new JButton("취소");				// 취소 버튼 객체 생성
		java_ckb = new Checkbox("Java");	 	// 자바 체크박스 생성
		oracle_ckb = new Checkbox("Oracle");	// 오라클 체크박스 생성
		fm_radio = new JRadioButton("female");	// female 라디오 버튼 생성
		m_radio = new JRadioButton("male");		// male 라디오 버튼 생성
		ButtonGroup group = new ButtonGroup();	// 지역변수 (멤버 변수로 만들 필요 없음_한 번만 사용하면 되기때문에)
		group.add(fm_radio);
		group.add(m_radio);
		tf = new JTextField(20);				// 텍스트 필드 객체 생성(한 줄 입력)
		ta = new JTextArea(5, 20);				// 텍스트 에어리어 객체 생성(여러 줄 입력)
		
	}
	
	void addLayout() {
		// f.setLayout(new FlowLayout());		// 자유롭게 일렬로 정렬(한 줄 배치)
		// f.setLayout(new GridLayout(3, 3));	// 3행 3열에 맞춰서 정렬(행, 열 배치)
		// f.setLayout(new BorderLayout());		// 동, 서, 남, 북 가운데 배치
		
		// 붙이기 작업
		f.add(btn, BorderLayout.NORTH);			// 클릭 버튼 북쪽에 배치
		f.add(c_btn, BorderLayout.SOUTH);		// 취소 버튼 남쪽에 배치
		//f.add(java_ckb);						// Java 체크 박스_다중 선택 가능
		//f.add(oracle_ckb);					// Oracle 체크 박스
			JPanel pEast = new JPanel();
			pEast.add(fm_radio);
			pEast.add(m_radio);
		f.add(pEast, BorderLayout.EAST);
		
			
		f.add(fm_radio	, BorderLayout.EAST);			// female 라디오 버튼_ 중복 체킹 불가
	//	f.add(m_radio	, BorderLayout.EAST);				// male 라디오 버튼
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);
		//f.add(tf);
		f.add(ta		, BorderLayout.CENTER);
		
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 눌렀을 때 프레임 종료
	}
	
	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();

	}

}
