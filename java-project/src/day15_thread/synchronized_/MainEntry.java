package day15_thread.synchronized_;

class Atm {
	private int money;

	public Atm(int money) {
		this.money = money;
	}

	// 입금 함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 " + amount);
	}

	// 출금 함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if ((money - amount) >= 0) {
				Thread.yield();
				money -= amount;
				System.out.println(name + " : 출금금액 " + amount);
			} else {
				System.out.println(name + " : 출금 X(잔액 부족)");
			}
		}
	}

	public void getMoney() {
		System.out.println("잔액 : " + money);
	}
} // Atm end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;

	UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (flag) {
				obj.deposit((int) (Math.random() * 10 + 1) * 100, getName());
			} else {
				obj.withdraw((int) (Math.random() * 10 + 1) * 100, getName());
			}
			flag = true;
			obj.getMoney();
		}
	}

} // UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm atm = new Atm(1000);
		UserAtm user1 = new UserAtm(atm, "김연아");
		UserAtm user2 = new UserAtm(atm, "박태환");
		UserAtm user3 = new UserAtm(atm, "강감찬");

		user1.start();
		user2.start();
		user3.start();
	}
}
