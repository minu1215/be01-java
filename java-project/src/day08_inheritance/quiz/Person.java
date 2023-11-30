package day08_inheritance.quiz;

public class Person {
	private String name;
	private String gender;
	private int age;
	public Person() {
		
	}
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public void display() {
		System.out.printf("이름\t: %s\n성별\t: %s\n나이\t: %d\n", name, gender, age);
	}
}
