package quiz.Interface.ex01;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		Trans[] trans = {new Subway(), new Bus(), new Bicycle(), new Plain()};
		for(Trans t : trans) {
			t.start();
			t.stop();
			System.out.println("=====================");
		}
	}
}
