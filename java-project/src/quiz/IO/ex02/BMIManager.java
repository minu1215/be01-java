package quiz.IO.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class BMIManager {
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private static int number = 1;
	private TreeMap<Integer, BMI> map = new TreeMap<>();
	private Scanner sc = new Scanner(System.in);
	public BMI addBMI(char ch) {
		System.out.println("\n\n정보를 입력하세요.");
		System.out.print("\n이름\t>> ");
		String name = sc.nextLine();
		System.out.print("키\t>> ");
		Double height = Double.parseDouble(sc.nextLine());
		System.out.print("몸무게\t>> ");
		Double weight = Double.parseDouble(sc.nextLine());		
		BMI bmi = new BMI(name, height, weight);
		if(ch == 'a') {
			map.put(number++, bmi);		
			printBMI(number);
			System.out.println("\n\n추가되었습니다.\n\n");			
		}
		return bmi;
	}
	public void delBMI() {
		System.out.println("\n\n삭제할 번호를 입력하세요.");
		System.out.print("\n번호\t>> ");		
		int num = Integer.parseInt(sc.nextLine());
		if(map.containsKey(num)) {
			map.remove(num);
			System.out.println("\n\n삭제되었습니다.\n\n");
		}
		else {
			System.out.println("\n\n목록에 없는 번호입니다.\n\n");			
		}
	}
	public void editBMI() {
		System.out.println("\n\n수정할 번호를 입력하세요.");
		System.out.print("\n번호\t>> ");		
		int num = Integer.parseInt(sc.nextLine());
		if(map.containsKey(num)) {
			map.replace(num, addBMI('e'));
			printBMI(num);
			System.out.println("\n\n변경되었습니다.\n\n");
		}
		else {
			System.out.println("\n\n목록에 없는 번호입니다.\n\n");			
		}
	}
	public void printBMI(int num) {
		System.out.println("=================");
		System.out.println("번호\t: " + num);			
		System.out.println("이름\t: " + map.get(num).getName());
		System.out.println("키\t: " + map.get(num).getHeight());
		System.out.println("몸무게\t: " + map.get(num).getWeight());
		System.out.println("BMI\t: " + map.get(num).getBMI());
		System.out.println("상태\t: " + map.get(num).getBMICase());
		System.out.println("=================");			
	}
	public void printAllBMI() {
		if(map.size() == 0) {
			System.out.println("\n\n목록이 비었습니다.\n\n");
			return;
		}
		for(int num : map.keySet()) {
			System.out.println("=================");
			System.out.println("번호\t: " + num);			
			System.out.println("이름\t: " + map.get(num).getName());
			System.out.println("키\t: " + map.get(num).getHeight());
			System.out.println("몸무게\t: " + map.get(num).getWeight());
			System.out.println("BMI\t: " + map.get(num).getBMI());
			System.out.println("상태\t: " + map.get(num).getBMICase());
			System.out.println("=================");			
		}
	}
	public void saveBMI() throws FileNotFoundException, IOException {
		String fileName;
		System.out.print("\n\n저장할 파일 이름을 입력하세요. : ");
		fileName = sc.nextLine();
		oos = new ObjectOutputStream(new FileOutputStream(fileName));
		oos.writeObject(map);
		System.out.println("\n\n" + fileName + " 파일 저장이 완료되었습니다.\n\n");
		oos.close();
	}
	public void loadBMI() throws FileNotFoundException, IOException, ClassNotFoundException {
		String fileName;
		System.out.print("\n\n불러올 파일 이름을 입력하세요. : ");
		fileName = sc.nextLine();
		File file = new File(fileName);
		if(!file.exists()){ // 저장된 파일이 없으면
			System.out.println("\n\n" + fileName + " 파일이 없습니다.\n\n");
			return;
		}

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		map = (TreeMap<Integer, BMI>) ois.readObject();
		System.out.println("\n\n" + fileName + " 파일을 불러왔습니다.\n\n");
		number = map.lastKey();
		number++;
		ois.close();
	}
}
