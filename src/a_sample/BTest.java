package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame{		// 부모 클래스는 only 1개 (정체성 혼란)

	JButton btn;						// 선언
	
	BTest(){							// 생성자 생성
		super("나의 두 번째 창");			// 부모 클래스 상속받기
		btn = new JButton("확인");
	}
	void addLayout() {					// return 없으므로 void 
		// 붙이기 작업
		add(btn);
		
		// 화면 출력
		setBounds(100, 100, 500, 350);	// 화면 크기 조정
		setVisible(true);				// 화면 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼으로 화면  종료
	}
	
	public static void main(String[] args) {
		
		BTest b = new BTest();			// BTest()의 값을 b로 저장
		b.addLayout();					// 받은 데이터를 addLayout에서 출력?

	}

	
}
