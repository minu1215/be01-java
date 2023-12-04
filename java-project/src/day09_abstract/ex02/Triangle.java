package day09_abstract.ex02;

public class Triangle extends Shape{

	@Override
	public double calc(double x) {
		result = Math.sqrt(3)*x*(x/2)/2;
		return 0;
	}

	@Override
	public void show(String name) {
		calc(10);
		System.out.println(result + " 넓이의 " + name + "을 그렸습니다.");
	}

}
