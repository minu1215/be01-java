package quiz.Interface.ex01;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("자전거 출발");
	}

	@Override
	public void stop() {
		System.out.println("자전거 도착");
	}

}
