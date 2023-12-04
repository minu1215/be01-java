package day09_staticMember;

class Atm{
	private int count;	// instance member
	static int total;	// static member
	
	public Atm(int amount) {	// constructor
		count += amount;	// count = count + amount;
		total += amount;	// total = total + total;
	}
	
	public static void view() {
//		count = count + 100;	// static method에서는 일반(instance) 멤버 변수는 사용할 수 없다
		total = total + 100;
	}
	public void display() {
		count = count + 200;	// instance method에서는 둘 다 사용 가능하다
		total = total + 200;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}	// Atm class end
public class MainEntry {
	public static void main(String[] args) {
		System.out.println("CREATE ATM1 AND DISPLAY");
		Atm atm1 = new Atm(1000);
		atm1.display();	// c :	, t : 
		System.out.println("CREATE ATM2 AND DISPLAY");
		Atm atm2 = new Atm(1000);
		atm2.display();

		System.out.println("ATM1 DISPLAY");
		atm1.display();
		System.out.println("ATM2 DISPLAY");
		atm2.display();
	}
}
