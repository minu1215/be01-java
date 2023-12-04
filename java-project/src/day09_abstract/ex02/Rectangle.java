package day09_abstract.ex02;

public class Rectangle extends Shape{
	
	public double calc(double x) {
		result = x*x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(10);
		System.out.println(result + " 넓이의 " + name + "을 그렸습니다.");
	}

}
