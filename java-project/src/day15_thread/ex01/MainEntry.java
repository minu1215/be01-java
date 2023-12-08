package day15_thread.ex01;

public class MainEntry {
	public static void main(String[] args) {

		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
//		t1.run();	// X (명시적으로 불러서)
		t1.start();	// run() 유도
		t2.start();
		t3.start();
		
	}
}
