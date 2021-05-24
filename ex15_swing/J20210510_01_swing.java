package ex15_swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//SWING 패키지를 이용한 GUI화면 만들기
public class J20210510_01_swing extends JFrame {
	J20210510_01_swing(){
		//프레임 만들기
		super("JFrame 테스트");
		setTitle("JFrame테스트");
		setSize(500,300);
		
		//텍스트 올리기 (컴포넌트 만들기)
		JTextField tf = new JTextField();  //텍스트 박스
		JButton button = new JButton("무야호~");
		
		//컴포넌트를 올릴 컨테이너 생성
		Container con = getContentPane();
		//컴포넌트를 컨테이너에 추가
		con.add(tf,"North");
		con.add(button,"South");
		
		
		
		setVisible(true); //화면에 보이게
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //윈도우가 종료될때 강제 종료
		
	}
	
	public static void main(String[] args) {
		J20210510_01_swing myframe = new J20210510_01_swing();
		

	}

}
