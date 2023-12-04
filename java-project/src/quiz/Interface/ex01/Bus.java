package quiz.Interface.ex01;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("버스가 출발합니다.");
	}

	@Override
	public void stop() throws InterruptedException {
		System.out.println("버스가 정류소에 도착하는 중입니다...");
		t.sleep(r.nextInt(3000));
		System.out.println("버스가 도착하였습니다.");
	}

}
