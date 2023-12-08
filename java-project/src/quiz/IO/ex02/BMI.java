package quiz.IO.ex02;

import java.io.Serializable;

public class BMI implements Serializable {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String bmiCase;
	public BMI() {		
		
	}
	
	public BMI(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
		calBMI();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void calBMI() {
		bmi = weight/Math.pow((height/100), 2);
		calBMICase();
	}
	public void calBMICase() {
		if(bmi < 18.5) bmiCase = "저체중";
		else if(bmi >= 18.5 && bmi < 23) bmiCase = "정상";
		else if(bmi >= 23 && bmi < 25) bmiCase = "과체중";
		else bmiCase = "비만";		
	}
	public double getBMI() {
		return bmi;
	}
	public String getBMICase() {
		return bmiCase;
	}
	
}
