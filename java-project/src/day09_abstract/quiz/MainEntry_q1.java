package day09_abstract.quiz;

public class MainEntry_q1 {
	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		
		Object[] name = {new Subway(), new Bus(), new Bicycle(), new Plain()};
		
		for(int i = 0; i < trans.length; i++) {
			trans[i] = (Trans)name[i];
			trans[i].start();
			trans[i].stop();
		}
		
//		Trans[] trans = new Trans[4];
//		trans[0] = new Subway();
//		trans[1] = new Bus();
//		trans[2] = new Bicycle();
//		trans[3] = new Plain();
//		
//		for(Trans t : trans) {
//			t.start();
//			t.stop();
//		}
	}
}
