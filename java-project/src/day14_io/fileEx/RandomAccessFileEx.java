package day14_io.fileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws IOException {
		String path = "./day14/";
		RandomAccessFile raf = new RandomAccessFile(path + "sawon.txt", "rw");
//		RandomAccessFile raf = new RandomAccessFile(path + "sawon.txt", "r");
		
		for(int i = 1; i <= 10; i++) {
			raf.seek(i*200);	// 예외 발생
			String str = "hello";
			raf.writeUTF(str + i);			
//			raf.writeInt(i);
		}
		
		for(int i = 1; i <= 10; i++) {
			raf.seek(i*100);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		System.out.println("string print success!!");
		raf.close();
	}
}
