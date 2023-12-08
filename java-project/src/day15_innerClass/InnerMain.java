package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.PriorityQueue;

public class InnerMain{
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");	// 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//2.
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action Event 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("익명 클래스 이벤트 처리");
			}
		});

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {	// 닫기
				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
			}			
		});
		frame.add(btn);	// 프레임(윈도우)에 버튼 컴포턴트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}

/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain{
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");	// 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//2.
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action Event 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("익명 클래스 이벤트 처리");
			}
		});
		
		frame.add(btn);	// 프레임(윈도우)에 버튼 컴포턴트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
*/
/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {
	
	//~Adapter Class 기반 ~Listener Interface 기반
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Action Event 발생했습니다.");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println("--------------------");
		}		
	}
	public static void main(String[] args) {
		
		Frame frame = new Frame("이벤트 처리 - 이너클래스");	// 프레임(화면)
		Button btn = new Button("Button - Start");
		
		//1.
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler);
		
		frame.add(btn);	// 프레임(윈도우)에 버튼 컴포턴트를 추가
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}
*/