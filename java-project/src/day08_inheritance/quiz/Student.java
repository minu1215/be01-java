package day08_inheritance.quiz;

public class Student extends Person{
	int score;
	public Student() {
		
	}
	public Student(String name, String gender, int age, int score) {
		super(name, gender, age);
		this.score = score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void display() {
		super.display();
		System.out.printf("성적\t: %s\n", score);
	}
}