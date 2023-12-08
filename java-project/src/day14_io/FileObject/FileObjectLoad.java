package day14_io.FileObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileObjectLoad {
	public static void main(String[] args) throws IOException {
		
		String name, id, pwd, temp, phone;
		int age = 0;
		boolean gender = true;
		name = id = pwd = temp = phone = null;
		
		File f = new File("./day14/members.txt");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			
			name = (String)ois.readObject();
			id = (String)ois.readObject();
			pwd = (String)ois.readObject();
			gender = (Boolean)ois.readObject();
			age = (Integer)ois.readObject();
			phone = (String)ois.readObject();
			
			System.out.println("\t\t\t >> 회원정보 << \n");
			System.out.println("Name \t ID \t PWD \t Gender \t Age \t PhoneNumber");
			System.out.println();
			System.out.print(name + " \t " + id + " \t " + pwd + " \t ");
			if(gender) System.out.print("남자");
			else System.out.print("여자");
			System.out.println(" \t\t " + age + " \t " + phone);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
