package day07_oop.quiz;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.output();
		tv.setColor("초록");
		tv.setChannel(11);
		tv.output();
	}
}
