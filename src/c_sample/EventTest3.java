package c_sample;

import java.awt.FlowLayout;
// event의 경우 하위폴더기때문에 다른 패키지로 처리함(일일이 임포트 필요)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * 화면(JPrame)에 '확인' 버튼 하나 출력
 * */

public class EventTest3 {
	// 멤버 변수 선언
	JFrame 	f;
	JButton btn;
	
	EventTest3(){
		// 생성
		f 	= new JFrame("EventTest");
		btn = new JButton("확인");
	// (1) 이벤트 핸들러 만들기
	// 		핸들러 - 이벤트 처리 클래스	
	// (2) 핸들러 객체 생성
	//★(3) 이벤트 발생할 컴포넌트와 연결 (이벤트 처리 시 복사해서 사용하기)
		btn.addActionListener(new ActionListener() {	// 이너클래스($표기)_이벤트의 경우 이너클래스에 많이 사용
			@Override
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(null, "이벤트 발생3");		// 팝업 발생
				
			}	
			
		} );
	}
	
	
	public void addLayout() {
		// 붙이기
		f.setLayout(new FlowLayout());
		f.add(btn);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		EventTest3 et = new EventTest3();
		et.addLayout();
	}

}
