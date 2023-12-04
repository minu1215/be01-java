package day09_abstract.quiz;

public abstract class Trans {
	String name;
	public abstract void start();
	public abstract void stop();	
}

class Subway extends Trans{

	@Override
	public void start() {
		System.out.println("Subway가 출발하였습니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Subway가 도착하였습니다.");		
	}
	
}

class Bus extends Trans{

	@Override
	public void start() {
		System.out.println("Bus가 출발하였습니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Bus가 도착하였습니다.");		
	}
	
}

class Bicycle extends Trans{

	@Override
	public void start() {
		System.out.println("Bicycle이 출발하였습니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Bicycle이 도착하였습니다.");		
	}
	
}

class Plain extends Trans{
	@Override
	public void start() {
		System.out.println("Plain이 출발하였습니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Plain이 도착하였습니다.");		
	}
	
}