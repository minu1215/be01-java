package quiz.collection.list;
//문제] Customers class
//name, address, tel field
//생성자함수, setter/getter method
public class Customers {
	String name;
	String address;
	String tel;
	
	public Customers() {
		this.name = "noName";
		this.address = "Seoul";
		this.tel = "010-0000-0000";
	}
	public Customers(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}	
}
