package day09_interface.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		BB b = new BB();
		b.draw();
		b.show();
		
		//2.
		IDraw bb = new BB();
		bb.draw();
//		bb.show();	//안됨(IDraw에는 show() 미존재)
	}
}
