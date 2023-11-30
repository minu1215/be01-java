package quiz.inheritance;

public class Regular extends Employee{
	private int pay;
	public Regular() {
		this.pay = 500;
	}
	public Regular(String empno, String name, String dept, String phone) {
		super(empno, name, dept, phone);
	}
	public Regular(String empno, String name, String dept, String phone, int pay) {
		super(empno, name, dept, phone);
		this.pay = pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	public void disp() {
		super.disp();
		System.out.printf("급여\t: %d\n",pay);
	}
}
