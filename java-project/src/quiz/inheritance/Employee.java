package quiz.inheritance;

public class Employee {
	private String empno;
	private String name;
	private String dept;
	private String phone;
	public Employee() {
		
	}
	public Employee(String empno, String name, String dept, String phone) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getPhone() {
		return phone;
	}
	public void disp() {
		System.out.printf("사번\t: %s\n이름\t: %s\n부서\t: %s\n연락처\t: %s\n", empno, name, dept, phone);
	}
}
