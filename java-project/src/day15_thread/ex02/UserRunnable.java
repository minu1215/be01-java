package day15_thread.ex02;

public class UserRunnable implements Runnable {

	String name;

	public UserRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)

//		System.out.println(name + " runnable run() call!!!");

		for (int i = 1; i < 11; i++) {
			if (i == 4) {
				try {
					Thread.sleep(500); // 예외발생
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
			System.out.println(name + ", " + i);
		}

	}

}
