package quiz.inheritance;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("1", "emp", "dept1", "010-0000-0000");
		Regular regular = new Regular("2", "regular", "dept2", "010-1111-1111", 1000);
		Sales sales = new Sales("3", "sales", "dept3", "010-2222-2222", 2000, 20);
		PartTime partTime = new PartTime("4", "partTime", "dept4", "010-3333-3333", 10, 20);
		
		emp.disp();
		System.out.println("====================");
		regular.disp();
		System.out.println("====================");
		sales.disp();
		System.out.println("====================");
		partTime.disp();
	}
}
