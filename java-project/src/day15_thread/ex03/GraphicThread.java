package day15_thread.ex03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	//Thread 이외 상속받아서 run 재정의 못할경우 implements Runnable
	
	int num, x, y;
	Color color;
	Random random;
	
	public GraphicThread(int num) {	// 생성자함수 - 초기화
		this.num = num;
		color = Color.BLUE;
		random = new Random();
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		float[] rgb = null;
		float[] hsb = Color.RGBtoHSB(r, g, b, rgb);
		color = Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
		setSize(500, 400);	// 프레임(화면) 크기 - 너비, 높이
		setVisible(true);	// 화면 보여주기
		setLocation(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 닫기
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 3, 3);
	}

	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for(int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
	public static void main(String[] args) {
		//1.
//		GraphicThread gt = new GraphicThread(10);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		new Thread(new GraphicThread(500)).start();
	}

}
