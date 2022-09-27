package d_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {

	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tf;
	JButton []bNum = new JButton[10]; 	// 0~9 숫자 표현 버튼
	JButton []bOp  = new JButton[4];	// +, -, *, / 연산자 표현 버튼
	JButton bEqual;						// = 계산 결과 출력
	int first, second;					// 처음 입력하는 숫자, 두 번째 입력하는 숫자
	String op;

	// 2. 객체 생성
	CalTest(){ // 생성자
		f = new JFrame("계산기"); 		// 프레임 생성
		tf = new JTextField(15);		// 텍스트 필드 생성
		bEqual = new JButton("=");	
		bNum = new JButton[10];
		for(int i=0; i<bNum.length; i++) {
			bNum[i] = new JButton(String.valueOf(i)); // bNum에 저장된 값을 String으로 변환
		}
		bOp[0] = new JButton("+");
		bOp[1] = new JButton("-");
		bOp[2] = new JButton("*");
		bOp[3] = new JButton("/");

	} // end of CalTest()

	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		f.setLayout(new BorderLayout());
		JPanel pCenter = new JPanel(new GridLayout(5, 3)); // 5행 3열 pCenter
		//pCenter.setPreferredSize(new Dimension(250, 100));
		for(int i=0; i<bNum.length;i++) {
			pCenter.add(bNum[i]);
		}

		pCenter.add(bOp[0]);
		pCenter.add(bNum[0]);
		pCenter.add(bEqual);
		pCenter.add(bOp[1]);
		pCenter.add(bOp[2]);
		pCenter.add(bOp[3]);

		f.add(tf, BorderLayout.NORTH); // textField 상단 배치
		f.add(pCenter, BorderLayout.CENTER); // pCenter(JButton_숫자, 연산자) 중앙 배치

		// 화면 출력
		f.setBounds(100, 100, 250, 250); // 프레임 경계 설정
		f.setVisible(true); // 화면 볼 수 있게 true값으로 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 눌렀을 때 프레임 종료

	} // end of addLayout()

	// 4. 이벤트 처리
	void eventProc() {

		// "숫자" 버튼이 눌렸을 때
		for(int i=0; i<bNum.length;i++) {

			bNum[i].addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent e) {

					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();
					String su = tf.getText()+eBtn.getText(); // 

					tf.setText(su);

				} // end of actionPerformed	

			} ); // end of addActionListener 

		} // end of for

		// "연산자" 버튼이 눌렸을 때
		for(int i=0; i<bOp.length; i++) {

			bOp[i].addActionListener(new ActionListener() {	
				public void actionPerformed(ActionEvent e) {

					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();

					op = eBtn.getText(); // 연산자
					first = Integer.parseInt(tf.getText());
					tf.setText(null);
				} // end of actionPerformed	

			} ); // end of addActionListener 

		} // end of for

		// "=" 버튼이 눌렸을 때
		bEqual.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
			public void actionPerformed(ActionEvent e) {

				second = Integer.parseInt(tf.getText());
				int result = 0;

				switch(op) {
				case "+": result = first + second; break;
				case "-": result = first - second; break;
				case "*": result = first * second; break;
				case "/": result = first / second; break;
				}

				tf.setText(String.valueOf(result));

			} // end of actionPerformed		

		} ); // end of add.ActionListener()

	} // end of eventProc()

	public static void main(String[] args) {

		CalTest cal = new CalTest(); // 객체 생성
		cal.addLayout(); // 메소드 호출
		cal.eventProc(); // 메소드 호출
	}

}
