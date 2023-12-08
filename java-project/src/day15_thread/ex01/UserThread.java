package day15_thread.ex01;

public class UserThread extends Thread {

	String name;
	public UserThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {	// 스레드 실행부(구현부)
		
		for(int i = 1; i <= 10; i++) {
			
			if(i == 3) {
				try {
					sleep(1000);	// 예외발생, ms
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name);
			}
			System.out.println(name + " : " + i);
		}
//		super.run();	// 부모가 갖고 있는 run() 호출
	}	
}
