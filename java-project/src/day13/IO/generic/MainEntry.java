package day13.IO.generic;

import java.awt.Point;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs", "director"};
		t1.set(str);	t1.print();
		System.out.println("===========================");
		
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5,6,7,8};
		t2.set(num);	t2.print();
		System.out.println("===========================");
		
		// Double type
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] double_num = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		t3.set(double_num);	t3.print();
		System.out.println("===========================");
		
		GenericEx<Object> t4 = new GenericEx<>();
		Object[] obj = {"12.45", 2, new Date(), 47.2, 5.5, "text", new Point()};
		t4.set(obj);	t4.print();
		System.out.println("===========================");
		
	}
}


/*
class GenericEx<T, U>{
	T x;
	U y;
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getX() {
		return x;
	}
	
	public void setY(U y) {
		this.y = y;
	}
	
	public U get() {
		return y;
	}
}
*/