package day07_oop.quiz;
/*
	> 생성자함수(constructor method)
	- 클래스명과 동일하다
	- 리턴타입 없음 ( void 조차 사용하지 않음 )
	- 중복정의 가능함 ( overload 가능 - 중복함수 )
	- default constructor 갖고 있음
	  (단, 사용자가 생성자함수 재정의하면 디폴트 생성자함수 생성되지않음)
	- 멤버변수의 초기화 담당함
*/
public class TV {
	// color, channel
	String color;
	int channel;
	
	public TV() {
		color = "gray";
		channel = 11;
	}
	public TV(String color) {
		this.color = color;
	}
	public TV(int channel) {
		this.channel = channel;
	}
	public TV(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	// getter / setter method
	public void setColor(String color) { this.color = color; }
	public void setChannel(int channel) { this.channel = channel; }
	public String getColor() { return color; }
	public int getChannel() { return channel; }
	
	// output
	public void output() {
		System.out.printf("TV 색상\t: %s\n채널 정보\t: %d\n", color, channel);
	}
}
