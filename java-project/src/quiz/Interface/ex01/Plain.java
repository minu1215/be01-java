package quiz.Interface.ex01;

public class Plain implements Trans {

	@Override
	public void start() throws InterruptedException {
		System.out.println("비행기가 이륙 준비중입니다...");
		t.sleep(r.nextInt(3000));
		System.out.println("비행기가 이륙합니다.");
	}

	@Override
	public void stop() throws InterruptedException {
		System.out.println("비행기가 착륙 준비중입니다...");
		t.sleep(r.nextInt(3000));
		System.out.println("비행기가 착륙합니다.");
	}

}
