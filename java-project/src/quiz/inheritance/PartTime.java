package quiz.inheritance;

public class PartTime extends Employee{
	private int workDay;
	private int timePay;
	
	public PartTime() {
		this.workDay = 0;
		this.timePay = 0;
	}
	public PartTime(String empno, String name, String dept, String phone, int workDay, int timePay) {
		super(empno, name, dept, phone);
		this.workDay = workDay;
		this.timePay = timePay;
	}
	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	public int getWorkDay() {
		return this.workDay;
	}
	public int getTimePay() {
		return this.timePay;
	}
	public void disp() {
		System.out.println("PartTime");
		super.disp();
		System.out.printf("급여\t: %d\n", getWorkDay()*getTimePay());
	}

}
