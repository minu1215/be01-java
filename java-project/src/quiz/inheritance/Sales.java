package quiz.inheritance;

public class Sales extends Regular{
	private double comm;
	public Sales() {
		this.comm = 10;
	}
	public Sales(String empno, String name, String dept, String phone, double comm) {
		super(empno, name, dept, phone);
		this.comm = comm;
	}
	public Sales(String empno, String name, String dept, String phone, int pay, double comm) {
		super(empno, name, dept, phone, pay);
		this.comm = comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public double getComm() {
		return comm;
	}
	public void disp() {
		super.disp();
		System.out.printf("총급여\t: %d\n", getPay()+(int)(getPay()*(comm/100)));
	}
}
